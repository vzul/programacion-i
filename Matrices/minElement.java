    static int min(int[][] m){
        int min = m[0][0];
        for(int i = 0; i < m.length; i++){
            for(int j = 0; j < m[i].length; j++){
                if(m[i][j] < min){
                    min = m[i][j];
                }
            }
        } return min;
    }
