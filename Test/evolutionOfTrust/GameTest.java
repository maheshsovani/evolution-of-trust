package evolutionOfTrust;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GameTest {
    @Test
    void shouldReturnTheScoreBetweenCheatAndCoolPlayer() {
        CheatPlayer cheatPlayer = new CheatPlayer();
        CoolPlayer coolPlayer = new CoolPlayer();
        Game game = new Game(new Machine(),5);
        game.addPlayer(coolPlayer);
        game.addPlayer(cheatPlayer);

        assertEquals("Round|Player 1|Player 2\n" +
                "1   :   -1   :   3\n" +
                "2   :   -2   :   6\n" +
                "3   :   -3   :   9\n" +
                "4   :   -4   :   12\n" +
                "5   :   -5   :   15\n", game.startGame());
    }

    @Test
    void shouldReturnTheScoreBetweenCopyCatPlayerAndCoolPlayer() {
        CheatPlayer cheatPlayer = new CheatPlayer();
        CopyCatPlayer copyCatPlayer = new CopyCatPlayer();
        Game game = new Game(new Machine(),5);
        game.addPlayer(copyCatPlayer);
        game.addPlayer(cheatPlayer);

        assertEquals("Round|Player 1|Player 2\n" +
                "1   :   -1   :   3\n" +
                "2   :   -1   :   3\n" +
                "3   :   -1   :   3\n" +
                "4   :   -1   :   3\n" +
                "5   :   -1   :   3\n", game.startGame());
    }

    @Test
    void shouldReturnTheScoreBetweenCopyCatPlayerAndGrudgerPlayer() {
        GrudgerPlayer grudgerPlayer = new GrudgerPlayer();
        CopyCatPlayer copyCatPlayer = new CopyCatPlayer();
        Game game = new Game(new Machine(),5);
        game.addPlayer(copyCatPlayer);
        game.addPlayer(grudgerPlayer);

        assertEquals("Round|Player 1|Player 2\n" +
                "1   :   2   :   2\n" +
                "2   :   4   :   4\n" +
                "3   :   6   :   6\n" +
                "4   :   8   :   8\n" +
                "5   :   10   :   10\n", game.startGame());
    }

    @Test
    void shouldReturnTheScoreBetweenCopyCatPlayerAndDetectivePlayer() {
        DetectivePlayer detectivePlayer = new DetectivePlayer();
        CopyCatPlayer copyCatPlayer = new CopyCatPlayer();
        Game game = new Game(new Machine(),5);
        game.addPlayer(detectivePlayer);
        game.addPlayer(copyCatPlayer);

        assertEquals("Round|Player 1|Player 2\n" +
                "1   :   2   :   2\n" +
                "2   :   5   :   1\n" +
                "3   :   4   :   4\n" +
                "4   :   6   :   6\n" +
                "5   :   8   :   8\n", game.startGame());
    }
}
