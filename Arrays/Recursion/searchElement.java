    static boolean searchElement(int[] col, int target) {
        return searchElementAux(col, 0, 4);
    }

    static boolean searchElementAux(int[] col, int i, int target) {
       if (i >= col.length){
           return false;
       }
       if(col[i] == target){
           return true;
       }
      
       return searchElementAux(col, i + 1, target);
       
    }
