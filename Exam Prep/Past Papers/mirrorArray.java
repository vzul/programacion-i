static int[] imagenEspejo(int[] array) {
        int[] rev = new int[array.length * 2];
        for (int i = 0; i < array.length; i++) {
            rev[i] = array[i];
        }
        for (int i = array.length; i < rev.length; i++) {
            rev[i] = array[rev.length - 1 - i];
        }
        return rev;
    }
