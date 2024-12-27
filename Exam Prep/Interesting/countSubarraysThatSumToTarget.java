static int countSubarraysWithSum(int[] arr, int target) {
        int count = 0; // To store the number of subarrays
        int n = arr.length;

        // Iterate over all starting points
        for (int i = 0; i < n; i++) {
            int sum = 0; // Initialize sum for subarray starting at i

            // Iterate over all ending points for the current start
            for (int j = i; j < n; j++) {
                sum += arr[j]; // Add current element to sum

                // Check if the sum equals the target
                if (sum == target) {
                    count++;
                }
            }
        }

        return count;
    }
