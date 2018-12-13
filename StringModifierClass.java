
public class StringModifierClass {

	public String stringModifierMethod(String string, String word, int position) 
	{   
		String s2="";
		String[] splited = string.split("\\s+");
		for(int i=0;i<splited.length;i++)
		{
			//System.out.println(splited[i]);
			if(i==position-1 && splited[i].equals(word))
			{
				continue;
			}
			else
			{	
				if(i<splited.length-1){
					s2=s2.concat(splited[i]+" ");
				}else
				{
					s2=s2.concat(splited[i]);
				}
				
			}
			
		}
		System.out.println(s2);
		return s2;
			
	}

}
