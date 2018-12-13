package junit;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SubtractionOfTwoNumbers {
 private Subtraction object;
 	@Before
 	public void setup()
 	{
 		object=new Subtraction();
 	}
	@Test
	public void subtractTwoPositiveNumbers() {
		int answer=object.subtractionofnumbers(50,50);
    	assertEquals(0,answer);
		//fail("Not yet implemented");
	}
	@Test
	public void subtractOneNegativeNumbers() {
		int answer=object.subtractionofnumbers(-50,50);
    	assertEquals(-100,answer);
		//fail("Not yet implemented");
	}
	@Test
	public void subtractTwoNegativeNumbers() {
		int answer=object.subtractionofnumbers(-50,-50);
    	assertEquals(0,answer);
		//fail("Not yet implemented");
	}
	@Test
	public void subtractOneZeroNumbers() {
		int answer=object.subtractionofnumbers(0,-50);
    	assertEquals(50,answer);
		//fail("Not yet implemented");
	}
	@Test
	public void subtractOnePositiveNumbers() {
		int answer=object.subtractionofnumbers(50,0);
    	assertEquals(50,answer);
		//fail("Not yet implemented");
	
	}
	
	
}
