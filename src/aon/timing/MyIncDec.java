package aon.timing;

public class MyIncDec implements IncDec {

    private int x;
    public MyIncDec(int x) {
        this.x = x;
    }

    @Override
    public void increment() {
        long startTime = getSystemTime();
        pauseIncrementOrDecrement();
        this.x++;
        System.out.println("time spent in increment() = " + (System.currentTimeMillis() - startTime) + " ms");
    }

    @Override
    public void decrement() {
        long startTime = getSystemTime();
        pauseIncrementOrDecrement();
        this.x--;
        System.out.println("time spent in decrement() = " + (System.currentTimeMillis() - startTime) + " ms");
    }

    @Override
    public Long getSystemTime() {
        return System.currentTimeMillis();
    }

    private void pauseIncrementOrDecrement(){
        try { Thread.sleep(50); } catch (InterruptedException e) { }
    }


}
