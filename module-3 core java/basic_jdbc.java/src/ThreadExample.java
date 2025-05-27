
public class ThreadExample {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new MyTask_Thread("Thread 1 is running"));
        Thread thread2 = new Thread(new MyTask_Thread("Thread 2 is running"));

        thread1.start(); // start first thread
        thread2.start(); // start second thread
    }
}