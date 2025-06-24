package thread;

public class ExtendedThread extends Thread  {
	public ExtendedThread(String name) {
        super(name);
    }

    public void run() {
        System.out.println("Inside run() of ExtendedThread = Thread Name: " + this.getName() +", Priority: " + this.getPriority() +", State: " + this.getState());

    }
}