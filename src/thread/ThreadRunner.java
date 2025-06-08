package thread;

import java.util.Scanner;

public class ThreadRunner {
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		 int choice;
		try{
	do{
		 System.out.println("\nSelect a operation:");
		 System.out.println("1. Start a thread by extending Thread class");
         System.out.println("2. Start a thread using Runnable interface");
         System.out.println("3. Compare Extended Thread and Runnable Thread");
         System.out.println("4. Create multiple threads with custom sleep time (Extended & Runnable)");
		 System.out.println("0. Exit");
		 System.out.println("Enter you choice...");

		 choice = scanner.nextInt();scanner.nextLine();
	 switch (choice)
		 {
case 1:
		System.out.print("Enter thread name: ");
		String threadName = scanner.nextLine();
		ExtendedThread thread = new ExtendedThread(threadName);
		System.out.println("Before start() -> Thread Name: " + thread.getName() +", Priority: " + thread.getPriority() +", State: " + thread.getState());
		thread.start();
		try {
            Thread.sleep(1000);
        } catch (Exception e) {
        	System.out.println("An error occurred in case: " + e.getMessage());
        }
		System.out.println("After start() -> Thread Name: " + thread.getName() +", Priority: " + thread.getPriority() +", State: " + thread.getState());
		 break;
		 
case 2:
	//System.out.println("case2");
	System.out.print("Enter thread name: ");
	String threadNameRun = scanner.nextLine();
		RunnableThread task = new RunnableThread();
        Thread threads = new Thread(task, threadNameRun);
        System.out.println("Before start() -> Thread Name: " + threads.getName() +", Priority: " + threads.getPriority() +", State: " + threads.getState());
        threads.start();
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
        	System.out.println("An error occurred in case: " + e.getMessage());
        }
        System.out.println("After start() -> Thread Name: " + threads.getName() +", Priority: " + threads.getPriority() +", State: " + threads.getState());
        break;
case 3: 
    //System.out.println("case3");
    System.out.print("Enter thread name for extendedthread : ");
	String threadNameext = scanner.nextLine();
	System.out.print("Enter thread name for runnable thread : ");
	String threadNameRunnable = scanner.nextLine();
        ExtendedThread ext = new ExtendedThread(threadNameext);
        RunnableThread run = new RunnableThread();
        Thread runThread = new Thread(run, threadNameRunnable);

        System.out.println("Before start of ExtendedThread = Name: " + ext.getName()+ ", Priority: " + ext.getPriority()+ ", State: " + ext.getState());
        ext.start();
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
        	System.out.println("An error occurred in case: " + e.getMessage());
        }
        System.out.println("After start of ExtendedThread = Name: " + ext.getName()+ ", Priority: " + ext.getPriority()+ ", State: " + ext.getState());

        System.out.println("Before start of RunnableThread = Name: " + runThread.getName()+ ", Priority: " + runThread.getPriority()+ ", State: " + runThread.getState());
        runThread.start();
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
        	System.out.println("An error occurred in case: " + e.getMessage());
        }
        System.out.println("After start of RunnableThread = Name: " + runThread.getName()+ ", Priority: " + runThread.getPriority() + ", State: " + runThread.getState());
        break;
case 4:
        //System.out.println("case4,5");
        System.out.print("Enter thread name for ExtendedThreads : ");
		String threadNameextended = scanner.nextLine();
        System.out.print("Enter the seconds for ExtendedThreads to  sleep : ");
        int extendedSleepTime = scanner.nextInt();scanner.nextLine();
		System.out.print("Enter thread name for RunnableThreads : ");
		String threadNamerun = scanner.nextLine();
        System.out.print("Enter the seconds for RunnableThreads to  sleep : ");
        int runnableSleepTime = scanner.nextInt();scanner.nextLine(); 
       
        for (int i = 1; i <= 5; i++) {
        	String threadNames = threadNameextended + i;
        	int sleepTime = extendedSleepTime * 1000;
            ExtendedThreads extThread = new ExtendedThreads(threadNames,sleepTime);
            extThread.start();
        }
       for (int i = 1; i <= 5; i++) {
    	   String threadNames =threadNamerun + i;
           int sleepTime = runnableSleepTime * 1000;;
    	   RunnableThreads tasks = new RunnableThreads(threadNames, sleepTime);
           Thread threads1 = new Thread(tasks,threadNames);
           threads1.start();
        }
         
       System.out.println("\nSelect a operation:");
case 0:
			 System.out.println("Exiting...");
			 break;
			 default:
			 System.out.println("Invalid choice. Please try again.");
			 }
			 }while(choice !=0);
			 } finally {
			 scanner.close();
			 }
	
	}
}

