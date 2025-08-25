package CONTROLFLOW.level3;

 import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double weight = input.nextDouble(); // in kg
        double heightCm = input.nextDouble(); // in cm
        double heightM = heightCm / 100.0;

        double bmi = weight / (heightM * heightM);
        System.out.println("BMI = " + bmi);

        if (bmi < 18.5) System.out.println("Underweight");
        else if (bmi < 24.9) System.out.println("Normal weight");
        else if (bmi < 29.9) System.out.println("Overweight");
        else System.out.println("Obesity");

        input.close();
    }
}

