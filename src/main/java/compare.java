import java.util.Arrays;

public class compare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		int arr[] = {2,5,0,4,8,9,6};
		
		
		int temp =0;
		
		for(int i=0 ;i<arr.length;i++)
		{
			
			for(int j=0;j<arr.length-1-i;j++)
			{
				
				
			if(arr[j]>arr[j+1])
			{
				
				temp=arr[j];
				arr[j]=arr[j+1];
				
				arr[j+1]=temp;
			}
			
			
			}
		}
		
		System.out.println((arr[1]));

	}

}
