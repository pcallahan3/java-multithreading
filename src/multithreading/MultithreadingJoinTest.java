package multithreading;

/*
 * 1.)Create a MultithreadingJoinTest class that extends the Thread class
 * 2.)Implement the run() method 
 *         a.)Print out ("Thread started" + Thread.currentThread().getName())
 *         b.)Create a try,catch block and sleep the Thread for a 1000 ms
 *         c.)Print out outside of try,catch block ("Thread ended"+Thread.currentThread().getName())
 * 3.)In main() method create 3 Thread objects
 * 4.)Call start() on first Thread object and create a try,catch block and join first Thread object for 1000 ms
 * 5.)and create a try,catch block and join first Thread object for 1000 ms
 * 6.)Call start() method on 2nd Thread object and create a try,catch block and join first Thread object for 1000 ms
 * 7.)Call start() method on 3rd Thread object and create a try,catch block and join first,2nd,3rd Thread objects
 * 8.)Print out "All threads are done executing"
 * 
 */

public class MultithreadingJoinTest extends Thread {
	
	
	@Override
    public void run() {
        System.out.println("Thread started: "+ Thread.currentThread().getName());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread ended: "+ Thread.currentThread().getName());
    }


	
	
	
public static void main(String[] args) {
    Thread t1 = new Thread(new MultithreadingJoinTest(), "t1");
    Thread t2 = new Thread(new MultithreadingJoinTest(), "t2");
    Thread t3 = new Thread(new MultithreadingJoinTest(), "t3");
    
    t1.start();
    
   
    try {
        t1.join(1000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    
    //Start 2nd thread after waiting for 1 seconds or if it's dead
    t2.start();
    
    //start third thread only when first thread is dead
    try {
        t1.join();
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    
    t3.start();
    
    //let all threads finish execution before finishing main thread
    try {
        t1.join();
        t2.join();
        t3.join();
    } catch (InterruptedException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }
    
    System.out.println("All threads are done executing");
}

}


    




