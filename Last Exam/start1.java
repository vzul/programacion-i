public int start1(int[] a, int[] b) {
    int count = 0;

    // Check if the first element of array 'a' is 1
    if (a.length > 0 && a[0] == 1) {
        count++;
    }

    // Check if the first element of array 'b' is 1
    if (b.length > 0 && b[0] == 1) {
        count++;
    }

    return count;
}
