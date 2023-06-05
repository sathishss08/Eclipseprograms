package naveen;

import java.util.Arrays;



public class AnagramChecker {
    public static void main(String[] args) {
        String string1 = "abcd";
        String string2 = "dcab";

        boolean isAnagram = checkAnagram(string1, string2);

        if (isAnagram) {
            System.out.println("The strings are anagrams.");
        } else {
            System.out.println("The strings are not anagrams.");
        }
    }

    private static boolean checkAnagram(String string1, String string2) {
        if (string1.length() != string2.length()) {
            return false;
        }

        char[] charArray1 = string1.toCharArray();
        char[] charArray2 = string2.toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        return Arrays.equals(charArray1, charArray2);
    }
}

	
