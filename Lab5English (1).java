// author: Viviana Zuloaga

class Main {

    // FIRST EXERCISE

    static int factorial(int n) {
        if (n == 0 || n == 1)
            return 1;
        else {
            return n * factorial(n - 1);
        }
    }


    // SECOND EXERCISE

    static String astLine(int n){
        if (n == 1)
            return "*";
        else {
            return "*" + astLine(n-1);
        }
    }

    // THIRD EXERCISE

    static String elephantSong(int n){
        if (n == 1){
            return "One elephant was swinging on a spider's web " +
                    "and when he saw that he wasn't falling, he " +
                    "went to call another elephant. ";
        }  else {
            return elephantSong(n-1) + n + " elephants were swinging on a spider's web " +
                    "and when they saw that they weren't falling, " +
                    "they went to call another elephant. ";
        }
    }

    // FOURTH EXERCISE

    static int countDigit(int n){
        if (n == 0){
            return 0;
        } else {
            return 1 + countDigit(n/10);
        }
    }

    // FIFTH EXERCISE

    static int sumDigits(int n){
        if (n < 10){
            return n;
        } else {
            int last = n % 10;
            int first = n / 10;
            return last + sumDigits(first);
        }

    }

    // SIXTH EXERCISE

    static int countThrees(int n){

        if (n == 0){
            return 0;
        }
        int target = 3;
        int last = n % 10;
        int first = n / 10;
        if (n > 0 && (last == target || first == target)) {
            return 1 + countThrees(n/10);
        } else {
            return 0;
        }

    }

    // SEVENTH EXERCISE

    static boolean containsThree(int n){

        if (n == 0){
            return false;
        }
        int target = 3;
        int last = n % 10;
        if (last == target) {
            return true;
        } else {
            return containsThree(n/10);
        }
    }

    // EIGHTH EXERCISE

    static String astTriangle(int n){
        if (n == 1)
            return "*";
        else {
            return astTriangle(n - 1) + "\n" + astLine(n);
        }
    }

    static public void main(String[] args) {
        int n = 5;
        System.out.println("The factorial of " + n + " is " + factorial(n));
        System.out.println("10 asterisks " + astLine(10));
        System.out.println("Elephant song: \n" + elephantSong(3));
        System.out.println("Digits in 45 is " + countDigit(45));
        System.out.println("Sum of digits of 341 is " + sumDigits(341));
        System.out.println("Threes in 333: " + countThrees(333));
        System.out.println("Does the digit 3 appear in 335? " + containsThree(335));
        System.out.println("Triangle \n" + astTriangle(n));
    }
}
