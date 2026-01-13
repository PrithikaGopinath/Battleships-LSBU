package battleships.gui;

import battleships.AbstractGame;
import battleships.Board;
import battleships.Outcome;
import battleships.ship.ComputerPlayerStratergy.ComputerPlayerStrategy;

public class GUIComputerPlayer extends GUIPlayer {

    private final ComputerPlayerStrategy strategy;

    public GUIComputerPlayer(final String name, final Board board, final ComputerPlayerStrategy strategy) {
        super(name, board);
        this.strategy = strategy;
    }

    @Override
    public void promptToTakeTurn(final AbstractGame game) {
        // Show prompt in GUI
        this.gamePanel.prompt(this);
        // Delay execution so human player can see what happens
        Utils.invokeLater(() -> doTakeTurn(game), GUIGame.DELAY);
    }

    private void doTakeTurn(final AbstractGame game) {
        // Strategy decides target based on opponent’s board
        final int[] move = this.strategy.chooseTarget(this.opponent.getBoard(), this.board);
        game.takeTurn(move[0], move[1]);
    }

    @Override
    public void displayResult(final Outcome result) {
        // Inform strategy of result for learning/adaptation
        this.strategy.resultOfMove(result);
        // Update GUI with result
        this.gamePanel.displayResult(this, result);
    }

    @Override
    public boolean isHuman() {
        return false;
    }
}
