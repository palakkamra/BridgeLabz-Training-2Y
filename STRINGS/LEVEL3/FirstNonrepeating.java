package LEVEL3;

import java.util.Scanner;

class FirstNonrepeating {
    public static char firstNonRepeatingChar(String text) {
        int[] freq = new int; // ASCII size
        for (int i = 0; i < text.length(); i++) {
            freq[text.charAt(i)]++;
        }
        for (int i = 0; i < text.length(); i++) {
            if (freq[text.charAt(i)] == 1)
                return text.charAt(i);
        }
        return '\0'; // No non-repeating character
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();
        char result = firstNonRepeatingChar(text);
        if (result != '\0')
            System.out.println("First non-repeating character: " + result);
        else
            System.out.println("No non-repeating character found.");
    }
}

