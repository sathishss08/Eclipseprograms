package practicecode.practicecode.javaprograms.java;


public class Stringreverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String S ="sathish";
		
		int len = S.length();
		
		String rev ="";
		
		for(int i =len-1;i>=0;i--)
		{
			rev= rev+S.charAt(i);
		
		}
		System.out.println(rev);

		System.out.println(len);
	}

}
