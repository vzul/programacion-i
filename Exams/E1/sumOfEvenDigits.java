static int sumaDigitosPares(int n){
  int sum = 0;
  while(n>0){
    int last = n % 10;
    if(last % 2 == 0){
      sum = sum + last;
    }
  n /= 10;
  } return sum;
}
