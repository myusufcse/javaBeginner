package javaMultithreading;

class JavaThreadInterface implements Runnable{
    public void run(){
        for(int i=1;i<5;i++){
            try{Thread.sleep(500);}catch(InterruptedException e){System.out.println(e);}
            System.out.println(Thread.currentThread().getName() +" --> "+ i);
        }
    }
    public static void main(String[] args){
        JavaThreadInterface jti1=new JavaThreadInterface();
        JavaThreadInterface jti2=new JavaThreadInterface();
        Thread t1 = new Thread(jti1);
        Thread t2 = new Thread(jti2);
        Thread t3 = new Thread(jti2);
        t3.setPriority(Thread.MAX_PRIORITY);
        t1.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
    }
}