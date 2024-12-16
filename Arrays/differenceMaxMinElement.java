static void check(int[] m){
        
        int max = m[0];
        int min = m[0];
        
        for(int i = 0; i < m.length; i++){
            if(m[i] > m[0]){
                max = m[i];
            } else if (m[i] < m[0]){
                min = m[i];
            }
        } 
        
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
        
        int difference = max - min;
        System.out.println("Difference between largest and smallest element: " + difference);
    }
