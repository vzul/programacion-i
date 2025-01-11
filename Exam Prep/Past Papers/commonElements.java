static int[] funcion(int[] col1, int[] col2){
    int[] resultado = new int[col1.length + col2.length]; // Maximum possible size
    int i = 0;  // Pointer for the result array
    int j = 0;  // Pointer for col1
    int k = 0;  // Pointer for col2
    
    while (j < col1.length && k < col2.length) { // Traverse both arrays
        if (col1[j] < col2[k]) { 
            j++;  // Move pointer in col1 if its current value is smaller
        } else if (col2[k] < col1[j]) {
            k++;  // Move pointer in col2 if its current value is smaller
        } else { 
            // If col1[j] == col2[k], add to result and increment all pointers
            resultado[i] = col1[j];
            j++;
            k++;
            i++;
        }
    }
    return resultado;  // Return the result array (possibly with trailing zeroes)
}
