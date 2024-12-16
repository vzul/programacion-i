static int sumSecondaryDiagonal(int[][] m){
        int sum = 0;
        for(int i = 0; i < m.length; i++){
                sum += m[i][m.length - 1 - i];
        } return sum;
    }
