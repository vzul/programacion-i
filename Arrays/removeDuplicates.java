import java.util.Arrays;

public class Main {
    public static int removeConsecutiveDuplicates(int[] arr) {
        // If array is null or empty, return 0
        if (arr == null || arr.length == 0) {
            return 0;
        }
        
        // Index to track the position where unique elements will be placed
        int uniqueIndex = 0;
        
        // Iterate through the array starting from the second element
        for (int i = 1; i < arr.length; i++) {
            // If current element is different from the last unique element
            if (arr[i] != arr[uniqueIndex]) {
                // Move to next unique index and replace the element
                uniqueIndex++;
                arr[uniqueIndex] = arr[i];
            }
        }
        
        // Return the number of unique elements
        // The first element is always unique, so add 1 to uniqueIndex
        return uniqueIndex + 1;
    }
    
    // Utility method to print array up to a given length
    public static void printArray(int[] arr, int length) {
        System.out.print("[");
        for (int i = 0; i < length; i++) {
            System.out.print(arr[i]);
            if (i < length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
    
    public static void main(String[] args) {
        // Test cases
        int[] test1 = {1, 1, 2, 2, 3, 0, 0, 0};
        System.out.println("Original Array:");
        printArray(test1, test1.length);
        
        int uniqueCount = removeConsecutiveDuplicates(test1);
        System.out.println("After removing consecutive duplicates:");
        printArray(test1, uniqueCount);
        
        // More test cases
        int[] test2 = {1, 1, 1, 2, 2, 3, 3, 3, 0, 0, 0};
        System.out.println("\nArray:");
        printArray(test2, test2.length);
        
        uniqueCount = removeConsecutiveDuplicates(test2);
        System.out.println("After removing consecutive duplicates:");
        printArray(test2, uniqueCount);
    }
}
