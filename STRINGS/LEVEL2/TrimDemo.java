package LEVEL2;

 import java.util.Scanner;

public class TrimDemo {
    public static String customTrim(String s) {
        int start=0,end=s.length()-1;
        while(start<=end && s.charAt(start)==' ') start++;
        while(end>=start && s.charAt(end)==' ') end--;
        String res="";
        for(int i=start;i<=end;i++) res+=s.charAt(i);
        return res;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String text=sc.nextLine();
        String c=customTrim(text);
        String b=text.trim();
        System.out.println("Custom: '"+c+"'");
        System.out.println("Built-in: '"+b+"'");
        System.out.println("Equal: "+c.equals(b));
    }
}
 
