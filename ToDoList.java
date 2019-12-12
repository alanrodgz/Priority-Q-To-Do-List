
import java.util.PriorityQueue;

/**
 * Creates a priority queue of 
 * todoitem data types
 * @author Alan Rodriguez
 *
 */
public class ToDoList {
	
	PriorityQueue<ToDoItem> myQ; 
	
	/**
	 * Initiates the priority queue
	 */
	public ToDoList() {
		myQ = new PriorityQueue<ToDoItem>();
	}
	
	/**
	 * Adds items to the priority q
	 * @param item the itme added
	 */
	public void add(ToDoItem item) {
		myQ.add(item);
	}
	
	/**
	 * Returns the next value of the 
	 * priority q
	 * @return next value of the 
	 * priority q
	 */
	public ToDoItem nextItem() {
		return myQ.poll();
		
	}
	
	/**
	 * Checks if there is another 
	 * value to return in the 
	 * priority q
	 * @return boolean true if 
	 * there is another value to 
	 * return in the priority q
	 */
	public boolean hasNext() {
		if(myQ.peek() == null) {
			return false;
		}
		
		return true;
		
	}
	
	/**
	 * Returns the next value in '
	 * the priority q with out 
	 * removing it from the 
	 * priority q
	 * @return next value in the 
	 * priority q
	 */
	public ToDoItem peek() {
		return myQ.peek();
		
	}
}
