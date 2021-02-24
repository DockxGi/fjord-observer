/**
 * Part of the {@link Notifier} interface that {@link Observer} should use
 */
public interface NotifiesObservers {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
}
