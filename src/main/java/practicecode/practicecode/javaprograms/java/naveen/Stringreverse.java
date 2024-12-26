package naveen;

public class Stringreverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
	String S = "i have mobile";
	
//	int len = S.length();
	
	String rev= "";
	
	String [] temp = S.split(" ");
	
	for(int i = temp.length-1;i>=0;i--)
		
	{
		
		rev= rev+ temp[i]+" ";
		
		
	}	
	
	System.out.println(rev);
	}

	}
