
/**
 * Creates a todoitem which is 
 * class that contains the 
 * description and priority of 
 * any item that is passed
 * @author Alan Rodriguez
 *
 */
public class ToDoItem implements Comparable<ToDoItem> {

	String description;
	int priority;
	
	/**
	 * Initites the private data values
	 * @param d is initiated to the descrption
	 * @param p is initieated to the priority
	 */
	ToDoItem(String d, int p){
		this.description = d;
		this.priority = p;
	}
	
	/**
	 * Returns the description data field
	 * @return description data field
	 */
	public String getDescription() {
		return this.description;
	}
	
	/**
	 * Return the priority data field
	 * @return priority data field
	 */
	public int getPriority() {
		return this.priority;
	}
	
	/**
	 * compares this class to another 
	 * instance of it
	 * @param obj is the object that is passed
	 * @return boolean if the two are the same
	 */
	public boolean equals(ToDoItem obj) {

		if(this.description.equals(obj.description)) {
			return true;
		}
		
		return false;
	}

	@Override
	/**
	 * Checks which instance has higher priority
	 * @param o is the object passed in
	 * @return priority determination
	 */
	public int compareTo(ToDoItem o) {
		if(priority < o.priority)
			return -1;
		else if (priority > o.priority)
			return 1;
		return 0;
	}
	
	@Override
	/**
	 * Returns a string representation of the class
	 */
	public String toString() {
		String result = "ToDoItem[description"
				+ "=" + description + ",priority=" 
				+ priority + "]";
		return result;
	}


}
