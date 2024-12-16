static int sumDiagonal(int[][] m){
        int sum = 0;
        for(int i = 0; i < m.length; i++){
                sum += m[i][i];
        } return sum;
    }
