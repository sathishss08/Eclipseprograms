package practiceprograms;

public class Arraymaximumvalue {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int ss [] = {4,5,9,7,53};
		
		System.out.println(maxvalue(ss));
		
	}
		
		public static int maxvalue(int arr[])
		{
			
			int maxvalue = arr[0];
			
		for (int i =1 ;i<5 ;i++)
		{
			
			if (arr[i]>maxvalue)
			{
				
				maxvalue= arr[i];
			}
		}
		return maxvalue;
			
			
		}

}
