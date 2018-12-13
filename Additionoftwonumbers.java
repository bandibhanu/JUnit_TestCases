package junit;

public class Additionoftwonumbers {

	public int Additonofnumber(int i, int j) throws additionNotRequired {
		// TODO Auto-generated method stub
		if(i==0&&j==0)
		throw new additionNotRequired();
		else
		{
		return(i+j);
		}
	}

	

}
