public class DigitalRoot {

    public static int digitalRoot(int n) {
        while (n >= 10) {  // Repeat until n is a single digit
            int sum = 0;
            
            // Sum the digits of n
            while (n > 0) {
                sum += n % 10;  // Add the last digit
                n /= 10;        // Remove the last digit
            }
            
            // Update n to be the sum of its digits
            n = sum;
        }
        
        return n;
    }

    public static void main(String[] args) {
        System.out.println(digitalRoot(493193)); // Output should be 2
        System.out.println(digitalRoot(12345));  // Output should be 6
        System.out.println(digitalRoot(9));      // Output should be 9 (already single digit)
    }
}
