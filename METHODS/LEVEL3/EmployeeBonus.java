 import java.util.*;

public class EmployeeBonus {
    public static int[][] generateData() {
        int[][] data = new int[10][2];
        for (int i = 0; i < 10; i++) {
            data[i][0] = (int)(Math.random() * 90000) + 10000;
            data[i][1] = (int)(Math.random() * 11);
        }
        return data;
    }
    public static double[][] calculateBonus(int[][] data) {
        double[][] res = new double[10][2];
        for (int i = 0; i < 10; i++) {
            double rate = data[i][1] > 5 ? 0.05 : 0.02;
            res[i][1] = data[i][0] * rate;
            res[i][0] = data[i][0] + res[i][1];
        }
        return res;
    }
    public static void display(int[][] oldData, double[][] newData) {
        double sumOld = 0, sumNew = 0, sumBonus = 0;
        System.out.println("Salary\tYears\tNew Salary\tBonus");
        for (int i = 0; i < 10; i++) {
            sumOld += oldData[i][0];
            sumNew += newData[i][0];
            sumBonus += newData[i][1];
            System.out.println(oldData[i][0] + "\t" + oldData[i][1] + "\t" + newData[i][0] + "\t" + newData[i][1]);
        }
        System.out.println("Total Old: " + sumOld);
        System.out.println("Total New: " + sumNew);
        System.out.println("Total Bonus: " + sumBonus);
    }
    public static void main(String[] args) {
        int[][] data = generateData();
        double[][] res = calculateBonus(data);
        display(data, res);
    }
}
 
