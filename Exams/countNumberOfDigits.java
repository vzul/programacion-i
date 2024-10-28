static int countDigits(int n){

        int counter = 0;
        
        if (n == 0){
            return 1;
        }
        
        while(n > 0){
            counter++;
            n /= 10;
        } return counter;
}
