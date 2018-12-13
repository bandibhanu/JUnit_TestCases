package junit;

public class Division {



	public int divide(int numberOne, int numberTwo) throws IndefiniteValueException
	{
		int result;
		
		if(numberTwo==0) 
			throw new IndefiniteValueException();
		else {
			result=numberOne/numberTwo;
			return result;
		}
	
	}
}


