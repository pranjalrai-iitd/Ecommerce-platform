import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Buyer<V> extends BuyerBase<V> {

	
    public Buyer (int sleepTime, int catalogSize, Lock lock, Condition full, Condition empty, PriorityQueue<V> catalog, int iteration) {
        //TODO Complete the Buyer Constructor method
        // ...
    	this.catalog=catalog;
    	setIteration(iteration);
    	setSleepTime(sleepTime);
    	this.lock=lock;
    	this.full=full;
    	this.empty=empty;
    	
    }
    public void buy() throws InterruptedException {
    	lock.lock();
    	
    	
	try {
            //TODO Complete the try block for consume method
            // ...
		
		while(catalog.size()==0) {
			empty.await();
		}
		
		NodeBase<V> n=catalog.dequeue();
        
		
		
	    System.out.print("Consumed "); // DO NOT REMOVE (For Automated Testing)
            n.show(); // DO NOT REMOVE (For Automated Testing)
            // ...
            full.signalAll();
	} catch (Exception e) {
            e.printStackTrace();
	} finally {
            //TODO Complete this block
		lock.unlock();
	}
    }
    
}
