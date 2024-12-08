    // Wrapper method to start recursion
    static int maxValue(int[] col) {
        if (col.length == 0) {
            throw new IllegalArgumentException("Array cannot be empty");
        }
        return maxValueAux(col, 0);
    }

    // Recursive method to find the minimum value
    static int maxValueAux(int[] col, int i) {
        // Base case: If this is the last element, return it
        if (i == col.length - 1) {
            return col[i];
        }

        // Recursive step: Find the maximum value in the rest of the array
        int restMax = maxValueAux(col, i + 1);

        // Compare current element with the maximum of the rest
        if (col[i] > restMax) {
            return col[i];
        } else {
            return restMax;
        }
    }
