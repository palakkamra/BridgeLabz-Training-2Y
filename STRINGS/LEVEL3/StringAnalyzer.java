package LEVEL3;

 import java.util.Scanner;

class StringAnalyzer {
    public static int[] findAllIndexes(String text, char ch) {
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ch) {
                count++;
            }
        }
        int[] indexes = new int[count];
        int j = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ch) {
                indexes[j++] = i;
            }
        }
        return indexes;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a text: ");
        String text = sc.nextLine();
        System.out.print("Enter a character to find the occurrences: ");
        char ch = sc.next().charAt(0);

        int[] indexes = findAllIndexes(text, ch);
        System.out.print("Indexes of the character '" + ch + "': ");
        for (int index : indexes) System.out.print(index + " ");
    }
}
 
