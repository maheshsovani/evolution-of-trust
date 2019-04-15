package evolutionOfTrust;

class Result {

  private Integer player1Score;

  private Integer player2Score;

  Result(Integer player1Score, Integer player2Score) {
    this.player1Score = player1Score;
    this.player2Score = player2Score;
  }

  Integer getPlayer1Score() {
    return player1Score;
  }

  Integer getPlayer2Score() {
    return player2Score;
  }
}
