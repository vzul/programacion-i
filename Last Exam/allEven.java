static boolean areAllEven(int[] arr) {
    boolean allEven = true; // assumes all elements are even
    for (int i = 0; i < arr.length && allEven; i++) { // stops early if odd num is encountered
        allEven = (arr[i] % 2 == 0); // allEven remains true if num is even
    }
    return allEven;
}
