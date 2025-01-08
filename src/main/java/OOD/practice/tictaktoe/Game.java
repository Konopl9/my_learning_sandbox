package OOD.practice.tictaktoe;

import javax.naming.directory.InvalidAttributesException;

public class Game {
    private static int ID = 1;
    private final int id;
    private Player player1;
    private Player player2;
    private Player currentPlayer;
    private final Board board;

    public Game(Player player1, Player player2) {
        this.id = ID;
        ID++;
        board = new Board();
        this.player1 = player1;
        this.player2 = player2;
        currentPlayer = player1;
    }

    public int getId() {
        return id;
    }

    public void play(int x, int y) {
        boolean isWon = false;
        try {
            isWon = board.makeMove(currentPlayer, x, y);

            if(isWon) {
                System.out.println("Winner is " + currentPlayer);
                return;
            }
        } catch (InvalidAttributesException e) {
            throw new RuntimeException(e);
        }
        switchPlayers();
    }

    private void switchPlayers() {
        currentPlayer = currentPlayer == player1 ? player2 : player1;
    }
}
