package practiceprograms;

import java.util.ArrayList;
import java.util.Iterator;

public class Itreatorname {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ArrayList<String> name = new ArrayList<String>();
		
		name.add("sathish");
		
		name.add("kumar");
		name.add("janani");
		
		Iterator<String> namelist = name.iterator();
		while(namelist.hasNext())
		System.out.println("names:"+ namelist.next());

	}

}
