package junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class RemovingArrayValueFromList {

	@Test
	public void test() 
	{ int conformArray[]=new int[4];
		int arrayList[]={1,2,3,4,5};
		int arrayList1[]={1,3,4,5};
		ArraayValueRemove object=new ArraayValueRemove();
		conformArray=object.arrayValueRemove(arrayList);
		assertArrayEquals(arrayList1,conformArray);
		//	fail("Not yet implemented");
	}

}
