// Kadane's Algorithm
static int maxConsecutiveSum(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty");
        }

        int maxSum = arr[0]; // To store the maximum sum found so far
        int currentSum = arr[0]; // To store the current subarray sum

        for (int i = 1; i < arr.length; i++) {
            // Include the current element in the subarray or start a new subarray
            currentSum = Math.max(arr[i], currentSum + arr[i]);
            // Update the maximum sum if the current subarray sum is greater
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }
