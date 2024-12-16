static int max(int[][] m){
        int max = 0;
        for(int i = 0; i < m.length; i++){
            for(int j = 0; j < m.length; j++){
                if(m[i][j] > max){
                    max = m[i][j];
                }
            }
        } return max;
    }
