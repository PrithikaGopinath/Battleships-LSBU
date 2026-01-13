package battleships.strategy;

import battleships.Board;
import battleships.Outcome;
import battleships.ship.ComputerPlayerStratergy.ComputerPlayerStrategy;

public class RandomStrategy implements ComputerPlayerStrategy {

    @Override
    public int[] chooseTarget(Board opponentBoard, Board ownBoard) {
        while (true) {
            final int x = (int) (Math.random() * opponentBoard.getWidth());
            final int y = (int) (Math.random() * opponentBoard.getHeight());
            if (!opponentBoard.getSquare(x, y).isTried()) {
                return new int[] { x, y };
            }
        }

    }

    @Override
    public void resultOfMove(Outcome outcome) {
    }

}