package LEVEL3;

 import java.util.Scanner;

class BMICalc {
    public static String bmiStatus(double bmi) {
        if (bmi < 18.5) return "Underweight";
        else if (bmi < 25) return "Normal";
        else if (bmi < 30) return "Overweight";
        return "Obese";
    }
    public static String[][] generateBmiInfo(double[][] data) {
        String[][] output = new String;
        for (int i = 0; i < 10; i++) {
            double weight = data[i];
            double heightCm = data[i][1];
            double heightM = heightCm / 100.0;
            double bmi = weight / (heightM * heightM);
            output[i] = String.valueOf(heightCm);
            output[i][1] = String.valueOf(weight);
            output[i] = String.format("%.2f", bmi);
            output[i] = bmiStatus(bmi);
        }
        return output;
    }
    public static void display(String[][] bmiInfo) {
        System.out.printf("%-10s %-10s %-10s %-10s\n", "Height(cm)", "Weight(kg)", "BMI", "Status");
        for (String[] row : bmiInfo) {
            System.out.printf("%-10s %-10s %-10s %-10s\n", row, row[1], row, row);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] data = new double;
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
            data[i] = sc.nextDouble();
            System.out.print("Enter height (cm) for person " + (i + 1) + ": ");
            data[i][1] = sc.nextDouble();
        }
        String[][] bmiInfo = generateBmiInfo(data);
        display(bmiInfo);
    }

}
