package LEVEL3;

 import java.util.Scanner;

class CharFrequency {
    public static void showCharFrequency(String text) {
        int[] freq = new int;
        for (int i = 0; i < text.length(); i++) {
            freq[text.charAt(i)]++;
        }
        System.out.println("Character | Frequency");
        boolean[] printed = new boolean;
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (!printed[ch]) {
                System.out.println("    " + ch + "     |    " + freq[ch]);
                printed[ch] = true;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();
        showCharFrequency(text);
    }
}

