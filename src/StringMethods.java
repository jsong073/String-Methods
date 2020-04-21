import java.util.Scanner;

public class StringMethods {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userInput = "";
        int indexEnd = 0;

        System.out.print("Enter a word: ");
        userInput = input.nextLine();
        System.out.print("Enter a number as an index: ");
        indexEnd = input.nextInt();

        if (indexEnd > userInput.length()) {
            System.out.println("Index number is too high.");
        } else if (indexEnd < 0) {
            System.out.println("Index number is too low.");
        } else {
            System.out.println("The substring from 0 to " + indexEnd + " is: " + userInput.substring(0, indexEnd));
        }
    }
}
