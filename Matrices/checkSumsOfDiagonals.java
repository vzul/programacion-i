static boolean checkSums(int[][] m) {
        int sumPrincipal = 0;
        int sumSecondary = 0;
        
        for (int i = 0; i < m.length; i++) {
            sumPrincipal += m[i][i];
            sumSecondary += m[i][m.length - 1 - i];
        }
        
        return sumPrincipal == sumSecondary;
    }
