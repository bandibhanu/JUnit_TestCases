package junit;

public class PalendromeOfNumber {



	public boolean reverse(int i) {
		int temperary,sum=0;
		int temp=i;
		if(i>=10)
		{
		while(i > 0)
        {
            temperary= i % 10;
            sum = sum * 10 + temperary;
            i = i / 10;
        }
		 return sum==temp;
		}
		else{
		
			return false;
		}
	}

}
