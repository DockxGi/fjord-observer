/**
 * Interface for classes that can be observed by {{@link Observer}} objects.
 * Only responsibility is to tell who will notify about state changes.
 */
public interface Observable {
    Notifier getNotifier();
}
