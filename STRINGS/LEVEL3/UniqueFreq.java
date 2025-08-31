package LEVEL3;
 import java.util.Scanner;

class UniqueFreq {
    public static char[] uniqueChars(String text) {
        char[] unique = new char[text.length()];
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            boolean isUnique = true;
            for (int j = 0; j < i; j++) {
                if (text.charAt(j) == ch) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) unique[count++] = ch;
        }
        char[] result = new char[count];
        System.arraycopy(unique, 0, result, 0, count);
        return result;
    }
    public static int[] charFrequency(String text) {
        int[] freq = new int;
        for (int i = 0; i < text.length(); i++) {
            freq[text.charAt(i)]++;
        }
        return freq;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();
        char[] unique = uniqueChars(text);
        int[] freq = charFrequency(text);
        System.out.println("Character | Frequency");
        for (char ch : unique) {
            System.out.println("    " + ch + "     |    " + freq[ch]);
        }
    }
}
 
