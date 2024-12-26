package practiceprograms;

public class Sumofnumbers1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name  = "Sshhshs099877klkl";
    	
    	StringBuilder digits = new StringBuilder();
    	
    	int value =0 ;
    	
    	
    	
    	for (Character c: name.toCharArray())
    	{
    	if (Character.isDigit(c))
    	{
    	digits.append(c);
    	 value = value+Character.getNumericValue(c);
    		
    	}}
    	
    	
    		System.out.println(value);
    	}
    

	}


