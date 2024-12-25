int countZeros(int A[][], int N)
    {
        int count = 0;
        
        for(int i = 0; i < A.length; i++){
            for(int j = 0; j < A[i].length; j++){
                if(A[i][j] == 0){
                    count++;
                }
            }
        } return count;
    }
