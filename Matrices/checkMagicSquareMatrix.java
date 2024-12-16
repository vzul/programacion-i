static boolean checkMagic(int[][] m) {
        
    boolean magic = true;
    int sumPrincipal = 0;
    int sumSecondary = 0;
    
    // Calculate diagonal sums
    for (int i = 0; i < m.length; i++) {
        sumPrincipal += m[i][i];
        sumSecondary += m[i][m.length - 1 - i];
    }
    
    // First check: diagonal sums must be equal
    if (sumPrincipal != sumSecondary) {
        return false;
    }
    
    // Calculate and check row sums
    for (int i = 0; i < m.length; i++) {
        int sumRows = 0;
        for (int j = 0; j < m.length; j++) {
            sumRows += m[i][j];
        }
        // Check if row sum matches diagonal sum
        if (sumRows != sumPrincipal) {
            magic = false;
        }
    }
    
    // Calculate and check column sums
    for (int j = 0; j < m.length; j++) {
        int sumColumns = 0;
        for (int i = 0; i < m.length; i++) {
            sumColumns += m[i][j];
        }
        // Check if column sum matches diagonal sum
        if (sumColumns != sumPrincipal) {
            magic = false;
        }
    }
    
    return magic;
}
