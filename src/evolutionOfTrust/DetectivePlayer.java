package evolutionOfTrust;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;

class DetectivePlayer extends Player {
  private List<Move> myMoves;

  DetectivePlayer() {
    this.moves.add(Move.CO_OPERATE);
    myMoves = new ArrayList<>(asList(Move.CO_OPERATE, Move.CHEAT, Move.CO_OPERATE, Move.CO_OPERATE));
  }

  @Override
  Move getMove(List<Move> otherPlayerMoves) {
    if (this.moves.size() > 4 && otherPlayerMoves.contains(Move.CHEAT)) {
      Move move = otherPlayerMoves.get(otherPlayerMoves.size() - 1);
      this.moves.add(move);
      return move;
    }

    if (this.moves.size() > 4) {
      Move move = Move.CHEAT;
      this.moves.add(move);
      return move;
    }

    Move move = this.myMoves.get(this.moves.size() - 1);
    this.moves.add(move);
    return move;
  }
}
