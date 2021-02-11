import java.util.ArrayList;
import java.util.Collection;

/**
 * A {@link Notifier} that notifies all {@link Observer} objects that are interested in the {@link Observable} object.
 */
public class AllObserversNotifier implements Notifier {
    private Collection<Observer> observers;

    public AllObserversNotifier() {
        observers = new ArrayList<Observer>();
    }

    public void addObserver(Observer observer){
        if (!observers.contains(observer)){
            observers.add(observer);
        }
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
