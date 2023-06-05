package naveen;

		
		import java.util.ArrayList;
		import java.util.Collections;

		public class EvenNumberSorter {
		    public static void main(String[] args) {
		        ArrayList<Integer> list = new ArrayList<Integer>();
		        list.add(10);
		        list.add(15);
		        list.add(8);
		        list.add(49);
		        list.add(25);
		        list.add(98);
		        list.add(32);

		        ArrayList<Integer> evenNumbers = new ArrayList<Integer>();

		        for (int num : list) {
		            if ((num % 2) == 0) {
		                evenNumbers.add(num);
		            }
		        }

		        Collections.sort(evenNumbers);

		        System.out.println("Even numbers in ascending order: " + evenNumbers);
		    


	}

}
