public class Main {
    public static void main(String[] args) {

        ThreadDemo thread1 = new ThreadDemo("Thread1");
        thread1.start();

        ThreadDemo thread2 = new ThreadDemo("Thread2");
        thread2.start();

    }
}