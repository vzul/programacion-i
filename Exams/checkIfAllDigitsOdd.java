static boolean checkOdd(int n){
        int last = 0;
        
        for(; n > 0; n /= 10){
            last = n % 10;
            if(last % 2 == 0){
                return false;
            }
        } return true;
        
  }
