static int largDig(int n){
        int largest = 0;
        int last = 0;
        
        while(n > 0){
            last = n % 10;
            if(last > largest){
                largest = last;
            }
            n /= 10;
        } return largest;
    }
