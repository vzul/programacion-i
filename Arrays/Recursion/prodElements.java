
    static int prodElementos(int[] col) {
        return prodElementosAux(col, 0);
    }


    static int prodElementosAux(int[] col, int i) {
        if(i == col.length - 1){
            return col[i];
        } else 
        return col[i] * prodElementosAux(col, i + 1);
    }
