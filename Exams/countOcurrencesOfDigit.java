static int occurrences(int n, int m) {
    int counter = 0;
    int last = 0;

    // Special case: If n is 0 and m is also 0, we count that as one occurrence.
    if (n == 0) {
        return (m == 0) ? 1 : 0; 
    }

    while (n > 0) {
      last = n % 10;
        if (last == m) {
            counter++;
        }
        n /= 10;
    }
    return counter;
}
