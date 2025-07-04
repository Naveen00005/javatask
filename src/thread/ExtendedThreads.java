package thread;
class ExtendedThreads extends Thread {
    private String threadName;
    private int sleepTime;

    public ExtendedThreads(String threadName, int sleepTime) {
        this.threadName = threadName;
        this.setName(threadName);
        this.sleepTime = sleepTime;
    }

    public void run() {
        System.out.println("Going to Sleep: " + threadName);
        try {
            Thread.sleep(sleepTime); 
        } catch (InterruptedException e) {
            System.out.println(threadName + " was interrupted during sleep.");
        }
        System.out.println("After sleeping: " + threadName);
    }
}