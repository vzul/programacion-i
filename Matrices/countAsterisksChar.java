 static int countAst(char[][] a){
        char ast = '*'; // DECLARE CHAR WITH LITERALS
        int count = 0;
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[i].length; j++){ // TRAVERSE COLUMNS WITH A[i].LENGTH
                if(a[i][j] == ast){ // COMPARISON WITH TWO EQUALS
                    count++;
                }
            }
        } return count;
    }
