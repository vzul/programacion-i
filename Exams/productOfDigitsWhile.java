   static int productDigits(int n){
       int last = 0;
       int aux = 1;
       while(n > 0){
           last = n % 10;
           aux = aux * last;
           n /= 10;
       } return aux;
   }
    
