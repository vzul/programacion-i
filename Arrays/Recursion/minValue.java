    // Wrapper method to start recursion
    static int minValue(int[] col) {
        if (col.length == 0) {
            throw new IllegalArgumentException("Array cannot be empty");
        }
        return minValueAux(col, 0);
    }

    // Recursive method to find the minimum value
    static int minValueAux(int[] col, int i) {
        // Base case: If this is the last element, return it
        if (i == col.length - 1) {
            return col[i];
        }

        // Recursive step: Find the minimum value in the rest of the array
        int restMin = minValueAux(col, i + 1);

        // Compare current element with the minimum of the rest
        if (col[i] < restMin) {
            return col[i];
        } else {
            return restMin;
        }
    }
