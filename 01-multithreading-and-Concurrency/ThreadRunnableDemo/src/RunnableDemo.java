
import java.awt.*;

public class RunnableDemo implements Runnable{
    private Thread t;
    private String threadName;


    //Step 2: Instantiate a Thread Object
    RunnableDemo(String threadName){
        this.threadName=threadName;
    }

    //Step1: Implement run() method
    @Override
    public void run() {
        System.out.println("Running " + threadName);

        try {
            for (int i = 4; i > 0 ; i--) {
                System.out.println("Thread " + threadName + "      " + i);
                Thread.sleep(5000);
            }
        }catch (InterruptedException e){
            System.out.println("Thread " + threadName + "interrupted. ");
        }

        System.out.println("Thread " + threadName + " exiting. ");
    }

    public void start(){
        System.out.println("Starting  " + threadName);
        if (t == null){
            t = new Thread(this, threadName);
            t.start(); // ← THIS calls run() automatically!
        }
    }


}
/*
Starting Thread-1
Starting Thread-2

 */