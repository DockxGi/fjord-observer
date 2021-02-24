/**
 * Interface for classes that can be observed by {{@link Observer}} objects.
 * Only responsibility is to tell who will notify about state changes.
 */
public interface Observable {
    /**
     * Gives you the {@link Notifier} for the {@link Observable}. It returns {@link NotifiesObservers} to
     * only expose that part of the interface that the {@link Observer} needs.
     */
    NotifiesObservers getNotifier();
}
