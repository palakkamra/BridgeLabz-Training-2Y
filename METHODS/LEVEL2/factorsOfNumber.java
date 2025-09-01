package LEVEL2;

import java.util.Scanner;
public class factorsOfNumber {
    public static int[] getFactors(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) if (number % i == 0) count++;
        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= number; i++) if (number % i == 0) factors[index++] = i;
        return factors;
    }
    public static int sumFactors(int[] factors) {
        int sum = 0; for (int f : factors) sum += f; return sum;
    }
    public static int productFactors(int[] factors) {
        int product = 1; for (int f : factors) product *= f; return product;
    }
    public static int sumSquaresFactors(int[] factors) {
        int sum = 0; for (int f : factors) sum += Math.pow(f, 2); return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int[] factors = getFactors(number);
        for (int f : factors) System.out.print(f + " ");
        System.out.println("\n" + sumFactors(factors));
        System.out.println(productFactors(factors));
        System.out.println(sumSquaresFactors(factors));
    }
}
 
