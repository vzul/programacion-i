static boolean hayTresVocales(char[] col) {
    return hayTresVocalesAux(col, 0, 0);  // Start recursion with initial index and count 0
}

static boolean hayTresVocalesAux(char[] col, int i, int count) {
    if (i >= col.length) {
        return false;  // If we've reached the end and haven't found 3 vowels, return false
    }

    if (esVocal(col[i])) {
        count++;  // Increment count if the current character is a vowel
    }

    if (count == 3) {
        return true;  // Return true if we've found exactly 3 vowels
    }

    return hayTresVocalesAux(col, i + 1, count);  // Recurse with next index and current count  // WE MUST CARRY COUNT OVER TO THE NEXT RECURSIVE CALL
}
