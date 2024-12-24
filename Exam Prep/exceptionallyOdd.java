class Solution {
    // Helper function to check if a count is odd
    private boolean isOdd(int count) {
        return count % 2 != 0;
    }

    // Main function to find the number with an odd occurrence
    public int getOddOccurrence(int[] arr, int n) {
        // Sort the array to group identical elements together
        Arrays.sort(arr);

        int currentNum = arr[0]; // Track the current number
        int count = 0;           // Track occurrences of the current number

        // Iterate through the sorted array
        for (int num : arr) {
            if (num == currentNum) {
                count++; // Increment count for the current number
            } else {
                // Check if the previous number occurred an odd number of times
                if (isOdd(count)) return currentNum;

                // Reset for the new number
                currentNum = num;
                count = 1;
            }
        }

        // Check the last number in the array
        if (isOdd(count)) return currentNum;

        return 0; // Return 0 if no odd occurrences are found
    }
}
