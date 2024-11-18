public static void findDuplicates(int[] array) {
        if (array.length == 0) {
            System.out.println("The array is empty.");
            return;
        }

        int currentElement = array[0];
        int count = 1;

        for (int i = 1; i < array.length; i++) {
            if (array[i] == currentElement) {
                count++;
            } else {
                if (count > 1) {
                    System.out.println("The duplicate element " + currentElement + " appears " + count + " times.");
                }
                currentElement = array[i];
                count = 1;
            }
        }
        
        // Check for the last element in the array
        if (count > 1) {
            System.out.println("The duplicate element " + currentElement + " appears " + count + " times.");
        }
    }
}
