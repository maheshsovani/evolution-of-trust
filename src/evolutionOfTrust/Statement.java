package evolutionOfTrust;

class Statement {
  private StringBuilder statements;

  Statement() {
    this.statements = new StringBuilder();
  }

  void addStatement(Integer round, Integer player1Move, Integer player2Move) {
    this.statements.append( round+"   :   ").append(player1Move).append("   :   ").append(player2Move).append("\n");
  }

  @Override
  public String toString() {
    return this.statements.toString();
  }

  void addHeader( String firstPlayer, String secondPlayer) {
    this.statements.append("Round|"+ firstPlayer+ "|"+secondPlayer+"\n");
  }
}
