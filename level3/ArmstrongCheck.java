package CONTROLFLOW.level3;

 import java.util.Scanner;

public class ArmstrongCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number = input.nextInt();
        int original = number, sum = 0;

        while (number != 0) {
            int digit = number % 10;
            sum += digit * digit * digit;
            number /= 10;
        }

        if (sum == original)
            System.out.println(original + " is an Armstrong Number.");
        else
            System.out.println(original + " is not an Armstrong Number.");

        input.close();
    }
}
 
