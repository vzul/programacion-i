    static int maxCons(int[] m, int target){
        return maxConsAux(m, target, 0, 0, 0);
    }
    
    static int maxConsAux(int[] m, int target, int i, int currentCount, int maxCount){ // initializing comparison counters before
        
        if(i == m.length - 1){ // check if at last index of the array
            return maxCount;
        }
        
        
        if(m[i] == target){
              currentCount++;
              if(currentCount > maxCount){
                  maxCount = currentCount;
              }
        } else {
            currentCount = 0;
        }
        
        return maxConsAux(m, target, i + 1, currentCount, maxCount);
        
    }
