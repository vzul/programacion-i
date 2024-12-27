static void sortMatrix(int[][] matrix) {
        // Step 1: Flatten the matrix into a single array
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[] flatArray = new int[rows * cols];
        int index = 0;

        for (int[] row : matrix) {
            for (int element : row) {
                flatArray[index++] = element;
            }
        }

        // Step 2: Sort the flattened array
        Arrays.sort(flatArray);

        // Step 3: Fill the sorted elements back into the matrix
        index = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = flatArray[index++];
            }
        }
    }
