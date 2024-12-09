// Wrapper method
static int secondMax(int[] col) {
    if (col.length < 2) {
        throw new IllegalArgumentException("Array must have at least two distinct elements");
    }
    return secondMaxAux(col, 0, Integer.MIN_VALUE, Integer.MIN_VALUE);
}

// Recursive helper method
static int secondMaxAux(int[] col, int i, int max1, int max2) {
    // Base case: if we've processed the entire array
    if (i == col.length) {
        return max2;
    }

    // Update max1 and max2 based on the current element
    if (col[i] > max1) {
        max2 = max1;
        max1 = col[i];
    } else if (col[i] > max2 && col[i] != max1) {
        max2 = col[i];
    }

    // Recursive call for the next index
    return secondMaxAux(col, i + 1, max1, max2);
}
