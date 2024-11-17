    static int findIndexOfValue(int[] array, int n) {
        int index = 0;
    for (int i = 0; i < array.length; i++) {
        if (n == array[i]) {
            index = i;
        }
    }
    return index;
}
