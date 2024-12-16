static void set(int[][] m, int n) {
        for (int i = 0; i < m.length; i++) {
            // Set main diagonal element
            m[i][i] = n;

            // Set secondary diagonal element (if it's a square matrix)
            if (i != m.length - 1 - i) { // Avoid double-setting the center element in odd-sized matrices
                m[i][m.length - 1 - i] = n;
            }
        }
    }
