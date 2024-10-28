static int countDigits(int n) {
    // Base case: when n is reduced to 0, stop the recursion
    if (n == 0) {
        return 0;
    }
    // Recursive case: add 1 for the current digit and recurse with n/10
    return 1 + countDigits(n / 10);
}
