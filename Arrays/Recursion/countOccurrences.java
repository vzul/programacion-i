    // Wrapper method to start recursion
    static int countOccurrences(int[] col, int target) {
        return countOccurrencesAux(col, 0, target, 0);  // Start recursion with index 0 and counter 0
    }

    // Recursive helper method
    static int countOccurrencesAux(int[] col, int i, int target, int counter) {
        // Base case: If we've reached the end of the array, return the counter
        if (i == col.length) {
            return counter;
        }

        // If the current element matches the target, increment the counter
        if (col[i] == target) {
            counter++;  // Increment counter
        }

        // Recursively call with the next index and the updated counter
        return countOccurrencesAux(col, i + 1, target, counter);
    }
