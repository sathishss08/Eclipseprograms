package practicecode.practicecode;

public class A_Static_Variable {

	static int count=0; 	

	A_Static_Variable(){   

		count++;                                                                   

		System.out.println(count);  

		}  

	public static void main(String[] args) {

		A_Static_Variable var1= new A_Static_Variable();

		A_Static_Variable var2= new A_Static_Variable();

		A_Static_Variable var3= new A_Static_Variable();

	}	


	}


