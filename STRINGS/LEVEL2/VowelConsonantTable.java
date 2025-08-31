package LEVEL2;

 import java.util.Scanner;

public class VowelConsonantTable {
    public static String typeOfChar(char ch) {
        ch = Character.toLowerCase(ch);
        if (ch>='a' && ch<='z') {
            if ("aeiou".indexOf(ch)!=-1) return "Vowel";
            else return "Consonant";
        }
        return "Not a Letter";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        System.out.println("Char\tType");
        for (int i=0;i<text.length();i++){
            char ch=text.charAt(i);
            System.out.println(ch+"\t"+typeOfChar(ch));
        }
    }
}
 
