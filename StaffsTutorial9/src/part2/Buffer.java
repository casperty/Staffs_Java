package part2;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author Alexandre Ravaux
 */
public class Buffer {
    private Queue<Integer> theData;
    private final int MAX;  // maximum size of the buffer
    private int numItems;


    public Buffer (int MAX){
	this.MAX = MAX;
  	this.theData = new LinkedList<Integer>();
        this.numItems = 0;
    }

    public synchronized int getNext(int numConsumer) throws InterruptedException{
	while (theData.size() == 0) {
            System.out.println("Consumer " + numConsumer + " attempting to remove from empty buffer - wait");
            wait();
        }
        int data = theData.remove();
	--numItems;
        System.out.println("Consumer " + numConsumer + " retrieved " + data + " from buffer: " + theData.toString() );
	notifyAll();
	return data;
    }

    public synchronized void add(int data, int numProducer) throws InterruptedException{
	while (numItems == MAX) {
            System.out.println("Producer " + numProducer +" attempting to add to full buffer - wait");
            wait(); 
        }
        theData.add(data);
        System.out.println("Producer " + numProducer + " added " + data + " to buffer:" + theData.toString() );
	++numItems;
	notifyAll();
    }
    
}
