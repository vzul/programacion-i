static int reverseOdd(int n){
        int reversed = 0;
        for(; n > 0; n /= 10){
            int last = n % 10;
            if (last % 2 != 0){
                reversed = reversed * 10 + last;
            } 
        } return reversed;
    }
