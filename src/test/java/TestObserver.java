public class TestObserver implements Observer {

    private int updateCount = 0;

    public void update() {
        updateCount++;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}
