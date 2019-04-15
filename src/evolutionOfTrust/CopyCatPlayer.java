package evolutionOfTrust;

import java.util.List;

class CopyCatPlayer extends Player {
    CopyCatPlayer() {
        moves.add(Move.CO_OPERATE);
    }

    @Override
    Move getMove(List<Move> otherPlayerMoves) {
        Move move = otherPlayerMoves.get(otherPlayerMoves.size() - 1);
        if (moves.size() == 1) {
            move = Move.CO_OPERATE;
        }
        moves.add(move);
        return move;
    }
}

