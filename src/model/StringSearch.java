package model;

import java.util.Scanner;

public class StringSearch {

    private String stringForAnalysis = "";
    private String searchCharacter = "";
    private int characterCount;

    private Scanner scanner = new Scanner(System.in);

    public void runProgram() {
        System.out.println("\nPlease enter some large text that you would like to be analysed:\n");
        stringForAnalysis = scanner.nextLine();
        do {
            System.out.println("Which single character would you like to search in the text? ");
            System.out.println("Type \"Quit\" if you wish to exit.");
            searchCharacter = scanner.nextLine();
        } while (isValidInput());
    }

    private boolean isValidInput() {
        boolean isValid = true;
        if (searchCharacter.equals("quit")) {
            System.exit(0);
        } else if (searchCharacter.length() > 1) {
            System.out.println("\"Error\" - a single character is required.");
            isValid = false;
        }
        return isValid;
    }
}
