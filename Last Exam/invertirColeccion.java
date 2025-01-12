static void invertirColeccion(int[] col){
    // MODIFICA COL. NO SE CREA NUEVO ARRAY
    for(int i = 0; i < col.length; i++){
        col[i] = invertirNumero(col[i]);
    }
    // METODO VOID. NO RETURN 
}
