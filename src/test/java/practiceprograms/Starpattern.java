package practiceprograms;

public class Starpattern {

	public static void main(String[] args) {

		for (int i = 0; i <= 3; i++)

		{

			for (int j = 3; j <= 5-i; j++) {

				System.out.print("*");
			}
			System.out.println();
		}
	}
}