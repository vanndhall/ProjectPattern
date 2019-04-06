package observer;

public interface Publisher {
    void register(Observer observer1);

    void notifyObservers();
}
