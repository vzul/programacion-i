public class ConsecutiveCounter {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 2, 2, 3, 3, 4, 4, 4, 4, 4, 5};

        countConsecutive(numbers);
    }

    public static void countConsecutive(int[] array) {
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
                System.out.println(currentElement + " appears " + count + " times in a row.");
                currentElement = array[i];
                count = 1;
            }
        }

        // Print the last element count
        System.out.println(currentElement + " appears " + count + " times in a row.");
    }
}
