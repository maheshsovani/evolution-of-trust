package evolutionOfTrust;

import java.util.List;

public class CheatPlayer extends Player {

    CheatPlayer() {
        this.moves.add(Move.CHEAT);
    }

    @Override
    public Move getMove(List<Move> otherPlayerMoves) {
        Move move = Move.CHEAT;
        this.moves.add(move);
        return move;
    }
}
