package thread;

public class ExtendedThread extends Thread  {
	public ExtendedThread(String name) {
        super(name);
    }

    public void run() {
        System.out.println("Inside run() of ExtendedThread = Thread Name: " + this.getName() +", Priority: " + this.getPriority() +", State: " + this.getState());

    }
}


/*package thread;

public class ExtendedThread extends Thread {
    
    public ExtendedThread(String name) {
        super(name); // Set custom thread name using superclass constructor
    }

    @Override
    public void run() {
    	
        System.out.println("Inside run() -> Thread Name: " + this.getName() +", Priority: " + this.getPriority() +", State: " + this.getState());


        System.out.println("Going to sleep: " + getName());
        try {
            Thread.sleep(60000);
        } catch (InterruptedException e) {
            System.out.println(getName() + " was interrupted during sleep.");
        }

        System.out.println("After sleeping: " + getName());
    }
}
*/