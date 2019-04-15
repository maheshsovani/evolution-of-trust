package evolutionOfTrust;

import java.util.List;

class GrudgerPlayer extends Player {

    GrudgerPlayer() {
        moves.add(Move.CO_OPERATE);
    }

    @Override
    Move getMove(List<Move> otherPlayerMoves) {
        if (otherPlayerMoves.contains(Move.CHEAT)) {
            return Move.CHEAT;
        }
        return Move.CO_OPERATE;
    }
}
