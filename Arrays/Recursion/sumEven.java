public class Main {
    
    static int sumEven(int[] col) {
        return sumEvenAux(col, 0, 0); 
    }

    static int sumEvenAux(int[] col, int i, int sum) {
      // return sum when we've reached end of array
        if (i == col.length) {
            return sum;
        }

        if (col[i] % 2 == 0) {
            sum = sum + col[i];
        }

        return sumEvenAux(col, i + 1, sum);
    }

