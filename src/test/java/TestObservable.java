/**
 * An {@link Observable} for tests that will use a {@link AllObserversNotifier} to keep {@link Observer} objects
 * informed on any changes.
 */
public class TestObservable implements Observable {

    private Notifier notifier;

    public TestObservable() {
        notifier = new AllObserversNotifier();
    }

    public Notifier getNotifier() {
        return notifier;
    }
}
