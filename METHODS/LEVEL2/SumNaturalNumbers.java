package LEVEL2;

 import java.util.Scanner;
public class SumNaturalNumbers {
    public static int sumRecursive(int n) {
        if (n == 1) return 1; return n + sumRecursive(n - 1);
    }
    public static int sumFormula(int n) {
        return n * (n + 1) / 2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n <= 0) return;
        int r = sumRecursive(n), f = sumFormula(n);
        System.out.println(r + " " + f);
    }
}
 
