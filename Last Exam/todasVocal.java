static boolean todasVocal(char[] col){
        boolean allVocals = true;
        for(int i = 0; i < col.length && allVocals; i++){ // u keep checking if no consonant has been found
            if(!esVocal(col[i])){
                allVocals = false;
            }
            
        } return allVocals;
   }
