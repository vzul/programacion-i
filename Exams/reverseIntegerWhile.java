static int reverseInteger(int n){
        int first = 0;
        int last = 0;
        int reversed = 0;
    
       while(n > 0){
            first = n / 10;
            last = n % 10;
            reversed = reversed * 10 + last;
            n = n / 10;
        } return reversed;
}
