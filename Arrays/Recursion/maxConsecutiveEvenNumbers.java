static int maxCons(int[] m){
        return maxConsAux(m, 0, 0, 0);
    }
    
    static int maxConsAux(int[] m, int i, int currentCount, int maxCount){ // initializing comparison counters before
        
        if(i == m.length - 1){ // check if at last index of the array
            return maxCount;
        }
        
        
        if(m[i] % 2 == 0){
              currentCount++;
              if(currentCount > maxCount){
                  maxCount = currentCount;
              }
        } else {
            currentCount = 0;
        }
        
        return maxConsAux(m, i + 1, currentCount, maxCount);
        
    }
