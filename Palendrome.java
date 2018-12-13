package junit;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class Palendrome {
 public PalendromeOfNumber object;
 	@Before
 	public void setup()
 	{
 	  object=new PalendromeOfNumber();
 	}
	@Test
	@Ignore
	public void positiveNumber() {
	boolean result=object.reverse(121);
		assertEquals(true,result);
	
	}
	@Test

	public void negativeNumber() {
	boolean result=object.reverse(-121);
	assertEquals(false,result);
			
	}
	@Test
	public void singleDigit() {
	boolean result=object.reverse(9);
	assertEquals(false,result);
			
	}

}
