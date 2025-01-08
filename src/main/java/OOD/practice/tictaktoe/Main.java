package OOD.practice.tictaktoe;

public class Main {
    public static void main(String[] args) {
        Player first = new Player("Max", Mark.X);
        Player second = new Player("Max2", Mark.O);
        Game game = new Game(first, second);
        game.play(0, 0);
        game.play(0, 1);
        game.play(1, 1);
        game.play(0, 2);
        game.play(2, 2);

    }
}
