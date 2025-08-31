package LEVEL2;

 import java.util.Scanner;

public class WordsWithLength {
    public static String[] customSplit(String text) {
        int count = 1;
        for (int i = 0; i < text.length(); i++) if (text.charAt(i) == ' ') count++;
        String[] words = new String[count];
        int start = 0, idx = 0;
        for (int i = 0; i <= text.length(); i++) {
            if (i == text.length() || text.charAt(i) == ' ') {
                words[idx++] = text.substring(start, i);
                start = i + 1;
            }
        }
        return words;
    }
    public static int customLength(String s) {
        int count = 0;
        try {
            while (true) { s.charAt(count); count++; }
        } catch (Exception e) { return count; }
    }
    public static String[][] wordWithLength(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(customLength(words[i]));
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String[] words = customSplit(text);
        String[][] res = wordWithLength(words);
        System.out.println("Word\tLength");
        for (String[] r : res) {
            System.out.println(r[0] + "\t" + r[1]);
        }
    }
}
 
