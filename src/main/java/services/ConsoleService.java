package services;

import java.util.Scanner;

public class ConsoleService {

    private final Scanner scanner = new Scanner(System.in);

    public String promptForString(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine();
    }

    public void printSearchLyrics() {
        System.out.println(" ");
        System.out.println(" Search lyrics! ");
        System.out.println(" ");
    }


}
