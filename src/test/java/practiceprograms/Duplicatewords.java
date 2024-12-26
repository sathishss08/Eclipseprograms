package practiceprograms;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Duplicatewords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String S = "Automation";
		Set<Character> name = new LinkedHashSet<Character>();
		char ch[] =S.toCharArray();
		
		
		for (int i=0 ; i<ch.length;i++)
		{
			
		if(name.add(ch[i]));
			
		
			
			
		}
		System.out.println(name);

	}

}
