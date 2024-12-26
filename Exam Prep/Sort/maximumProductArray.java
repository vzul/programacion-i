// Given an array arr of non-negative integers, return the maximum product of two numbers possible.
// Largest 2 numbers will be at back of sorted array
public static int maxProduct(int[] arr) {
       Arrays.sort(arr); 
       
       int last = arr[arr.length - 1];
       int penultimo = arr[arr.length - 2];
       
       return last * penultimo;
    }
}
