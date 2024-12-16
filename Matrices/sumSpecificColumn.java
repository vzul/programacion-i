static int sumColumn(int[][] m, int column){
        
        int sum = 0;
        for(int i = 0; i < m.length; i++){
            sum += m[i][column];
        } return sum;
    }
