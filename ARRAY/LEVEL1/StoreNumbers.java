package ARRAY.LEVEL1;

import java.util.Scanner;

public class StoreNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] numbers = new double[10];
        double total = 0.0;
        int index = 0;

        while (true) {
            if (index == 10) break;
            System.out.print("Enter number (0 or negative to stop): ");
            double n = sc.nextDouble();
            if (n <= 0) break;
            numbers[index++] = n;
        }

        System.out.println("\nNumbers entered:");
        for (int i = 0; i < index; i++) {
            System.out.print(numbers[i] + " ");
            total += numbers[i];
        }
        System.out.println("\nSum = " + total);
        sc.close();
    }
}
 
