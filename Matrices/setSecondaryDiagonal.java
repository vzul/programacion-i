static char[][] secDiagonal(char[][] m) {
    char c = '9';
    for (int i = 0; i < m.length; i++) {
        int col = m.length - 1 - i; // Calculate the secondary diagonal column index
        if (col >= 0 && col < m[i].length) { // Ensure the column index is valid
            m[i][col] = c;
        }
    }
    return m;
}
