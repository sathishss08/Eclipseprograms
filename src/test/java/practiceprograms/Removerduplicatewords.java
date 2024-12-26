package practiceprograms;

import java.util.LinkedHashSet;
import java.util.Set;

public class Removerduplicatewords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String name = "my name name is sathish";
		
	String [] split  =name.split(" ");
	
	Set<String> value = new LinkedHashSet<String>();
	
	for(String i: split)
	{
		
		value.add(i);
		
		
	}
	System.out.println(value);
	

	}

}
