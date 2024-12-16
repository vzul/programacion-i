static void check(int[][] m){
        
        int max = m[0][0];
        int min = m[0][0];
        
        for(int i = 0; i < m.length; i++){
            for(int j = 0; j < m[i].length; j++){
                if(m[i][j] < min){
                    min = m[i][j];
                } else if (m[i][j] > max){
                    max = m[i][j];
                }
            }
        } 
        
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }
