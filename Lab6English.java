// author: Viviana Zuloaga

// It is requested to implement using while the following specifications.

class Lab6English {

    /* factorial (integer n) -> integer
       PRE: n > 0
       POST: the result is the factorial of n
       USE CASE:
         factorial(1) -> 1
         factorial(3) -> 6
    */

    static int factorial (int n){
        int result = 1;
        int i = 1;
        while(i <= n){
            result = result * i;
            i++; // equivalente a i = i + 1
        }
        return result;
    }

    // FIRST EXERCISE

    static String astLine(int n){
        int counter = 1;
        String ast = "*";
        String res = "";
        while(counter <= n){
            res = res + ast;
            counter++;
        } return res;
    }

    // SECOND EXERCISE

    static String elephantSong(int n){
        String start = "One elephant was balancing on a spider's web " +
                "and seeing it didn't fall, it went to call another elephant. ";
        String second = " elephants were balancing on a spider's web and seeing they didn't " +
                "fall, they went to call another elephant. ";
        String res = "";
        int counter = 2;
        while(counter <= n){
            res = res + counter + second;
            counter++;
        } return start + res;
    }

    // THIRD EXERCISE

    static int countDigits(int n){
        int counter = 0;
        if(n == 0){
            return 1;
        }
        while (n > 0){
            counter++;
            n /= 10;
        } return counter;
    }

    // FOURTH EXERCISE

    static int sumDigits(int n){
        int last = 0;
        int aux = 0;
        while(n > 0){
            last = n % 10;
            aux = aux + last;
            n /= 10;
        } return aux;
    }

    // FIFTH EXERCISE

    static int countThrees(int n){
        int target = 3;
        int counter = 0;

        while(n > 0){
            int last = n % 10;
            if (last == target){
                counter++;
            }
            n /= 10;
        } return counter;
    }

    // SIXTH EXERCISE

    static boolean containsThree(int n){
        int target = 3;
        while(n > 0){
            int last = n % 10;
            if (last == target){
                return true;
            }
            n /= 10;
        } return false;
    }

    // SEVENTH EXERCISE

    static String astTriangle(int n) {
        String res = "";

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                res += "*";
            }
            res += "\n";
        }
        return res;
    }


    static public void main(String[] args) {
        System.out.println("Tests factorial function");
        System.out.println("The factorial of " + n + " is " + factorial(n));
    }
}
