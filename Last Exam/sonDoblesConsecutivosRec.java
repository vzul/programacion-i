static boolean sonDoblesConsecutivos(int[] col) {
    return sonDoblesConsecutivosAux(col, 0);  // Start recursion from index 0
}

static boolean sonDoblesConsecutivosAux(int[] col, int n) {
    // Base case: If we've checked all pairs, return true
    if (n >= col.length - 1) {
        return true;  // All pairs checked successfully
    }
    
    // Check if the next element is double the current element
    if (col[n + 1] != col[n] * 2) {
        return false;  // If not, return false immediately
    }

    // Recursive call to check the next pair
    return sonDoblesConsecutivosAux(col, n + 1);  // Continue recursion with next index
}
