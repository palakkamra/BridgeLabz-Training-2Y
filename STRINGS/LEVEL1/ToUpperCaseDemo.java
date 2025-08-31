 import java.util.Scanner;

public class ToUpperCaseDemo {
    public static String toUpperCustom(String s) {
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= 'a' && ch <= 'z') result += (char)(ch - 32);
            else result += ch;
        }
        return result;
    }
    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        for (int i = 0; i < s1.length(); i++) if (s1.charAt(i) != s2.charAt(i)) return false;
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String s1 = toUpperCustom(text);
        String s2 = text.toUpperCase();
        System.out.println("Custom: " + s1);
        System.out.println("Built-in: " + s2);
        System.out.println("Comparison: " + compareStrings(s1, s2));
    }
}
 
