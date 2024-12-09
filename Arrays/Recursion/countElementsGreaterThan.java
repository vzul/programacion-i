// Wrapper method to count elements greater than the given value
static int countGreaterThan(int[] col, int value) {
    return countGreaterThanAux(col, value, 0);
}

// Recursive helper method
static int countGreaterThanAux(int[] col, int value, int i) {
    // Base case: when we've reached the end of the array
    if (i == col.length) {
        return 0;
    }

    // Recursive case: Check if current element is greater than the value
    if (col[i] > value) {
        return 1 + countGreaterThanAux(col, value, i + 1);
    }

    // Otherwise, continue with the next index without incrementing the count
    return countGreaterThanAux(col, value, i + 1);
}
