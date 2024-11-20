public class Lab9 {

    // EXERCISE 1
    static int sumaElementos(int[] col) {
        return sumaElementosAux(col, 0); // Start recursion at index 0
    }

    static int sumaElementosAux(int[] col, int i) {
        if (i == col.length) { // Base case: end of array
            return 0;
        }
        return col[i] + sumaElementosAux(col, i + 1); // Recursive case
    }

    // EXERCISE 2
    static int sumaElementosPares(int[] col) {
        return sumaElementosParesAux(col, 0);
    }

    static int sumaElementosParesAux(int[] col, int i) {
        if (i == col.length) {
            return 0;
        } else if (col[i] % 2 == 0) {
            return col[i] + sumaElementosParesAux(col, i + 1);
        } else {
            return sumaElementosParesAux(col, i + 1);
        }
    }

    // EXERCISE 3
    static int sumaElementosPosicionesPares(int[] col) {
        return sumaElementosPosicionesParesAux(col, 0);
    }

    static int sumaElementosPosicionesParesAux(int[] col, int i) {
        if (i == col.length) {
            return 0;
        } else if (i % 2 == 0) {
            return col[i] + sumaElementosPosicionesParesAux(col, i + 1);
        } else {
            return sumaElementosPosicionesParesAux(col, i + 1);
        }
    }

    // EXERCISE 4
    static boolean estaN(int[] col, int n) {
        return estaNAux(col, 0, n);
    }

    static boolean estaNAux(int[] col, int i, int n) {
        if (i == col.length) {
            return false;
        } else if (col[i] == n) {
            return true;
        } else {
            return estaNAux(col, i + 1, n);
        }
    }

    // EXERCISE 5
    static int cuantosN(int[] col, int n) {
        return cuantosNAux(col, 0, n);
    }

    static int cuantosNAux(int[] col, int i, int n) {
        if (i == col.length) {
            return 0;
        } else if (col[i] == n) {
            return 1 + cuantosNAux(col, i + 1, n);
        } else {
            return cuantosNAux(col, i + 1, n);
        }
    }

    // EXERCISE 6
    static boolean todosN(int[] col, int n) {
        return todosNAux(col, 0, n);
    }

    static boolean todosNAux(int[] col, int i, int n) {
        if (i == col.length) {
            return true;
        } else if (col[i] != n) {
            return false;
        }
        return todosNAux(col, i + 1, n);
    }

    // EXERCISE 7
    static int maxElemento(int[] col) {
        return maxElementoAux(col, 0, col[0]);
    }

    static int maxElementoAux(int[] col, int i, int currentMax) {
        if (i == col.length) {
            return currentMax;
        } else if (col[i] > currentMax) {
            currentMax = col[i];
        }
        return maxElementoAux(col, i + 1, currentMax);
    }

    // EXERCISE 8
    static boolean iguales(int[] col1, int[] col2) {
        if (col1.length != col2.length) {
            return false;
        }
        return igualesAux(col1, col2, 0);
    }

    static boolean igualesAux(int[] col1, int[] col2, int i) {
        if (i == col1.length) {
            return true;
        } else if (col1[i] != col2[i]) {
            return false;
        } else {
            return igualesAux(col1, col2, i + 1);
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 4};
        int[] array2 = {8};
        int[] array3 = {7};
        int[] array4 = {1, 6, 3, 0, 0};
        int[] array5 = {1, 6, 3, 0, 4};
        int[] array6 = {3, 2, 5, 2, 8, 1};
        int[] array7 = {};
        int[] array8 = {2, 2, 2};
        int[] array9 = {2, 2, 3, 2};
        int[] array10 = {-10, -4, -6};
        int[] array11 = {1, 2, 3};
        int[] array12 = {1, 8, 3};

        // EXERCISE 1
        System.out.println(sumaElementos(array));
        System.out.println(sumaElementos(array2));
        System.out.println(sumaElementos(array4));

        // EXERCISE 2
        System.out.println(sumaElementosPares(array));
        System.out.println(sumaElementosPares(array2));
        System.out.println(sumaElementosPares(array3));
        System.out.println(sumaElementosPares(array4));

        // EXERCISE 3
        System.out.println(sumaElementosPosicionesPares(array));
        System.out.println(sumaElementosPosicionesPares(array2));
        System.out.println(sumaElementosPosicionesPares(array3));
        System.out.println(sumaElementosPosicionesPares(array4));

        // EXERCISE 4
        System.out.println(estaN(array, 2));
        System.out.println(estaN(array2, 9));
        System.out.println(estaN(array3, 7));
        System.out.println(estaN(array5, 6));

        // EXERCISE 5
        System.out.println(cuantosN(array6, 2));
        System.out.println(cuantosN(array6, 7));
        System.out.println(cuantosN(array7, 2));

        // EXERCISE 6
        System.out.println(todosN(array6, 2));
        System.out.println(todosN(array7, 2));
        System.out.println(todosN(array8, 2));
        System.out.println(todosN(array9, 2));

        // EXERCISE 7
        System.out.println(maxElemento(array5));
        System.out.println(maxElemento(array6));
        System.out.println(maxElemento(array9));
        System.out.println(maxElemento(array10));

        // EXERCISE 8
        System.out.println(iguales(array11, array11));
        System.out.println(iguales(array11, array12));
    }
}
