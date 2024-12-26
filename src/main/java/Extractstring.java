

public class Extractstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String S = "Sathish1234$5@(j";
		
		
		StringBuffer name = new StringBuffer();
		
		
		char ch[]=S.toCharArray();
		
		
		for(Character value :ch)
		{
			if(Character.isLetter(value))
			{
				
				name.append(value);
			}
			
		}
		
		System.out.println(name);
		

	}

}
