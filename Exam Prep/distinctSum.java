
   static int findSum(int arr[]) {
       int previous = arr[0];
       int sum = arr[0]; // Include first element
       
       for(int i = 1; i < arr.length; i++) { // Start from second element
           int current = arr[i];
           
           if(current != previous) {
               sum += current;
           }
           
           previous = current;
       }
       return sum;
   }
