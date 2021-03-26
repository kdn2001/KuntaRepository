

public class Driver {

	public void testIsEmpty() {

		
	IntegerSet firstSet = new IntegerSet();
	System.out.println("isEmpty should return true");
	System.out.println(firstSet.isEmpty());
	
	firstSet.add(3);
	System.out.println("isEmpty should return false");
	System.out.println(firstSet.isEmpty());
	}
	
public void testContains() {
		
	
		
	}

	public static void main(String args[]) {

		Driver driver = new Driver();

		driver.testIsEmpty();

	




	}

}
