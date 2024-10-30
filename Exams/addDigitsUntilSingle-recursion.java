public class DigitalRoot {

    public static int digitalRoot(int n) {
        // Base case: if n is a single digit, return it
        if (n < 10) {
            return n;
        }

        // Calculate the sum of digits
        int sum = 0;
        while (n > 0) {
            sum += n % 10;  // Add the last digit
            n /= 10;        // Remove the last digit
        }

        // Recursive call with the sum
        return digitalRoot(sum);
    }

    public static void main(String[] args) {
        System.out.println(digitalRoot(493193)); // Output should be 2
        System.out.println(digitalRoot(12345));  // Output should be 6
        System.out.println(digitalRoot(9));      // Output should be 9 (already single digit)
    }
}
