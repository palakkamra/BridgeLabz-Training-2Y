import java.util.*;

public class MatrixOps2 {
    public static int[][] createMatrix(int r,int c) {
        int[][] m = new int[r][c];
        for (int i=0;i<r;i++) for (int j=0;j<c;j++) m[i][j]=(int)(Math.random()*10);
        return m;
    }
    public static int[][] transpose(int[][] m) {
        int[][] t = new int[m[0].length][m.length];
        for (int i=0;i<m.length;i++) for (int j=0;j<m[0].length;j++) t[j][i]=m[i][j];
        return t;
    }
    public static int det2x2(int[][] m) {
        return m[0][0]*m[1][1]-m[0][1]*m[1][0];
    }
    public static int det3x3(int[][] m) {
        return m[0][0]*(m[1][1]*m[2][2]-m[1][2]*m[2][1])
             - m[0][1]*(m[1][0]*m[2][2]-m[1][2]*m[2][0])
             + m[0][2]*(m[1][0]*m[2][1]-m[1][1]*m[2][0]);
    }
    public static double[][] inverse2x2(int[][] m) {
        double d = det2x2(m);
        if (d==0) return null;
        double[][] inv = {{m[1][1]/d, -m[0][1]/d},{-m[1][0]/d,m[0][0]/d}};
        return inv;
    }
    public static void print(int[][] m) {
        for (int[] row : m) System.out.println(Arrays.toString(row));
    }
    public static void printDouble(double[][] m) {
        for (double[] row : m) System.out.println(Arrays.toString(row));
    }
    public static void main(String[] args) {
        int[][] m = createMatrix(2,2);
        System.out.println("Matrix:"); print(m);
        System.out.println("Transpose:"); print(transpose(m));
        System.out.println("Determinant: " + det2x2(m));
        double[][] inv = inverse2x2(m);
        if (inv!=null) { System.out.println("Inverse:"); printDouble(inv); }
        else System.out.println("No Inverse");
    }
}
 
