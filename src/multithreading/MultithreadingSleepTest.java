package multithreading;


/*
 * 1.)Create a MultithreadingSleepTest that extends the Thread class
 * 2.)Implement the run method with a for loop that iterates 50 times
 * 3.)Surround Thread.sleep with a try,catch block and sleep for 500 ms
 * 4.)Print out the results of i outside of the try,catch block
 * 
 * 
 */
public class MultithreadingSleepTest extends Thread {
	
	public void run() {
		for(int i = 1;i <= 50;i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		
		MultithreadingSleepTest t1 = new MultithreadingSleepTest();
		t1.start();

	}

}
