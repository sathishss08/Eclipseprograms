package naveen;

public class MaxMinPair {
    public static void main(String[] args) {
        // Sample input array
        int[] arr = {12, 35, 1, 10, 34, 1};

        // Find the maximum and minimum values
        int maxVal = Integer.MIN_VALUE;
        int minVal = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxVal) {
                maxVal = arr[i];
            }
            if (arr[i] < minVal) {
                minVal = arr[i];
            }
        }

        // Print the result
        System.out.println("Maximum pair: " + maxVal);
        System.out.println("Minimum pair: " + minVal);
    }
}
