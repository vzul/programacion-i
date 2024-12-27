static int findMaxConsecutiveEvens(int[] arr) {
        int maxCount = 0; // To store the maximum count of consecutive evens
        int currentCount = 0; // To count the current sequence of evens

        for (int num : arr) {
            if (num % 2 == 0) { // Check if the number is even
                currentCount++;
                maxCount = Math.max(maxCount, currentCount);
            } else {
                currentCount = 0; // Reset count if number is odd
            }
        }

        return maxCount; // Return the maximum count
    }
