package STRINGS.LEVEL1;

 import java.util.Scanner;

public class StringToCharArray {
    public static char[] toCharArrayManual(String s) {
        char[] arr = new char[s.length()];
        for (int i = 0; i < s.length(); i++) arr[i] = s.charAt(i);
        return arr;
    }

    public static boolean compareArrays(char[] a1, char[] a2) {
        if (a1.length != a2.length) return false;
        for (int i = 0; i < a1.length; i++) {
            if (a1[i] != a2[i]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char[] arr1 = toCharArrayManual(s);
        char[] arr2 = s.toCharArray();
        System.out.println("Comparison: " + compareArrays(arr1, arr2));
        sc.close();
    }
}

