package javaMultithreading;

import java.util.Objects;

class JavaThreadLambda{
    public static void main(String[] args){
        Runnable r = () -> {
            Thread ct = Thread.currentThread();
            while(!ct.isInterrupted()){
                for(int i=1;i<5;i++){
                    try{Thread.sleep(500);}catch(InterruptedException e){System.out.println(e);}
                    System.out.println(Thread.currentThread().getName() +" --> "+ i);
                }
                return;
            }
        };

        Thread t1 = new Thread(r);
        Thread t2 = new Thread(r);
        t1.start();
        t2.start();
        t1.interrupt();
        System.out.println("Check t1 Thread isAlive : " +t1.isAlive());
        System.out.println("Check t1 Thread state : " +t1.getState());

    }
}