package LEVEL2;

import java.util.*;

public class StudentGrades {
    public static int[][] generateMarks(int n){
        Random r=new Random();
        int[][] arr=new int[n][3];
        for(int i=0;i<n;i++) for(int j=0;j<3;j++) arr[i][j]=40+r.nextInt(61);
        return arr;
    }
    public static Object[][] computeResults(int[][] m){
        Object[][] res=new Object[m.length][6];
        for(int i=0;i<m.length;i++){
            int total=m[i][0]+m[i][1]+m[i][2];
            double avg=total/3.0;
            double per=Math.round((total/300.0*100)*100.0)/100.0;
            String grade=(per>=90)?"A":(per>=75)?"B":(per>=50)?"C":"D";
            res[i]=new Object[]{m[i][0],m[i][1],m[i][2],total,avg,per+"% ("+grade+")"};
        }
        return res;
    }
    public static void main(String[] args){
        int[][] marks=generateMarks(5);
        Object[][] table=computeResults(marks);
        System.out.println("Phy Chem Math Total Avg Percentage(Grade)");
        for(Object[] row:table){
            for(Object val:row) System.out.print(val+"\t");
            System.out.println();
        }
    }
}
 
