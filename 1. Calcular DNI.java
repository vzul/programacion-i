import java.util.Scanner;

public class Main {

    public static void calculateLetter (int dni) {

        char letter = ' ';
        int remainder = dni % 23;

        char[] letters = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K'};
        for (int i = 0; i < letters.length; i++) { // length of array is 22
            letter = letters[remainder]; // the letter is calculated with the array index -> the remainder is a whole number, which is the number of times it will traverse the letters array and land on the letter we want
        }

        System.out.println("Remainder " + remainder + " is assigned to letter " + letter);
        String finalDNI = "" + dni + letter;
        System.out.println("Your DNI is: " + finalDNI);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // Create Scanner object

        System.out.println("Insert DNI");

        // Read an integer from the user
        int dni = scanner.nextInt();

        System.out.println("DNI: " + dni);

        // Close the Scanner object
        scanner.close();

        calculateLetter(dni);
    }
}
