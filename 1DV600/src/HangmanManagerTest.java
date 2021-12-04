import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class HangmanManagerTest {

    @org.junit.jupiter.api.Test
    void playerWon() {
        HangmanManager h = new HangmanManager();
        assertFalse(h.playerWon());
        h.setAnswer("you");
        ArrayList<Character> word = new ArrayList<Character>();
        word.add('y');
        word.add('o');
        word.add('u');
        h.setCorrectGuess(word);
        assertTrue(h.playerWon());
    }

    @org.junit.jupiter.api.Test
    void playerLost() {
        HangmanManager h = new HangmanManager();
        assertFalse(h.playerLost());
        h.setAnswer("what");
        ArrayList<Character> word = new ArrayList<Character>();
        word.add('y');
        word.add('o');
        word.add('u');
        word.add('y');
        word.add('o');
        word.add('u');
        word.add('y');
        word.add('o');
        word.add('u');
        word.add('y');
        word.add('o');
        h.setWrongGuess(word);
        assertTrue(h.playerLost());
    }

    @org.junit.jupiter.api.Test
    void endGame() {
        HangmanManager h = new HangmanManager();
        assertFalse(h.endGame());
        h.setAnswer("you");
        ArrayList<Character> word = new ArrayList<Character>();
        word.add('y');
        word.add('o');
        word.add('_');
        h.setCorrectGuess(word);
        assertFalse(h.endGame());

        word.clear();
        word.add('y');
        word.add('o');
        word.add('u');
        assertTrue(h.endGame());
    }

    @org.junit.jupiter.api.Test
    void getStatus() {
        HangmanManager h = new HangmanManager();
        h.setAnswer("you");
        ArrayList<Character> word = new ArrayList<Character>();
        word.add('y');
        word.add('o');
        word.add('u');
        h.setCorrectGuess(word);
        assertEquals("YOU SUCCEED", h.getStatus());

        HangmanManager ha = new HangmanManager();
        ha.setAnswer("what");
        ArrayList<Character> w = new ArrayList<Character>();
        w.add('y');
        w.add('o');
        w.add('u');
        w.add('y');
        w.add('o');
        w.add('u');
        w.add('y');
        w.add('o');
        w.add('o');
        w.add('u');
        ha.setWrongGuess(w);
        assertEquals("YOU DIED", ha.getStatus());
    }

    @org.junit.jupiter.api.Test
    void hangman() {
        HangmanManager h = new HangmanManager();
        h.setAnswer("name");
        ArrayList<Character> word = new ArrayList<>(4);
        word.add('w');
        word.add('q');
        word.add('t');
        word.add('u');

        String expected = "\t|----------\n" +
                "\t|\t\t|\n" +
                "\t|\n\t|\n\t|\n\t|\n\t|\n" +
                "____|____";
        h.setWrongGuess(word);
        assertEquals(expected, h.hangman());
    }
}