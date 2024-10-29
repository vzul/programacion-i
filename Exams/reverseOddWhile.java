static int reverseOdd(int n){
        int reversed = 0;
        int last = 0;
        
        while (n > 0){
            last = n % 10;
            if(last % 2 != 0){
                reversed = reversed * 10 + last;
            }
            n /= 10;
        } return reversed;
    }
