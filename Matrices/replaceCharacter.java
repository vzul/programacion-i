static int countDuplicates(char[][] m, char c){
        int count = 0;
        
        for(int i = 0; i < m.length; i++){
            for(int j = 0; j < m[i].length; j++){
                if (m[i][j] == c){
                    count++;
                }
            }
        } return count;
    }
 
    static char[][] removeDuplicates(char[][] m, char c) {
        char sub = '-';
        int delete = countDuplicates(m, c);
        for(int i = 0; i < m.length; i++){
            for(int j = 0; j < m[i].length; j++){
                if (delete > 1 && m[i][j] == c){
                    m[i][j] = sub;
                }
            }
        } return m;
    
    }
