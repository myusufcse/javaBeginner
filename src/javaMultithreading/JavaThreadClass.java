package javaMultithreading;

class JavaThreadClass extends Thread{
    public void run(){
        for(int i=1;i<5;i++){
            try{Thread.sleep(500);}catch(InterruptedException e){System.out.println(e);}
            System.out.println(Thread.currentThread().getName() +" --> "+ i);
        }
    }
    public static void main(String[] args){
        JavaThreadClass t1=new JavaThreadClass();
        JavaThreadClass t2=new JavaThreadClass();
        JavaThreadClass t3=new JavaThreadClass();

        t1.start();
        try {
            t1.join(); // waits for a current t1 thread to die.
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t2.start();
        t3.start();
    }
}