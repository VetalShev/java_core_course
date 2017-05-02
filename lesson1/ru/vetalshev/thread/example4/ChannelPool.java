package ru.vetalshev.thread.example4;

import java.util.Queue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import java.util.LinkedList;

public class ChannelPool<T> {
    //private final static int POOL_SIZE = 25; // размер пула
    private final Semaphore semaphore;
    private final Queue<T> resources = new LinkedList<>();

    public ChannelPool(Queue<T> source) {
        resources.addAll(source);
        semaphore = new Semaphore(resources.size(), true);
    }

    public T getResource(long maxWaitMillis) throws ResourсeException {
        try {
            if (semaphore.tryAcquire(maxWaitMillis, TimeUnit.MILLISECONDS)) {
                T res = null;
                synchronized (resources) {
                    res = resources.poll();
                }

                return res;
            }
        } catch (InterruptedException e) {
            throw new ResourсeException(e);
        }
        throw new ResourсeException(":превышено время ожидания");
    }

    public void returnResource(T res) {
        synchronized (resources) {
            resources.add(res); // возвращение экземпляра в пул
        }
        semaphore.release();
    }
}
