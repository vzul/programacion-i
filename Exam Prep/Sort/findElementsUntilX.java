static int[] insertionSort(int[] arr) {
        // Create a copy of the array to avoid modifying the original array
        int[] sortedArray = arr.clone();
        
        for (int i = 1; i < sortedArray.length; i++) {
            int current = sortedArray[i];
            int j = i - 1;

            // Shift elements of the sorted section to the right
            while (j >= 0 && sortedArray[j] > current) {
                sortedArray[j + 1] = sortedArray[j];
                j--;
            }
            // Place the current element in its correct position
            sortedArray[j + 1] = current;
        }

        return sortedArray; // Return the sorted array
    }

    static int countOfElements(int x, int[] arr) {
        int[] sortedArr = insertionSort(arr); // Sort the array
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < x) { // Count elements less than or equal to x
                count++;
            } 
        }
        return count;
    }
