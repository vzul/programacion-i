static boolean incluido(boolean[] c1, boolean[] c2) {
    // PRE: C1 AND C2 same length
    boolean loEsta = true;

    for (int i = 0; i < c1.length && loEsta; i++) {
        if (c1[i] && !c2[i]) {
            loEsta = false; // If a true in c1 does not have the corresponding true in c2
        }
    }

    return loEsta;
}
