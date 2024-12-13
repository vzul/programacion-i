static boolean isPrime(int n){
        boolean flag = true;
        if (n < 2){
            flag = false;
        }
        for(int i = 2; i < Math.sqrt(n); i++){ // I MUST START AT 2!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
            if (n % i == 0){
                flag = false;
            }
        } return flag;
    }
    static int maxCons(int[] m){
        return maxConsAux(m, 0, 0, 0);
    }
    
    static int maxConsAux(int[] m, int i, int currentCount, int maxCount){ // initializing comparison counters before
        
        if(i == m.length){ // check if at last index of the array
            return maxCount;
        }
        
        
        if(isPrime(m[i])){
              currentCount++;
              if(currentCount > maxCount){
                  maxCount = currentCount;
              }
        } else {
            currentCount = 0;
        }
        
        return maxConsAux(m, i + 1, currentCount, maxCount);
        
    }
