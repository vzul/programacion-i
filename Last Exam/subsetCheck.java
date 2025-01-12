static boolean incluido(boolean[] c1, boolean[] c2) {
    if (c1.length > c2.length) {
        return false; // c1 cannot be a subset of c2 if c1 is longer than c2
    }

    for (int i = 0; i < c1.length; i++) {
        if (c1[i] && !c2[i]) {
            return false; // If c1 has true but c2 doesn't, it's not a subset
        }
    }

    return true;
}
