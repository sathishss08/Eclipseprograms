package practiceprograms;

public class ExtractInteger {
    public static void main(String[] args) {
//         Given string
        String inputString = "Sshhshs0992877klkl";
        
        // StringBuilder to store the digits
        StringBuilder digits = new StringBuilder();
        
        // Loop through each character in the string
        for (char c : inputString.toCharArray()) {
            // Check if the character is a digit
            if (Character.isDigit(c)) {
                // Append the digit to the StringBuilder
                digits.append(c);
            }
        }
        
        // Convert the digits to an integer
        int integerValue = Integer.parseInt(digits.toString());
        
        // Print the integer value
        System.out.println("Extracted integer value: " + integerValue);
    	
    	
//    	String name  = "Sshhshs099877klkl";
//    	
//    	StringBuilder digits = new StringBuilder();
//    	
//    	
//    	
//    	for (Character c: name.toCharArray())
//    	{
//    	if (Character.isDigit(c))
//    	{
//    	digits.append(c);
//    		
//    	}}
//    	int value = Integer.parseInt(name.toString());
//    	
//    		System.out.println(value);
    	}
    }



