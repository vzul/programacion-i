import java.util.Arrays;

public class Main {
    
    // Display elements of an array without trailing commas
    static void mostrarElementos(char[] col) {
        if (col.length == 0) {
            System.out.println("{}");
        } else {
            System.out.print("{");
            for (int i = 0; i < col.length; i++) {
                System.out.print(col[i]);
                if (i < col.length - 1) {
                    System.out.print(", "); // Add a comma only if it's not the last element
                }
            }
            System.out.println("}");
        }
    }

    // Copy an array
    static char[] copy(char[] a) {
        char[] newArray = new char[a.length];
        for (int i = 0; i < a.length; i++) {
            newArray[i] = a[i];
        }
        return newArray;
    }

    // Concatenate two arrays
    static char[] conc(char[] a, char[] b) {
        char[] newArray = new char[a.length + b.length];
        for (int i = 0; i < a.length; i++) {
            newArray[i] = a[i];
        }
        for (int j = 0; j < b.length; j++) {
            newArray[a.length + j] = b[j];
        }
        return newArray;
    }

    // Insert a character at a specified index in the array
    static char[] insert(char[] a, char c, int index) {
        if (index < 0 || index >= a.length) {
            throw new IndexOutOfBoundsException("Index out of range");
        }
        for (int i = 0; i < a.length; i++) {
            if (i == index) {
                a[i] = c;
            }
        }
        return a;
    }

    // Remove the element at a specific index
    static char[] remove(char[] a, int index) {
        // Create a new array with a reduced size
        char[] newArray = new char[a.length - 1];
        // Copy elements, skipping the one at the specified index
        for (int i = 0, j = 0; i < a.length; i++) {
            if (i != index) {
                newArray[j++] = a[i];
            }
        }
        return newArray;
    }

    // Remove all occurrences of a specific character from an array
    static char[] removeOccurrences(char[] a, char c) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == c) {
                count++;
            }
        }
        char[] newArray = new char[a.length - count];
        for (int j = 0, k = 0; j < a.length; j++) {
            if (a[j] != c) {
                newArray[k++] = a[j];
            }
        }
        return newArray;
    }

    // Find the longest subsequence from two arrays
    static char[] longestSub(char[] a, char[] b) {
        int count = 0;
        char[] newArray = new char[a.length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    newArray[count] = a[i];
                    count++;
                }
            }
        }
        // Create the result array with the correct size
        char[] result = new char[count];
        System.arraycopy(newArray, 0, result, 0, count);
        return result;
    }
    
 // Remove duplicate characters from the array
    static char[] removeDuplicates(char[] a) {
        boolean[] counted = new boolean[a.length];  // Array to track counted characters
        char[] newArray = new char[a.length]; // To hold the result without duplicates
        int l = 0; // To keep track of the position in the new array

        // Iterate through each character in the array
        for (int i = 0; i < a.length; i++) {
            if (!counted[i]) {  // Only process the character if it hasn't been counted
                char currentChar = a[i];

                // Check for duplicates in the rest of the array
                for (int j = i + 1; j < a.length; j++) {
                    if (a[j] == currentChar) {
                        counted[j] = true;  // Mark this character as counted
                    }
                }

                // Add the current character to newArray if it hasn't been counted
                newArray[l++] = a[i];
            }
        }

        // Create the result array with the correct size
        char[] result = new char[l];
        System.arraycopy(newArray, 0, result, 0, l);
        return result;
    }

    public static void main(String[] args) {
        char[] array = {'a', 'b', 'c'};
        char[] array4 = {'a', 'b', 'a', 'c', 'a'};
        char[] array5 = {'h', 'o', 'l', 'a'};
        char[] array6 = {'o', 'l', 'a'};

        // Copy array
        char[] copiedArray = copy(array);
        System.out.print("Copy of array: ");
        mostrarElementos(copiedArray);

        // Concatenate two arrays
        char[] concatenatedArray = conc(array, array6);
        System.out.print("Concatenated array: ");
        mostrarElementos(concatenatedArray);

        // Insert character at index 0
        char[] newArray = insert(array, 'd', 0);
        System.out.print("New array after insert: ");
        mostrarElementos(newArray);

        // Remove element at index 0
        char[] modifiedArray = remove(array, 0);
        System.out.print("New array after remove: ");
        mostrarElementos(modifiedArray);

        // Remove occurrences of 'a' from array
        char[] withoutCharArray = removeOccurrences(array4, 'a');
        System.out.print("New array after removing 'a': ");
        mostrarElementos(withoutCharArray);

        // Find the longest subsequence
        char[] subsequenceArray = longestSub(array5, array6);
        System.out.print("Longest subsequence: ");
        mostrarElementos(subsequenceArray);

        // Remove duplicates from array
        char[] uniqueArray = removeDuplicates(array4);
        System.out.print("Array after removing duplicates: ");
        mostrarElementos(uniqueArray);
    }
}
