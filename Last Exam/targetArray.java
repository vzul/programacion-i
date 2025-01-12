static boolean containsValue(int[] arr, int target) {
    boolean found = false;
    for (int i = 0; i < arr.length && !found; i++) {
        found = (arr[i] == target);
    }
    return found;
}
