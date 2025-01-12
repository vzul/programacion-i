static boolean estaInverso(int[] col, int n){
    boolean found = false;
     int reversedN = invertirNum(n); 
    for(int i = 0; i < col.length && !found; i++){
       
        if(col[i] == reversedN){
            found = true;
        }
        
        // ALTERNATIVELY: found = (col[i] == reversedN)
    } return found;
}
