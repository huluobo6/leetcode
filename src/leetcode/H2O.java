package leetcode;

import java.util.concurrent.Semaphore;

public class H2O {

    private Semaphore h = new Semaphore(2);
    private Semaphore o = new Semaphore(0);

    public H2O() {

    }

    public void hydrogen(Runnable releaseHydrogen) throws InterruptedException {

        h.acquire(2);
        // releaseHydrogen.run() outputs "H". Do not change or remove this line.
        releaseHydrogen.run();
        o.release(2);
    }

    public void oxygen(Runnable releaseOxygen) throws InterruptedException {

        o.acquire(1);
        // releaseOxygen.run() outputs "O". Do not change or remove this line.
        releaseOxygen.run();
        h.release(1);
    }
}
