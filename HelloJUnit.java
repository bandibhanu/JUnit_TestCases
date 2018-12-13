package junit;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class HelloJUnit {
	private Additionoftwonumbers object1;

	@Before
	public void setup() {
	object1=new Additionoftwonumbers();	
	
	}
    @Test
    public void twoPositiveNumbers() throws additionNotRequired
    {
    	int answer=object1.Additonofnumber(50,50);
    	assertEquals(100,answer);
    }
    @Test
    public void twoNegativeNumbers() throws additionNotRequired
    {
    	int answer=object1.Additonofnumber(-50,-50);
    	assertEquals(-100,answer);
    }
    @Test
    public void oneNegativeNumbers() throws additionNotRequired
    {
    	int answer=object1.Additonofnumber(50,-50);
    	assertEquals(0,answer);
    }
    @Test
    public void zeroAndNegativeNumbers() throws additionNotRequired
    {
    	int answer=object1.Additonofnumber(0,-50);
    	assertEquals(-50,answer);
    }
    @Test
    public void zeroandpositivenumbers() throws additionNotRequired
    {
    	int answer=object1.Additonofnumber(0,50);
    	assertEquals(50,answer);
    }
    @Test(expected=additionNotRequired.class)
    public void bothGivenZero() throws additionNotRequired
    {
    	object1.Additonofnumber(0,0);
    }
    
}
