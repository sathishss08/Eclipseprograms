package naveen;

public class Reversenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int givennumber = 234;

int reversenumber =0;


while(givennumber !=0)
{
	
reversenumber = reversenumber*10;

reversenumber = reversenumber+givennumber%10;

givennumber= givennumber/10;

}

System.out.println(reversenumber);
	
	
	
}

	}

