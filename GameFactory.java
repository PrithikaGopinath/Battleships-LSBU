package battleships;

import battleships.AbstractPlayer;
import battleships.Board;
import battleships.cli.CLIComputerPlayer;
import battleships.cli.CLIGame;
import battleships.cli.CLIHumanPlayer;
import battleships.gui.GUIComputerPlayer;
import battleships.gui.GUIGame;
import battleships.gui.GUIHumanPlayer;
import battleships.ship.ComputerPlayerStratergy.ComputerPlayerStrategy;
import battleships.AbstractGame;

public interface GameFactory {
    AbstractPlayer createHumanPlayer(String name, Board board);

    AbstractPlayer createComputerPlayer(String name, Board board, ComputerPlayerStrategy strategy);

    AbstractGame createGame(AbstractPlayer player1, AbstractPlayer player2);

    // CLI Factory
    public class CLIGameFactory implements GameFactory {
        @Override
        public AbstractPlayer createHumanPlayer(String name, Board board) {
            return new CLIHumanPlayer(name, board);
        }

        @Override
        public AbstractPlayer createComputerPlayer(String name, Board board, ComputerPlayerStrategy strategy) {
            return new CLIComputerPlayer(name, board, strategy);
        }

        @Override
        public AbstractGame createGame(AbstractPlayer player1, AbstractPlayer player2) {
            return new CLIGame(player1, player2);
        }
    }

    // GUI Factory
    public class GUIGameFactory implements GameFactory {
        @Override
        public AbstractPlayer createHumanPlayer(String name, Board board) {
            return new GUIHumanPlayer(name, board);
        }

        @Override
        public AbstractPlayer createComputerPlayer(String name, Board board, ComputerPlayerStrategy strategy) {
            return new GUIComputerPlayer(name, board, strategy);
        }

        @Override
        public AbstractGame createGame(AbstractPlayer player1, AbstractPlayer player2) {
            return new GUIGame(player1, player2);
        }
    }
}
