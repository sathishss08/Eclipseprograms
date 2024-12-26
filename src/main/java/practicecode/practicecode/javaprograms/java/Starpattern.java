package practicecode.practicecode.javaprograms.java;

public class Starpattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String S = "janani";
		int len = S.length();
		
		
		for (int i=0;i<len;i++)
		{
			
			for (int j= i+1; j<len;j++)
			{
			char[] name = S.toCharArray();
			
			if (name[i]==name [j])
			{
				System.out.println(name[i]);
			}
		}}
		

	}

}
																	

