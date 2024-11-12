/*
  * Author: Viviana Zuloaga
  *
  * fecha creacion: 11/11/2024
  * fecha ultima modificacion: 11/12/2024
  *
  * Ejercios de arrays
  */


class Lab8{

     static int sumaElementos(int[] array){
         int sum = 0;
         for(int i=0; i < array.length; i++){
             sum += array[i];
         } return sum;

     }

      static int sumaElementosPares(int[] array){
          int sum = 0;
            for(int i=0; i < array.length; i++){
              if(array[i] % 2 == 0){
                  sum = sum + array[i];
              }
          } return sum;
      }

      static int sumaElementosPosicionesPares(int[] array){
          int sum = 0;
            for(int i = 0; i < array.length; i++){
              if(i % 2 == 0){
                  sum = sum + array[i];
              }
          } return sum;
      }

      static boolean estaN(int[] array, int n){
          for(int i = 0; i < array.length; i++){
              if(n == array[i]){
                  return true;
              }
          } return false;
      }

      static int cuantosN(int[] array, int n){
          int sum = 0;
          for(int i = 0; i < array.length; i++){
              if(n == array[i]){
                  sum++;
              }
          } return sum;
      }

      static boolean todosN(int[] array, int n){
          for(int i = 0; i < array.length; i++){
              if (n != array[i]){
                  return false;
              }
          } return true;

      }

      static int maxElemento(int[] array){
          int max = -2147483648;
          for(int i = 0; i < array.length; i++){
              if (array[i] > max){
                  max = array[i];
              }
          } return max;
      }

      static boolean iguales(int[] array, int[] array2){
          
          if (array.length != array2.length){
                      return false;
                  }

          for(int i = 0; i < array.length; i++){
                  if(array[i] != array2[i]){
                      return false;
                  }
              } return true;
      }

     public static void main(String[] args){
         int[] array1 = {1,2,4};
         int[] array2 = {3,2,5,2,8,1};
         int[] array3= {2,2,2};
         int[] array4 = {8};
         int[] array5 = {1,6,3,0,0};
         int[] array6 = {7};
         int[] array7 = {1,6,3,0,4};
         int[] array8 = {};
         int[] array9 = {2};
         int[] array10 = {1,4,10,3,6,1};
         int[] array11 = {-10,-4,-6};
         int[] array12 = {1,2,3};
         int[] array13 = {1, 8, 3};

         // TEST CASES #1:
         System.out.println("1. Sum of all elements in [1,2,4]: " +
sumaElementos(array1));
         System.out.println("1. Sum of all elements in [8]: " +
sumaElementos(array4));
         System.out.println("1. Sum of all elements in [1,6,3,0,0]: " +
sumaElementos(array5));


         // TEST CASES #2:
         System.out.println("2. Sum of even elements in [1,2,4]: " +
sumaElementosPares(array1));
         System.out.println("2. Sum of even elements in [8]: " +
sumaElementosPares(array4));
         System.out.println("2. Sum of even elements in [7]: " +
sumaElementosPares(array6));
         System.out.println("2. Sum of even elements in [1,6,3,0,0]: " +
sumaElementosPares(array5));

         // TEST CASES #3:
         System.out.println("3. Sum of elements in even indices in [1,2,4]: " + sumaElementosPosicionesPares(array1));
         System.out.println("3. Sum of elements in even indices in [8]: "
+ sumaElementosPosicionesPares(array4));
         System.out.println("3. Sum of elements in even indices in [7]: "
+ sumaElementosPosicionesPares(array6));
         System.out.println("3. Sum of elements in even indices in [1,6,3,0,4]: " + sumaElementosPosicionesPares(array7));

         // TEST CASES #4:
         System.out.println("4. Is 2 in [3,2,5,2,8,1]?: " + estaN(array2,
2));
         System.out.println("4. Is 7 in [3,2,5,2,8,1]?: " + estaN(array2,
7));
         System.out.println("4. Is 2 in []?: " + estaN(array8, 2));
         System.out.println("4. Is 2 in [2]?: " + estaN(array9, 2));

         // TEST CASES #5:
         System.out.println("5. How many 2s are in [3,2,5,2,8,1]?: " + 
cuantosN(array2,2));
         System.out.println("5. How many 7s are in [3,2,5,2,8,1]?: " + 
cuantosN(array2,7));
         System.out.println("5. How many 2s are in []?: " + 
cuantosN(array8,2));
         System.out.println("5. How many 2s are in [2]?: " + 
cuantosN(array9,2));

         // TEST CASES #6: WRONG
         System.out.println("6. Are there only 2s in [3,2,5,2,8,1]?: " + 
todosN(array2,2));
         System.out.println("6. Are there only 2s in []?: " + 
todosN(array8,2));
         System.out.println("6. Are there only 2s in [2]?: " + 
todosN(array9,2));
         System.out.println("6. Are there only 2s in [2,2,2]?: " + 
todosN(array3,2));

         // TEST CASES #7: WRONG
         System.out.println("7. Max element in [3,2,5,2,8,1]?: " + 
maxElemento(array2));
         System.out.println("7. Max element in [2]?: " + 
maxElemento(array9));
         System.out.println("7. Max element in [1,4,10,3,6,1]?: " + 
maxElemento(array10));
         System.out.println("7. Max element in [-10,-4,-6]?: " + 
maxElemento(array11));


         // TEST CASES #8: WRONG
         System.out.println("8. Are [1,2,3] and [1,2,3] the same?: " + 
iguales(array12,array12));
         System.out.println("8. Are [1,2,3] and [1,8,3] the same?: " + 
iguales(array12,array13));
     }
}

