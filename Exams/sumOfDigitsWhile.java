   static int sumDigits(int n){
       int last = 0;
       int aux = 0;
       while(n > 0){
           last = n % 10;
           aux = aux + last;
           n /= 10;
       } return aux;
   }
