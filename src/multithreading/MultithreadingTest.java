package multithreading;


/*
 * 1.)Create MultithreadingTest class that extends the Thread class
 * 2.)Implement run() method in MultithreadingTest
 * 3.)Create MultithreadingRunnable inner class that implements the Runnable interface
 * 4.)Override and implement the run() method in MultithreadingRunnable inner class
 * 5.)Create printRunnableThread() method that declares and initializes a MultithreadingRunnable object and call the 
 *    run() method on the object
 * 
 */
public class MultithreadingTest extends Thread {
	
	
	   //MultithreadingRunnable inner class
	   private class MultithreadingRunnable implements Runnable {
	    
		//MultithreadingTest inner class
		public void run() {
			System.out.println("Hello from the Runnable interface");
		
		}
		
	}
	   
	   // Accessing MultithreadingRunnable inner class from the method within
	   void printRunnableThread() {
	      MultithreadingRunnable runnableInnerClass = new MultithreadingRunnable();
	      runnableInnerClass.run();
	   }
	   

	   //MultithreadingTest run() method
	   public void run() {
		   System.out.println("Hello from Thread class");
	   }

	public static void main(String[] args) {
		
		MultithreadingTest t1 = new MultithreadingTest();
		t1.start();
		
		MultithreadingTest t2 = new MultithreadingTest();
		t2.printRunnableThread();

	}

}
