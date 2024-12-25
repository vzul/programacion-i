public int[] minAnd2ndMin(int arr[]) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        
        for (int i = 0; i < arr.length; i++) {
        if (arr[i] < smallest) {
            // Update secondSmallest before updating smallest
            secondSmallest = smallest;
            smallest = arr[i];
        } else if (arr[i] > smallest && arr[i] < secondSmallest) {
            // Update secondSmallest if it's larger than smallest but smaller than current secondSmallest
            secondSmallest = arr[i];
        }
        }
        
        if (secondSmallest == Integer.MAX_VALUE) {
        return new int[]{-1}; // Optional: return [-1, -1] as a marker
    }
        return new int[]{smallest, secondSmallest};
    }
