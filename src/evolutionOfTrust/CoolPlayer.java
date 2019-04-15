package evolutionOfTrust;

import java.util.List;

public class CoolPlayer extends Player {
  CoolPlayer() {
    this.moves.add(Move.CO_OPERATE);
  }

  @Override
  public Move getMove(List<Move> otherPlayerMoves) {
    Move move = Move.CO_OPERATE;
    this.moves.add(move);
    return move;
  }
}
