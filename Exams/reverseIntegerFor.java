static int reverseInteger(int n) {
    int reversed = 0;
    for (; n > 0; n /= 10) {
        int lastDigit = n % 10;
        reversed = reversed * 10 + lastDigit;
    }
    return reversed;
}
