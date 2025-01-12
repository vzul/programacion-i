static boolean hayTresVocales(char[] col) {
    boolean flag = false;
    int count = 0;  // Declare and initialize count to 0

    for (int i = 0; i < col.length; i++) {
        if (col[i] == 'a' || col[i] == 'e' || col[i] == 'i' || col[i] == 'o' || col[i] == 'u') {
            count++;  // Increment count if the character is a vowel
        }
    }

    if (count == 3) {
        flag = true;  // Set flag to true if there are exactly 3 vowels
    }

    return flag;
}
