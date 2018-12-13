import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.Test;


public class StringInputClass {

	@Test
	public void test() {
		StringModifierClass object=new StringModifierClass();
		
		String string="A    MORNING WALK IS A IS BLESSING FOR   THE  WHOLE DAY.";
		
	
		String word="IS";
		int position=6;
		String returnedString=object.stringModifierMethod(string,word,position);
		String verifiedString="A MORNING WALK IS A BLESSING FOR THE WHOLE DAY.";
	
		assertEquals(verifiedString,returnedString);
		
	}

	
		
	

}
