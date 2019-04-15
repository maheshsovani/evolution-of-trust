package evolutionOfTrust;

import java.util.ArrayList;
import java.util.List;

class Game {
  private final Score score;
  private List<Player> players;
  private Machine machine;
  private Integer rounds;

  Game(Machine machine, Integer rounds) {
    this.players = new ArrayList<>();
    this.machine = machine;
    this.score = new Score();
    this.rounds = rounds;
  }

  void addPlayer(Player player) {
    this.players.add(player);
  }

  String startGame() {

    for (int i = 0; i < this.rounds; i++) {
      Player player1 = this.players.get(0);
      Player player2 = this.players.get(1);
      List<Move> player1Moves = player1.getMoves();
      List<Move> player2Moves = player2.getMoves();
      Move player2Move = player2.getMove(player1Moves);
      Move player1Move = player1.getMove(player2Moves);
      Result result = this.machine.generateResult(player1Move, player2Move);
      this.score.addResult(result);
    }
    return this.score.getScoreBoard("Player 1" , "Player 2");
  }
}
