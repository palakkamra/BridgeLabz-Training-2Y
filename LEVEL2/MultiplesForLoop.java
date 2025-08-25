package LEVEL2;

import java.util.Scanner;

public class MultiplesForLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a positive number less than 100: ");
        int number = input.nextInt();

        if (number > 0 && number < 100) {
            System.out.println("Multiples of " + number + " below 100 are:");
            for (int i = 1; i < 100; i++) {
                if (i % number == 0) {
                    System.out.print(i + " ");
                }
            }
        } else {
            System.out.println("Enter a valid number (1-99).");
        }

        input.close();
    }
}
 
