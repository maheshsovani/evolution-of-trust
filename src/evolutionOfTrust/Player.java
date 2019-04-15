package evolutionOfTrust;

import java.util.ArrayList;
import java.util.List;

abstract class Player {

  List<Move> moves = new ArrayList<>();

  abstract Move getMove(List<Move> otherPlayerMoves);

  List<Move> getMoves() {
    return moves;
  }
}
