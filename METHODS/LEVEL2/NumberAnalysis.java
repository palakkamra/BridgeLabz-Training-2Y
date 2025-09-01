

 import java.util.Scanner;

public class NumberAnalysis {
    public static boolean isPositive(int n) { return n >= 0; }
    public static boolean isEven(int n) { return n % 2 == 0; }
    public static int compare(int n1, int n2) {
        if (n1 > n2) return 1;
        if (n1 == n2) return 0;
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int;
        for(int i=0; i<5; i++) {
            arr[i] = sc.nextInt();
            if(isPositive(arr[i])) {
                if(isEven(arr[i])) System.out.println("Even & Positive");
                else System.out.println("Odd & Positive");
            } else System.out.println("Negative");
        }
        int cmp = compare(arr, arr);
        if(cmp == 0) System.out.println("Equal");
        else if(cmp > 0) System.out.println("Greater");
        else System.out.println("Less");
    }
}
 
