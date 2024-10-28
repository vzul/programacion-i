static int sumEven(int n) {
    int sum = 0;
    
    if (n == 0) {
        return 0;
    }
    
    int last = n % 10; // Get the last digit

    // Check if the last digit is even
    if (last % 2 == 0) {
        sum = last; // Add it to the sum
    }
    
    // Continue with the rest of the digits
    return sum + sumEven(n / 10);
}
