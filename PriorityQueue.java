
public class PriorityQueue<V> implements QueueInterface<V>{

    private NodeBase<V>[] queue;
    private int capacity, currentSize;
	
    //TODO Complete the Priority Queue implementation
    // You may create other member variables/ methods if required.
    public PriorityQueue(int capacity) { 
    	this.capacity=capacity;
    	queue=new NodeBase[this.capacity];
     }

    public int size() {
    	int ret=0;
    	for(int i=0;i<this.capacity;i++) {
    		if(queue[i]!=null)
    			ret++;
    	}
    	this.currentSize=ret;
    	return this.currentSize;
    }

    public boolean isEmpty() {
    	if(this.currentSize==0)
    		return true;
    	else
    		return false;
    }
	
    public boolean isFull() {
    	if(this.currentSize==this.capacity)
    		return true;
    	else
    		return false;
    }

    public void enqueue(Node<V> node) {
    	if(!isFull()) {
       	queue[this.currentSize]=node;
       	this.currentSize++;
       	// Sorting the array
         for (int i = 0; i < this.currentSize-1; i++) {
             for (int j = 0; j < this.currentSize-i-1; j++) {
            	 if(queue[j]!=null && queue[j+1]!=null) {
                 if ((queue[j]).getPriority() > (queue[j+1]).getPriority())
                 {
                     // Swapping
                     NodeBase<V> temp = queue[j];
                     queue[j] = queue[j+1];
                     queue[j+1] = temp;
                 }
             }
         }
         }
    	}
         
         
    	
         
}  // Array must be enqueued to be sorted

    // In case of priority queue, the dequeue() should 
    // always remove the element with minimum priority value
    public NodeBase<V> dequeue() {
    	if(!isEmpty()) {
    	NodeBase<V> ret=queue[0];
    	queue[0]=null;
    	for(int i=1;i<this.currentSize;i++) {
    		queue[i-1]=queue[i];
    	}
    	queue[this.currentSize-1]=null;
    	this.currentSize--;
    	return ret;   // First element removed from Sorted array and all elements shifted to left
    }
    	else
    		return null;
    }

    public void display () {
	if (this.isEmpty()) {
            System.out.println("Queue is empty");
	}
	for(int i=0; i<currentSize; i++) {
            queue[i].show();   // Changed to i from i+1
	}
    }
    
    public void add(int priority, V value) {
       	Node<V> n= new Node(priority,value);
       	enqueue(n);
    }
    
}

