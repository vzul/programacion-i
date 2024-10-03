/******************************************************************************

Check if a number is a prime.

*******************************************************************************/

public class Main {
    // Function to check if a number is prime
    static boolean prime(int num) {
        /*
        Explanation:
        1. A prime number is only divisible by 1 and itself.
        2. To determine if a number `n` is prime, we only need to check for divisibility
           by numbers from 2 up to the square root of `n`.
        3. This is because factors of a number come in pairs:
           - For example, if `n = 36`, the factors are (1, 36), (2, 18), (3, 12), (4, 9), (6, 6).
           - Notice that after the square root of 36 (which is 6), the factors start repeating in reverse.
           - So, if a number has a divisor greater than its square root, it must also have a corresponding
             divisor smaller than the square root. Therefore, checking up to the square root is sufficient.
        4. If `n` is divisible by any number between 2 and the square root of `n`, it is not a prime.
        */

        // Numbers less than 2 are not prime
        if (num < 2) {
            return false;
        }

        // Check divisibility from 2 to the square root of the number
        for (int i = 2; i <= Math.sqrt(num); i++) { // checking natural numbers
            if (num % i == 0) {
                return false; // Divisible by a number other than 1 and itself
            }
        }
        return true; // Prime if no divisors found
    }

    public static void main(String[] args) {
        int numberToCheck = 54;
        System.out.println("Is it a prime?: " + prime(numberToCheck));
    }
}


