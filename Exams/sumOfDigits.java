static int pod(int n){

 int last = 0;
     if (n == 0){
          return 0;
      } else {
            last = n % 10;
      } return last + pod(n/10);
    }
