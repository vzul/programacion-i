/*
 * author: Viviana Zuloaga
 *
 * cration date: 26/11/2024
 *
 */

class Lab10{

    static void mostrarElementos(int[] col){
        if(col.length == 0)
            System.out.println("{}");
        else{
            System.out.print("{");
            for (int i = 0; i < col.length-1 ; i++)
                System.out.print(col[i] + ",");
            System.out.println(col[col.length-1] + "}");
        }
    }

    static int[] copiar(int[] col) {
        int[] copy = new int[col.length];
        int i = 0;
        while (i < col.length) {
            copy[i] = col[i];
            i++;
        } return copy;
    }

    static int[] invertirNuevo(int[] col) {
        int[] inverted = new int[col.length];
        for (int i = 0; i < col.length; i++) {
            inverted[i] = col[col.length - 1 - i];
        }
        return inverted;
    }

    static void invertir(int[] col){
        for(int i = 0; i < col.length / 2; i++){
            int aux = col[i];
            col[i] = col[col.length - 1 -i];
            col[col.length - 1 -i] = aux;
        }
    }

    static boolean hayValoresIgualesConsecutivos(int[] col){
        boolean found = false;

        for(int i = 0; i < col.length - 1; i++){
            if(col[i] == col[i + 1]){
                found = true;
            }
        } return found;
    }


    static int[] multiplicarEscalarCopia(int[] col, int n){
        int[] copy = new int[col.length];
        int i = 0;

        while(i < col.length){
            copy[i] = col[i] * n;
            i++;
        } return copy;

    }

    /*
     * sustituirNumero(Collection of integers col, integer target, integer replacement) -> Collection of
     integers
     * PRE: length of col > 0
     * POST: Returns the input collection with the positions that contain the 'target' value
     *       changed to the 'replacement' value
     * USE CASES:
     *     sustituirNumero([4, 6, 5, 2], -7, 9) => [4, 6, 5, 2]
     *     sustituirNumero([0, 2, 0], 0, 10) => [10, 2, 10]
     */

    static int[] sustituirNumero(int[] col, int target, int replacement){
        int[] copy = new int[col.length];
        for(int i = 0; i < col.length; i++){

            if(col[i] == target){
                copy[i] = replacement;
            } else {
                copy[i] = col[i];
            }

        } return copy;
    }




    public static void main(String[] args){
        int[] array1 = {1,2,3};
        int[] array2 = {2,2,3,4,6};

        mostrarElementos(copiar(array1));
        mostrarElementos(invertirNuevo(array1));
        System.out.println("Original array: ");
        mostrarElementos(array1);
        invertir(array1);
        System.out.println("Reversed array: ");
        mostrarElementos(array1);
        System.out.println("Test for consecutives: "+ hayValoresIgualesConsecutivos(array1));
        System.out.println("Test for consecutives: "+ hayValoresIgualesConsecutivos(array2));
        mostrarElementos(multiplicarEscalarCopia(array1, 20));
        mostrarElementos(sustituirNumero(array2, 2, 40));
    }
}
