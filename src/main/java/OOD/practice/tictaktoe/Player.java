package OOD.practice.tictaktoe;

public final class Player {
    private final String name;
    private final Mark mark;

    public Player(String name, Mark mark) {
        this.name = name;
        this.mark = mark;
    }

    public String name() {
        return name;
    }

    public Mark mark() {
        return mark;
    }

    @Override
    public String toString() {
        return name;
    }
}
