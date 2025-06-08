package thread;

public class RunnableThread implements Runnable {

    public void run() {
        Thread currentThread = Thread.currentThread();
        System.out.println("Inside run() of runnable thread = Thread Name: " + currentThread.getName() +", Priority: " + currentThread.getPriority() +", State: " + currentThread.getState());
    }

}
