 import java.util.*;

public class StudentMarks {
    public static int[][] generateScores(int n) {
        int[][] scores = new int[n][3];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) scores[i][j] = (int)(Math.random()*41)+60;
        }
        return scores;
    }
    public static double[][] calculate(int[][] scores) {
        double[][] res = new double[scores.length][3];
        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0]+scores[i][1]+scores[i][2];
            double avg = total/3.0;
            double perc = total/3.0;
            res[i][0] = total;
            res[i][1] = Math.round(avg*100.0)/100.0;
            res[i][2] = Math.round(perc*100.0)/100.0;
        }
        return res;
    }
    public static void display(int[][] scores,double[][] res) {
        System.out.println("Phy\tChem\tMath\tTotal\tAvg\tPerc");
        for (int i = 0; i < scores.length; i++) {
            System.out.println(scores[i][0]+"\t"+scores[i][1]+"\t"+scores[i][2]+"\t"+res[i][0]+"\t"+res[i][1]+"\t"+res[i][2]);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] scores = generateScores(n);
        double[][] res = calculate(scores);
        display(scores,res);
    }
}
 
