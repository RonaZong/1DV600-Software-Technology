
import java.util.ArrayList;
import java.util.Scanner;

public class HangmanManager extends VocabularyLibrary{
    private ArrayList<Character> correctGuess, wrongGuess;
    private String answer;
    private Scanner input = new Scanner(System.in);

    public HangmanManager() {
        this.answer = randomWords();
        this.correctGuess = new ArrayList<>();
        this.wrongGuess = new ArrayList<>();

        for (int j = 0; j < getAnswer().length(); j++) {
            this.correctGuess.add('_');
        }
    }

    public ArrayList getCorrectGuess() {
        return correctGuess;
    }

    public void setCorrectGuess(ArrayList correctGuess) {
        this.correctGuess = correctGuess;
    }

    public ArrayList getWrongGuess() {
        return wrongGuess;
    }

    public void setWrongGuess(ArrayList wrongGuess) {
        this.wrongGuess = wrongGuess;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public void playGame() {
        this.answer = randomWords();
        this.correctGuess = new ArrayList<>();
        this.wrongGuess = new ArrayList<>();

        for (int j = 0; j < getAnswer().length(); j++) {
            this.correctGuess.add('_');
        }

        while (!endGame()) {
            for (Character character : correctGuess) {
                System.out.print(character + " ");
            }
            System.out.println();

            System.out.print("Wrong guesses: ");
            for (Character character : wrongGuess) {
                System.out.print(character + " ");
            }
            System.out.println();

            System.out.println("Enter a letter (to quit type 2): ");
            String guessLetter = input.nextLine();
            checkGuess(guessLetter.charAt(0));
            if (guessLetter.equals("2")) {
                System.exit(1);
            }

            while (!Character.isLetter(guessLetter.charAt(0))) {
                System.out.println("Please enter a letter");
                guessLetter = input.nextLine();
                checkGuess(guessLetter.charAt(0));
            }
            System.out.println(hangman());

        }
        if (endGame()) {
            System.out.println(getStatus());
            System.out.println("The word was: " + getAnswer());

            System.out.println("\nYou want to: \n" +
                    "\t1) Play Game\n" + "\t2) Quit Game\n");
            int menuOption = input.nextInt();
            if (menuOption == 1) {
                playGame(); // start game
            }
            else if (menuOption == 2) {
                System.exit(1); // quit game
                input.close();
            }
            else
                System.err.println("Invalid choice!");
        }
    }


    public boolean playerWon() {
        return !correctGuess.contains('_');
    }

    public boolean playerLost() {
        return wrongGuess.size() >= 10;
    }

    public boolean endGame() {
        return playerWon() || playerLost();
    }

    public String getStatus() {
        return playerWon() ? "YOU SUCCEED" : "YOU DIED";
    }

    public void checkGuess(char letter) {
        boolean test = false;
        for (int i = 0; i < answer.length(); i++) {
            if (answer.charAt(i) == letter) {
                test = true;
                correctGuess.set(i, letter);
            }
        }
        if (!test && Character.isLetter(letter)) {
            wrongGuess.add(letter);
        }
    }

    public String hangman() {
        if (wrongGuess.size() == 1)
            return "\n\n\n\n\n\n\n\n________";
        else if (wrongGuess.size() == 2)
            return "\t|\n\t|\n\t|\n\t|\n\t|\n\t|\n\t|\n" +
                    "____|____";
        else if (wrongGuess.size() == 3)
            return "\t|----------\n\t|\n\t|\n\t|\n\t|\n\t|\n\t|\n" +
                    "____|____";
        else if (wrongGuess.size() == 4)
            return "\t|----------\n" +
                    "\t|\t\t|\n" +
                    "\t|\n\t|\n\t|\n\t|\n\t|\n" +
                    "____|____";
        else if (wrongGuess.size() == 5)
            return "\t|----------\n" +
                    "\t|\t\t|\n" +
                    "\t|\t\t0\n" +
                    "\t|\n\t|\n\t|\n\t|\n" +
                    "____|____";
        else if (wrongGuess.size() == 6)
            return "\t|----------\n" +
                    "\t|\t\t|\n" +
                    "\t|\t\t0\n" +
                    "\t|\t\t|\n" +
                    "\t|\n\t|\n\t|\n" +
                    "____|____";
        else if (wrongGuess.size() == 7)
            return "\t|----------\n" +
                    "\t|\t\t|\n" +
                    "\t|\t\t0\n" +
                    "\t|\t   /|\n" +
                    "\t|\n\t|\n\t|\n" +
                    "____|____";
        else if (wrongGuess.size() == 8)
            return "\t|----------\n" +
                    "\t|\t\t|\n" +
                    "\t|\t\t0\n" +
                    "\t|\t   /|\\\n" +
                    "\t|\n\t|\n\t|\n" +
                    "____|____";
        else if (wrongGuess.size() == 9)
            return "\t|----------\n" +
                    "\t|\t\t|\n" +
                    "\t|\t\t0\n" +
                    "\t|\t   /|\\\n" +
                    "\t|\t   /\n" +
                    "\t|\n\t|\n" +
                    "____|____";
        else if (wrongGuess.size() == 10)
            return "\t|----------\n" +
                    "\t|\t\t|\n" +
                    "\t|\t\t0\n" +
                    "\t|\t   /|\\\n" +
                    "\t|\t   / \\\n" +
                    "\t|\n\t|\n" +
                    "____|____";
        else
            return "";
    }

}
