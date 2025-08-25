package LEVEL2;
import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take salary and years of service
        System.out.print("Enter employee salary: ");
        double salary = input.nextDouble();

        System.out.print("Enter years of service: ");
        int years = input.nextInt();

        if (years > 5) {
            double bonus = salary * 0.05;
            System.out.println("Bonus Amount = " + bonus);
        } else {
            System.out.println("No bonus as service is less than 5 years.");
        }

        input.close();
    }
}
 
