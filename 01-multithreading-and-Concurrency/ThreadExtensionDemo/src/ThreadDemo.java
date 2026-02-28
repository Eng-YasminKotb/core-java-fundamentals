public class ThreadDemo extends Thread{
    private Thread th;
    private String threadName;


    public ThreadDemo(String threadName){
        this.threadName=threadName;
        System.out.println("creating " + threadName );
    }

    @Override
    public void run() {
        try {
            System.out.println("Thread " + threadName );
            for(int i=0 ;i<4 ; i++){

                System.out.println("Running" + threadName + ", " + i );
                Thread.sleep(5000);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread " + threadName + " interrupted." );
        }
        System.out.println("Thread " + threadName + " existing." );
    }

    @Override
    public void start() {
        System.out.println("Starting " + threadName );
        if (th == null){
            th = new Thread(this, threadName);
            th.start();
        }
    }
}
