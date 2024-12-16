static int sumRow(int[][] m, int row){
        int sum = 0;
        for(int i = 0; i < m.length; i++){
            sum += m[row][i];
        } return sum;
    }
