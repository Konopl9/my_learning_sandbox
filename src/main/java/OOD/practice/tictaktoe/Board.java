package OOD.practice.tictaktoe;

import javax.naming.directory.InvalidAttributesException;
import java.util.Arrays;

public class Board {
    // how to keep track of a board status so we can find a winner in O(1)?
    // We need to store
    int[][] board = new int[3][3];
    int[] row = new int[3];
    int[] column = new int[3];
    int diagonal = 0;
    int reverseDiagonal = 0;

    public boolean makeMove(Player player, int x, int y) throws InvalidAttributesException {
        if(player == null || x < 0 || y < 0 || x >= board.length || y >= board[x].length) {
            throw new InvalidAttributesException("Please check input");
        }

        if(board[x][y] != 0) {
            throw new IllegalStateException("The place is taken");
        }

        int playerVal = player.mark() == Mark.X ? 1 : -1;

        row[x] += playerVal;
        column[y] += playerVal;
        if(x == y) {
            diagonal += playerVal;
        }
        if(x + y == row.length - 1) {
            reverseDiagonal += playerVal;
        }
        board[x][y] = playerVal;
        display();

        return Math.abs(row[x]) == row.length || Math.abs(column[y]) == row.length ||
                Math.abs(diagonal) == row.length || Math.abs(reverseDiagonal) == row.length;
    }

    public Board() {
        initializeBoard();
    }

    private void initializeBoard() {
        for (int[] row : board) {
            Arrays.fill(row, 0);
        }
    }

    public void display() {
        StringBuilder sb = new StringBuilder();
        for(int[] row : board) {
            for(int col : row) {
                sb.append(col).append(" ");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
