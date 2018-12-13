package junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class ExceptionDivision {

	@Test(expected = IndefiniteValueException.class)
	public void division() throws IndefiniteValueException {
		// fail("Not yet implemented");
		Division object = new Division();
		object.divide(5,0);
	}

	@Test
	public void division1() throws IndefiniteValueException {
		Division object = new Division();
		object.divide(5,1);
	}
}
