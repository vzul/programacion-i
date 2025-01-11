static boolean esLetraMayuscula(char caracter) {
        return 'A' <= caracter && caracter <= 'Z' && caracter != 'Ñ';
    }

    static boolean esDigito(char caracter) {
        return '0' <= caracter && caracter <= '9';
    }

    static boolean tieneFormatoNIF(char[] charray) {
        // Must be exactly 9 characters: 8 digits and 1 uppercase letter
        if (charray.length != 9) {
            return false;
        }

        // Check first 8 characters are digits
        for (int i = 0; i < 8; i++) {
            if (!esDigito(charray[i])) {
                return false;
            }
        }

        // Check the last character is a valid uppercase letter (not Ñ)
        if (!esLetraMayuscula(charray[8])) {
            return false;
        }

        return true; // All conditions met
    }
