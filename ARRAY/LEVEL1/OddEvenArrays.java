package ARRAY.LEVEL1;

 import java.util.Scanner;

public class OddEvenArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Not a natural number.");
            return;
        }

        int[] evens = new int[n/2 + 1];
        int[] odds = new int[n/2 + 1];
        int eIndex = 0, oIndex = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) evens[eIndex++] = i;
            else odds[oIndex++] = i;
        }

        System.out.print("\nEven numbers: ");
        for (int i = 0; i < eIndex; i++) System.out.print(evens[i] + " ");

        System.out.print("\nOdd numbers: ");
        for (int i = 0; i < oIndex; i++) System.out.print(odds[i] + " ");

        sc.close();
    }
}
 
