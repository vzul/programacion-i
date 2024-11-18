public static int[] reverseArray(int[] array) {
    int[] rev = new int[array.length];
    for (int i = 0; i < array.length; i++) {
        rev[i] = array[array.length - 1 - i];
    }
    return rev;
}
