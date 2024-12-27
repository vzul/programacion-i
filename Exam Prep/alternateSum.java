
static int findSum(int arr[]) {
       int sum = 0;
       
       for(int i = 0; i < arr.length; i++){
           if(i % 2 == 0){ // find even indices
               sum += arr[i];
           }
       } return sum;
   }
