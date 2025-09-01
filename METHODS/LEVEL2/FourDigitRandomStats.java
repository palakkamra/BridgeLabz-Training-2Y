package LEVEL2;

 import java.util.Random;

public class FourDigitRandomStats {
    public static int[] generate4DigitRandomArray(int size) {
        Random rand = new Random();
        int[] arr = new int[size];
        for(int i=0; i<size; i++)
            arr[i] = rand.nextInt(9000) + 1000;
        return arr;
    }
    public static double[] findAverageMinMax(int[] numbers) {
        double sum = 0;
        int min = numbers, max = numbers;
        for(int n : numbers) {
            sum += n;
            if(n < min) min = n;
            if(n > max) max = n;
        }
        double avg = sum / numbers.length;
        return new double[]{avg, min, max};
    }
    public static void main(String[] args) {
        int[] arr = generate4DigitRandomArray(5);
        for(int n : arr) System.out.print(n+" ");
        System.out.println();
        double[] stats = findAverageMinMax(arr);
        System.out.println(stats);
        System.out.println(stats[1]);
        System.out.println(stats);
    }
}
 
