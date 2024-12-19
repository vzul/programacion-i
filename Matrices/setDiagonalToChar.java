 static char[][] setDiagonal(char[][] m) {
    char c = '9';
    for (int i = 0; i < m.length; i++) {
        if (i < m[i].length) { // Ensure the diagonal element exists to avoid ArrayIndexOutOfBoundsException.
            m[i][i] = c;
        }
    }
    return m;
}
