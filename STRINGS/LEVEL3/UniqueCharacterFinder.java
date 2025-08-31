package LEVEL3;

 import java.util.Scanner;

class UniqueCharacterFinder {
    public static int customLength(String str) {
        int len = 0;
        try {
            while (true) {
                str.charAt(len);
                len++;
            }
        } catch (Exception e) {}
        return len;
    }
    public static char[] findUnique(String text) {
        int len = customLength(text);
        char[] unique = new char[len];
        int count = 0;
        for (int i = 0; i < len; i++) {
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
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();
        char[] unique = findUnique(text);
        System.out.print("Unique characters: ");
        for (char c : unique) System.out.print(c + " ");
    }
}
 
