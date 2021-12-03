import org.apache.commons.compress.archivers.ar.ArArchiveEntry;

import java.util.ArrayList;
import java.util.Scanner;

public class Hangman {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        HangmanManager hangman = new HangmanManager();

        // Start / Quit Game
        System.out.println("Welcome to Hangman! Let's start!\n" +
                "\t1) Play Game\n" + "\t2) Quit Game\n");
        int menuOption = input.nextInt();
        if (menuOption == 1) {
            hangman.playGame(); // start game
        }
        else if (menuOption == 2) {
             System.exit(1); // quit game
        }
        else
            System.err.println("Invalid choice!");

        input.close();
    }
}
