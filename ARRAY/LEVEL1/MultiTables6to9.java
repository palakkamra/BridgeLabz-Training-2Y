package ARRAY.LEVEL1;

public class MultiTables6to9 {
    public static void main(String[] args) {
        for (int num = 6; num <= 9; num++) {
            System.out.println("\nMultiplication Table of " + num);
            int[] table = new int[10];
            for (int i = 0; i < table.length; i++) {
                table[i] = num * (i+1);
                System.out.println(num + " * " + (i+1) + " = " + table[i]);
            }
        }
    }
}
 
