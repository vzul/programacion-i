static boolean alMenosDos(int[] array, int n) {
    int count = 0;
    boolean flag = false;

    for (int i = 0; i < array.length; i++) {
        if (array[i] == n) {
            count++;
        }
        // Optimización: salir temprano si ya se encontró dos veces
        if (count >= 2) {
            flag = true;
        }
    }

    return flag; // Devuelve false si no se encontraron al menos dos apariciones
}
