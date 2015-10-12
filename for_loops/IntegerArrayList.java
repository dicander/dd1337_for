package lecture;

public class IntegerArrayList {
	private int size;
	private int[] values;
	private static final int INITIAL_CAPACITY = 10;
	
	/**
	 * Creates an IntegerArrayList with an initial capacity of 10.
	 */
	public IntegerArrayList() {
		this.size = 0;
		this.values = new int[INITIAL_CAPACITY];
	}
	

	// Returns a String with the state of some variables.
	private String getState() {
		return 	"size: " + this.size + "\n" +
				"capacity" + this.values.length + "\n" +
				"values: " + this.values + "\n";
	}
	
	
	// Doubles the capacity and copies the old elements.
	private void extend() {
		int newSize = this.values.length*2;
		int[] newValues = new int[newSize];
		System.arraycopy(this.values, 0, newValues, 0, this.size);
		this.values = newValues;
	}
	
	/**
	 * Inserts value into the array at position index.
	 * @param index The position for our new int
	 * @param value The integer we want to insert
	 * @throws IndexOutOfBoundsException if index<0 || index > size()
	 */
	public void add(int index, int value) 
	throws IndexOutOfBoundsException {
		if(index<0||index>size) {
			throw new IndexOutOfBoundsException("IntegerArrayList.add " +
					"was in state\n" + getState() +
					" and was called with " +
					"index: " + index + "\n" +
					"value: " + value + "\n");
		}
		++size;
		if(size>=this.values.length) {
			extend();
		}
		for(int i = size-1; i > index; --i) {
			this.values[i] = this.values[i-1];
		}
		this.values[index] = value;
	}
	
	/**
	 * Returns the size of the IntegerArrayList
	 * @return the size of the IntegerArrayList
	 */
	public int size() {
		return this.size;
	}
}
