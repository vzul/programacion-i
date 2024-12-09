public class Main {
    public static void reverseArray(int[] arr) {
        // Use two pointers: start and end of the array
        int start = 0;
        int end = arr.length - 1;
        
        // Swap elements from both ends moving towards the center
        while (start < end) {
            // Swap elements
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            
            // Move pointers towards center
            start++;
            end--;
            
            // loop terminates when start is no longer less the end (indices equal to)
        }
    }
    
    // Method to print an array (helper method)
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println(); // New line after printing
    }
    
    public static void main(String[] args) {
        // Example usage
        int[] originalArray = {1, 2, 3, 4, 5};
        
        System.out.println("Original Array before reversal:");
        printArray(originalArray);
        
        // Reverse the array in-place
        reverseArray(originalArray);
        
        System.out.println("Array after reversal:");
        printArray(originalArray);
    }
}
