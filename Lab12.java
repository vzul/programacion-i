/*
 * author: Viviana Zuloaga
 *
 * Matrices
 *
 */

class Lab12{


    static void mostrarMatriz(int [][] m){
        String result = "";
        for (int i = 0; i < m.length; i++){
            for (int j = 0; j < m[i].length; j++){
                result = result + m[i][j] + " ";
            }
            result = result + "\n";
        }
        System.out.println(result);
    }

     
     static int sumElements(int [][] m){
         int sum = 0;
         
         for(int i = 0; i < m.length; i++){
             for(int j = 0; j < m[i].length; j++){
                 sum = sum + m[i][j];
             }
         } return sum;
     }

    /* FUNCTION: identity(integer n) -> matrix of integers
     * PRE: n > 0
     * POST: the result is the identity matrix of size n, that is, an
     * n * n matrix with ones on the diagonal and zeros elsewhere.
     * USE CASES:
     *   identity(1) -> 1
     *   identity(3) -> 1 0 0
     *                  0 1 0
     *                  0 0 1
     *
     */
     
     static int[][] identity(int n) {
        int[][] matrix = new int[n][n];
        
        for (int i = 0; i < n; i++) {
            matrix[i][i] = 1;  // Set the diagonal elements to 1
        } return matrix;
    }
     
     static boolean equals(int [][] m1, int[][] m2){
         
         boolean isEqual = true;
         
         for(int i = 0; i < m1.length; i++){
             for(int j = 0; j < m1[i].length; j++){
                 if(m1[i][j] != m2[i][j]){
                     isEqual = false;
                 }
             }
         } return isEqual;
     }
     
     static int[][] sumMatrices(int[][] m1, int[][] m2){
         int[][] result = new int[m1.length][m1[0].length];
         for(int i = 0; i < m1.length; i++){
             for(int j = 0; j < m1[i].length; j++){
                 result[i][j] = m1[i][j] + m2[i][j];
             }
        } return result;
     }

    static boolean findN(int[][] m, int n){
        boolean found = false;
        for(int i = 0; i < m.length; i++){
             for(int j = 0; j < m[i].length; j++){
                 if(m[i][j] == n){
                     found = true;
                 }
             }
         } return found;
    }
    
    public static void main(String[] args){
        
        int[][] m = {{1, 2}, {4, 4}};
        int[][] m2 = {{1, 2}, {4, 3}};
        System.out.println("Sum of elements: " + sumElements(m));
        int[][] identityMatrix = identity(4);
        for (int i = 0; i < identityMatrix.length; i++) {
            for (int j = 0; j < identityMatrix[i].length; j++) {
                System.out.print(identityMatrix[i][j] + " ");
            }
            System.out.println();
         }
        System.out.println("Same?: " + equals(m, m));
        int[][] sum = sumMatrices(m, m2);
        for (int i = 0; i < sum.length; i++) {
        for (int j = 0; j < sum[i].length; j++) {
            System.out.print(sum[i][j] + " ");
        }
        System.out.println();
    }
        
        System.out.println("Find 4 in: " + findN(m, 4));
    }

}

