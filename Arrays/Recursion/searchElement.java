    static boolean searchElement(int[] col, int target) {
        return searchElementAux(col, 0, 4);
    }

    static boolean searchElementAux(int[] col, int i, int target) {
        // ensures the recursion terminates once the array is fully traversed
       if (i >= col.length){
           return false;
       }
        // or target is found
       if(col[i] == target){
           return true;
       }
      
       return searchElementAux(col, i + 1, target);
       
    }
