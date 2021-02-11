import org.junit.Assert;
import org.junit.Test;

public class AllObserversNotifierTest {

    @Test
    public void shouldNotifyAllObservers(){
        TestObservable observable = new TestObservable();
        Notifier notifier = observable.getNotifier();

        TestObserver observer1 = new TestObserver();
        TestObserver observer2 = new TestObserver();

        notifier.addObserver(observer1);
        notifier.addObserver(observer2);

        notifier.notifyObservers();

        Assert.assertEquals(1, observer1.getUpdateCount());
        Assert.assertEquals(1, observer2.getUpdateCount());
    }
}
