static int largDig(int n){
        
        int largest = 0;
      
       for(; n > 0; n /= 10){
           int last = n % 10; 
               if (last > largest){
               largest = last;
                }
       } return largest;
    }
