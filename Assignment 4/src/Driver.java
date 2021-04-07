

public class Driver {

	public void testIsEmpty() {

	// test empty set	
	IntegerSet firstSet = new IntegerSet();
	System.out.println("isEmpty should return true");
	System.out.println(firstSet.isEmpty());
	
	//add one element
	firstSet.add(3);
	System.out.println("isEmpty should return false");
	System.out.println(firstSet.isEmpty());
	
	//remove element in set
	firstSet.remove(3);
	System.out.println("isEmpty should return true");
	System.out.println(firstSet.isEmpty());
	
	}
	
public void testContains() {
	
	// test contains integer 
	IntegerSet firstSet = new IntegerSet();
	System.out.println("Contains should return false");
	System.out.println(firstSet.contains(0));
	
	// adds then checks for integer
	firstSet.add(1);
	System.out.println("Contains should return true");
	System.out.println(firstSet.contains(1));
	
		
	}

public void testEquals() {
	
	//Testing if set are unequal
	IntegerSet firstSet = new IntegerSet();
	IntegerSet secondSet = new IntegerSet();
	secondSet.add(3);
	
	System.out.print("Equals should return false: ");
	System.out.println(firstSet.equals(secondSet));
	
	//Testing if sets are equal
	firstSet.add(3);
	System.out.print("Equals should return true: ");
	System.out.println(firstSet.equals(secondSet));
	
}

public void testLargest() throws IntegerSetException {
	
	//Exception testing
	IntegerSet firstSet = new IntegerSet();
	try {
		firstSet.largest();
	} catch (IntegerSetException e) {
		// TODO Auto-generated catch block
		System.out.println("Task failed succesfully.");
	
	}
	
	//Testing for largest
	firstSet.add(3);
	firstSet.add(4);
	firstSet.add(5);
	
	firstSet.add((3));
	System.out.print("Largest should return 5: ");
	System.out.println(firstSet.largest());
}

public void testSmallest() throws IntegerSetException {
	
	//Exception testing
	IntegerSet firstSet = new IntegerSet();
	try {
		firstSet.smallest();
	} catch (IntegerSetException e) {
		// TODO Auto-generated catch block
		System.out.println("Task failed succesfully.");
	
	}
	
	//Testing for smallest
	firstSet.add(3);
	firstSet.add(4);
	firstSet.add(5);
	
	firstSet.add((5));
	System.out.print("Smallest should return 3: ");
	System.out.println(firstSet.smallest());
}

public void testLength() {
	
	IntegerSet firstSet = new IntegerSet();
	
	System.out.print("Length should return empty: ");
	System.out.println(firstSet.length());
	
	firstSet.add(1);
	System.out.print("Length should return filled: ");
	System.out.println(firstSet.length());
	
	
}

public void testAdd() {
	
	IntegerSet firstSet = new IntegerSet();
	
	
	System.out.print("Contains will return false: ");
	System.out.println(firstSet.contains(1));
	
	firstSet.add(1);
	System.out.print("Contains will return true: ");
	System.out.println(firstSet.contains(1));
	
}

public void testRemove() {
	
	IntegerSet firstSet = new IntegerSet();
	
	
	firstSet.add(1);
	System.out.print("Contains will return true: ");
	System.out.println(firstSet.contains(1));
	
	firstSet.remove(1);
	System.out.print("Contains will return false: ");
	System.out.println(firstSet.contains(1));
	
	
	
}

public void testIntersect() {
	
	IntegerSet firstSet = new IntegerSet();

	firstSet.add(1);
	firstSet.add(2);
	firstSet.add(3);
	
	IntegerSet secondSet = new IntegerSet();
	
	secondSet.add(3);
	secondSet.add(4);
	secondSet.add(5);
	
	IntegerSet thirdSet = firstSet.intersect(secondSet);
	System.out.print("Contains will return true: ");
	System.out.println(thirdSet.contains(3));
	System.out.print("Contains will return false: ");
	System.out.println(thirdSet.contains(4));
	System.out.print("Contains will return false: ");
	System.out.println(thirdSet.contains(5));

	
}

public void testtoString() {
	
	IntegerSet firstSet = new IntegerSet();
	firstSet.add(1);
	firstSet.add(2);
System.out.print("toString should return [1, 2]:  ");
	System.out.print(firstSet);
}

public void testUnion() {
	IntegerSet firstSet = new IntegerSet();
	firstSet.add(1);
	firstSet.add(2);
	firstSet.add(3);
	

	IntegerSet secondSet = new IntegerSet();
	secondSet.add(3);
	secondSet.add(4);
	secondSet.add(5);
	
	IntegerSet thirdSet = firstSet.union(secondSet);
	System.out.print("Contains should return true: ");
	System.out.println(thirdSet.contains(1));
	System.out.print("Contains should return true: ");
	System.out.println(thirdSet.contains(2));
	System.out.print("Contains should return true: ");
	System.out.println(thirdSet.contains(3));
	System.out.print("Contains should return true: ");
	System.out.println(thirdSet.contains(4));
	System.out.print("Contains should return true: ");
	System.out.println(thirdSet.contains(5));
	
	
}

public void testClear() {
	IntegerSet firstSet = new IntegerSet();
	firstSet.add(1);
	firstSet.add(2);
	System.out.print("Contains should return true: ");
	System.out.println(firstSet.contains(1));
	
	System.out.print("Contains should return true: ");
	System.out.println(firstSet.contains(2));
	
	firstSet.clear();
	System.out.print("Contains should return false: ");
	System.out.println(firstSet.contains(1));
	
	System.out.print("Contains should return false: ");
	System.out.println(firstSet.contains(2));
	
	
}
	


	public static void main  (String args[]) throws IntegerSetException {

		Driver driver = new Driver();

		System.out.println("testing Empty");
		driver.testIsEmpty();
		System.out.println();
		
		System.out.println("testing Contains");
		driver.testContains();
		System.out.println();
		
		System.out.println("testing Equals");
		driver.testEquals();
		System.out.println();
		
		System.out.println("testing Largest");
		driver.testLargest();
		System.out.println();
		
		System.out.println("testing Smallest");
		driver.testSmallest();
		System.out.println();
		
		System.out.println("testing Length");
		driver.testLength();
		System.out.println();
		
		System.out.println("testing Add");
		driver.testAdd();
		System.out.println();
		
		System.out.println("testing Remove");
		driver.testRemove();
		System.out.println();
		
		System.out.println("testing Intersect");
		driver.testIntersect();
		System.out.println();
		
		System.out.println("testing toString");
		driver.testtoString();
		System.out.println();
		
		System.out.println("testing Union");
		driver.testUnion();
		System.out.println();
		
		System.out.println("testing Clear");
		driver.testClear();
		System.out.println();
		
		
		




	}

}
