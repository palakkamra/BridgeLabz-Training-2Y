 import java.util.Scanner;

public class TriangularParkRun {
    public static int computeRounds(int side1, int side2, int side3, int targetDistance) {
        int perimeter = side1 + side2 + side3;
        return (int)Math.ceil(targetDistance * 1000.0 / perimeter);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three sides in meters:");
        int s1 = sc.nextInt();
        int s2 = sc.nextInt();
        int s3 = sc.nextInt();
        int rounds = computeRounds(s1, s2, s3, 5);
        System.out.println("Number of rounds to complete 5 km: " + rounds);
    }
}

