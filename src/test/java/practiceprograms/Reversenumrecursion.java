package practiceprograms;

public class Reversenumrecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int num = 123;
		
		while(num >0) {
			
			int rev = num %10;
		
			
			System.out.print(rev + " ");
			
			num = num/10;
		}
			
		}
		
		

}
