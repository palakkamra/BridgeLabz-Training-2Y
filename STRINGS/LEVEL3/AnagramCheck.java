package LEVEL3;

 import java.util.Scanner;

class AnagramCheck {
    public static boolean isAnagram(String str1, String str2) {
        if (str1.length() != str2.length()) return false;
        int[] freq1 = new int;
        int[] freq2 = new int;
        for (int i = 0; i < str1.length(); i++)
            freq1[str1.charAt(i)]++;
        for (int i = 0; i < str2.length(); i++)
            freq2[str2.charAt(i)]++;
        for (int i = 0; i < 256; i++)
            if (freq1[i] != freq2[i]) return false;
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first text: ");
        String s1 = sc.nextLine();
        System.out.print("Enter second text: ");
        String s2 = sc.nextLine();
        System.out.println(isAnagram(s1, s2) ? "Anagrams" : "Not anagrams");
    }
}
 
