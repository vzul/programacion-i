static boolean[] union(boolean[] c1, boolean[] c2) {
    // Create a new array to hold the union of c1 and c2
    boolean[] res = new boolean[c1.length + c2.length];

    // Copy elements from c1 into res
    for (int i = 0; i < c1.length; i++) {
        res[i] = c1[i];
    }

    // Copy elements from c2 into res, starting after c1
    for (int i = 0; i < c2.length; i++) {
        res[c1.length + i] = c2[i];
    }

    return res;
}
