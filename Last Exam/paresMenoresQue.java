static int[] paresMenoresQue(int n) {
    int longitud = n / 2; 
    int[] resultado = new int[longitud];
    
    for (int i = 1; i <= longitud; i++) {
        resultado[i - 1] = i * 2; // i-1 to STORE FROM 2 ONWARDS AND NOT INCLUDE N
    }
    
    return resultado;
}
