package javaMultithreading;

import java.util.stream.IntStream;

public class JavaThreadSync {
    public synchronized void a() {
        System.out.println("\nA "+Thread.currentThread().getName());
        IntStream.range(1,50).filter(i -> i%2 == 0).limit(5).forEach(i ->System.out.print(i+" "));
    }
    public static synchronized void b() {
        System.out.println("\nB "+Thread.currentThread().getName());
        IntStream.range(1,50).filter(i -> i%3 == 0).limit(5).forEach(i ->System.out.print(i+" "));
    }
    public void c() {
        System.out.println("\nC "+Thread.currentThread().getName());
        IntStream.range(1,50).filter(i -> i%5 == 0).limit(5).forEach(i ->System.out.print(i+" "));
    }
    public static void main(String[] args){
        JavaThreadSync jts = new JavaThreadSync();
        Runnable r = () -> {
            jts.a();
            // JavaThreadSync.b();
            synchronized (jts) {
                jts.c();
                try {
                    jts.wait(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        Thread t1 = new Thread(r, "myThread1");
        Thread t2 = new Thread(r,"myThread2");
        t1.setDaemon(true);
        t1.start();
        t2.start();

    }
}