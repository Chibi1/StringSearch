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
        while (true) {
            System.out.println("\nWhich single character would you like to search in the text? ");
            System.out.println("Type \"Quit\" if you wish to exit.");
            searchCharacter = scanner.nextLine();
            if (checkInput()) {
                parseTextForCharacter();
                System.out.printf("%s \"%s\" %d %s\n",
                        "This text contained the character", searchCharacter, characterCount, "times.");
            }
        }

    }

    private boolean checkInput() {
        boolean isValid = true;
        if (searchCharacter.toLowerCase().equals("quit")) {
            System.exit(0);
        } else if (searchCharacter.length() > 1) {
            System.out.println("\"Error\" - a single character is required.");
            isValid = false;
        }
        return isValid;
    }

    private void parseTextForCharacter() {
        characterCount = 0;
        for (int i = 0; i < stringForAnalysis.length(); i++) {
            if (searchCharacter.equals(Character.toString(stringForAnalysis.charAt(i)))) {
                characterCount++;
            }
        }
    }
}
