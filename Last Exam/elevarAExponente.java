static int[] elevarAExponente(double col){
        int[] res = new double[col.length]; // NEW DOUBLE
        
        for(int i = 0; i < col.length; i++){
            res[i] = Math.pow(col[i], i);
        }
        
        return res;
    }
