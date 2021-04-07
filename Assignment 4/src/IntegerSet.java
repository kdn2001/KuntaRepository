import java.util.ArrayList;
import java.util.List;

public class IntegerSet {

	// Hint: probably best to use an array list. You will need to do a little
	// research
	private List<Integer> set;

	public IntegerSet() {
		set = new ArrayList<Integer>();
	}
	
private List<Integer> getSet() {
	return set;
}
	
	
	// Clears the internal representation of the set
	public void clear() {
		set = new ArrayList<Integer>();

	};

	/*
	 * Returns true if the 2 sets are equal, false otherwise; Two sets are equal if
	 * they contain all of the same values in ANY order.
	 */
	public boolean equals(IntegerSet b) {
		if (set.size() != b.length())
			return false;
		
		for (Integer element: set) {
			if (!b.contains(element))
				return false;	
		}  
			

		return true;

	};

	// Returns true if the set contains the value, otherwise false
	public boolean contains(int value) {

		Integer x = Integer.valueOf(value);
		if (set.contains(x))
			return true;

		return false;
	};

	// Returns the largest item in the set; Throws a IntegerSetException if the set
	// is empty
	public int largest() throws IntegerSetException {
		if (set.size() == 0)
			throw new IntegerSetException();
					
		int largest_element = set.get(0);
		for (Integer element: set) {
			if (element > largest_element)
				largest_element = element;
			
		}
		
		
		return largest_element;
	};

	// Returns the smallest item in the set; Throws a IntegerSetException if the set
	// is empty
	
	public int smallest() throws IntegerSetException {
		if (set.size() == 0)
			throw new IntegerSetException();
					
		int smallest_element = set.get(0);
		for (Integer element: set) {
			if (element < smallest_element)
				smallest_element = element;
			
		}
		
		
		return smallest_element;
	};

	// Adds an item to the set or does nothing it already there
	public void add(int item) {

		if (set.contains(item))
			return;

		set.add(item);

	}; // adds item to s or does nothing if it is in set

	// Removes an item from the set or does nothing if not there
	public void remove(int item) {
		if (set.indexOf(item) != -1)
			set.remove(Integer.valueOf(item));

	};

	// Set union
	public IntegerSet union(IntegerSet intSetb) {
		IntegerSet firstSet = new IntegerSet();
		for (Integer element:set) {
			firstSet.add(element);
		}
		
		for (Integer element:intSetb.getSet()) {
			firstSet.add(element);
		}
		return firstSet;
		
	};

	// Returns the length of the set
	public int length() {
		return set.size();
	
	}

	// Set intersection
	public IntegerSet intersect(IntegerSet intSetb) {
		IntegerSet firstIntegerSet = new IntegerSet();
		for(Integer element:set) {
			if  (intSetb.contains(element))
				firstIntegerSet.add(element);
		}
return firstIntegerSet;
	};

	// Set difference, i.e., s1 –s2
	public void diff(IntegerSet intSetb) {
		
		
		
	}// set difference, i.e. s1 - s2
		
	// Returns true if the set is empty, false otherwise
	boolean isEmpty() {

		
		return set.isEmpty(); 
		
	}

	// Return String representation of your set
	public String toString() {
		return set.toString();

	}; // return String representation of your set

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}
