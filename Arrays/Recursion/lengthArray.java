  // Wrapper method to start recursion
    static int length(int[] col) {
        return lengthAux(col, 0);
    }

    // Recursive method to find the minimum value
    static int lengthAux(int[] col, int i) {
       
      if (i == col.length) {  // The base case can directly check for out-of-bounds index
            return 0;
        }

        // Recursive case: we count the current element (1) and recurse for the rest of the array
        return 1 + lengthAux(col, i + 1);  // Move to the next element
    }

/*
Comparison to while (n > 0) { n = n / 10; counter++; }
In the while loop:

Each division (n / 10) is analogous to your recursive "jump" to the next index (i+1).
The counter is incremented for each division — in recursion, this is handled by returning 1 + recursive_result.
For an array:

Instead of dividing, you jump to the next index until you're out of bounds.
*/
