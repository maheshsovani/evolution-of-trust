package evolutionOfTrust;

import java.util.ArrayList;
import java.util.List;

class Score {
  private List<Result> results;
  private Statement statement;

  Score() {
    this.results = new ArrayList<>();
    this.statement = new Statement();
  }

  void addResult(Result result) {
    this.results.add(result);
  }

  String getScoreBoard(String firstPlayer, String secondPlayer) {
    Integer player1Score = 0;
    Integer player2Score = 0;
    int round = 0;
    this.statement.addHeader( firstPlayer, secondPlayer);
    for (Result result : this.results) {
      player1Score += result.getPlayer1Score();
      player2Score += result.getPlayer2Score();
      round++;
      this.statement.addStatement(round, player1Score, player2Score);
    }
    return statement.toString();
  }
}
