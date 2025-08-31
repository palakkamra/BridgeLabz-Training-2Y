package LEVEL2;

 import java.util.Scanner;

public class ShortestLongestWord {
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
        int c = 0; try { while (true) { s.charAt(c); c++; } }
        catch (Exception e) { return c; }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String[] words = customSplit(text);
        String shortest = words[0], longest = words[0];
        for (String w : words) {
            if (customLength(w) < customLength(shortest)) shortest = w;
            if (customLength(w) > customLength(longest)) longest = w;
        }
        System.out.println("Shortest: " + shortest);
        System.out.println("Longest: " + longest);
    }
}
