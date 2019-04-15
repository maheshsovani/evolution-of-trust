package evolutionOfTrust;

class Machine {

    Result generateResult(Move player1Move, Move player2Move) {

        if (isMoveCooperate(player1Move) && isMoveCheat(player2Move)) {
            return new Result(-1, 3);
        }

        if (isMoveCooperate(player1Move) && isMoveCooperate(player2Move)) {
            return new Result(2, 2);
        }

        if (isMoveCheat(player1Move) && isMoveCooperate(player2Move)) {
            return new Result(3, -1);
        }
        return new Result(0, 0);
    }

    private boolean isMoveCheat(Move player2Move) {
        return player2Move == Move.CHEAT;
    }

    private boolean isMoveCooperate(Move player1Move) {
        return player1Move == Move.CO_OPERATE;
    }
}
