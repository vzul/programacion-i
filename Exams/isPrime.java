static boolean isPrime(int n){
        
        // base case:
        if(n < 2){
            return false;
        }
            
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                return false;
            }
        } return true;
}
