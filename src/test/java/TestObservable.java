/**
 * An {@link Observable} for tests that will use a {@link AllObserversNotifier} to keep {@link Observer} objects
 * informed on any changes.
 */
public class TestObservable implements Observable {

    private Notifier notifier;

    public TestObservable() {
        notifier = new AllObserversNotifier();
    }


    @Override
    public NotifiesObservers getNotifier() {
        return notifier;
    }

    public void change() {
        this.notifier.notifyObservers();
    }
}
