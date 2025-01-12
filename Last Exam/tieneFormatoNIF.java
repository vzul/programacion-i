static boolean tieneFormatoNIF(char[] charr) {
  boolean status = true;
    // Step 1: Check length and last character
    if (charr.length != 9 || !esLetraMayuscula(charr[charr.length - 1])) {
        status = false;
    }

    // Step 2: Check first 8 characters are digits
    for (int i = 0; i < charr.length - 1; i++) {
        if (!esDigito(charr[i])) {
            status = false;
        }
    }

    // All checks passed
    return status;
}
