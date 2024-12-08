// Wrapper method to start recursion
static int sumaElementos(int[] col) {
    return sumaElementosAux(col, 0);
}

// Recursive method to sum array elements
static int sumaElementosAux(int[] col, int i) {
    // Base case: when we've reached beyond the last index
    if (i >= col.length) {
        return 0;
    }
    
    // Recursive case: current element + sum of the rest
    return col[i] + sumaElementosAux(col, i + 1);
}
