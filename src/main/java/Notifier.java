/**
 * Interface for classes that are responsible for notifying {@link Observer} objects about state changes on
 * the {@link Observable} object.
 */
public interface Notifier {
    void notifyObservers();
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
}
