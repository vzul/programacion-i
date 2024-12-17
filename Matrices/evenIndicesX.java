class Example {
    public static void main(String[] args) {
        int f = 2; // Number of rows
        int c = 3; // Number of columns
        char[][] result = new char[f][c];

        // Fill the 2D array with 'X' and 'O'
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) { // J < C because of fixed array dimensions
                if ((i + j) % 2 == 0) {
                    result[i][j] = 'X';
                } else {
                    result[i][j] = 'O';
                }
            }
        }

        // Print the 2D array
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
