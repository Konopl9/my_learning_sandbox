package OOD.patterns.observer;

public interface Observable {
    void add(Observer observer);
    Observer remove(Observer observer);
    void notifyAboutChange();
}
