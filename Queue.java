// This class implements the Queue
public class Queue<V> implements QueueInterface<V>{

    //TODO Complete the Queue implementation
    private NodeBase<V>[] queue;
    private int capacity, currentSize, front, rear;   // Find use of Front and Rear
	
    public Queue(int capacity) {
    	this.capacity=capacity;
    	queue= new NodeBase[this.capacity];
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
    }
    }

    public NodeBase<V> dequeue() {
    	if(!isEmpty()) {
    	NodeBase<V> ret=queue[0];
    	queue[0]=null;
    	for(int i=1;i<this.currentSize;i++) {
    		queue[i-1]=queue[i];
    	}
    	queue[this.currentSize-1]=null;
    	this.currentSize--;
    	return ret; 
    	}
    	else
    		return null;
    }
    
    public void add(int priority, V value) {
       	Node<V> n= new Node(priority,value);
       	enqueue(n);
    }

}

