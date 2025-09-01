package LEVEL2;

 import java.util.Scanner;

public class BMICalculator {
    public static double calculateBMI(double kg, double cm) {
        double meters = cm / 100.0;
        return kg / (meters * meters);
    }
    public static String getBMIStatus(double bmi) {
        if(bmi < 18.5) return "Underweight";
        else if(bmi < 25) return "Normal";
        else if(bmi < 30) return "Overweight";
        else return "Obese";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] data = new double;
        String[] status = new String;
        for(int i=0; i<10; i++) {
            data[i] = sc.nextDouble();
            data[i][1] = sc.nextDouble();
            data[i] = calculateBMI(data[i], data[i][1]);
            status[i] = getBMIStatus(data[i]);
        }
        for(int i=0; i<10; i++)
            System.out.printf("%.1f %.1f %.2f %s\n", data[i], data[i][1], data[i], status[i]);
    }
}
 
