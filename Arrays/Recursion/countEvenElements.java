static int countEven(int[] col) {
        return countEvenAux(col, 0, 0); 
    }

    // Recursive helper method
    static int countEvenAux(int[] col, int i, int counter) {
        // Base case: If we've reached the end of the array, return the counter
        if (i == col.length) {
            return counter;
        }

        // If the current element matches the target, increment the counter
        if (col[i] % 2 == 0) {
            counter++;  // Increment counter
        }

        // Recursively call with the next index and the updated counter
        return countEvenAux(col, i + 1, counter);
    }
