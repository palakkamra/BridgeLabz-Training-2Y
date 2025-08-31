package LEVEL2;

 import java.util.Scanner;

public class VowelConsonantCount {
    public static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u');
    }
    public static int[] countVC(String s) {
        int v=0,c=0;
        for (int i=0;i<s.length();i++) {
            char ch=s.charAt(i);
            if(Character.isLetter(ch)){
                if(isVowel(ch)) v++; else c++;
            }
        }
        return new int[]{v,c};
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String text=sc.nextLine();
        int[] res=countVC(text);
        System.out.println("Vowels: "+res[0]+" Consonants: "+res[1]);
    }
}
 
