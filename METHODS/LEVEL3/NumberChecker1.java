 import java.util.*;

public class NumberChecker1 {
    public static int countDigits(int n) { return String.valueOf(n).length(); }
    public static int[] getDigits(int n) {
        String s = String.valueOf(n);
        int[] d = new int[s.length()];
        for (int i = 0; i < s.length(); i++) d[i] = s.charAt(i) - '0';
        return d;
    }
    public static boolean isDuck(int[] d) { for (int i = 1; i < d.length; i++) if (d[i] == 0) return true; return false; }
    public static boolean isArmstrong(int[] d) {
        int p = d.length, sum = 0;
        for (int x : d) sum += Math.pow(x, p);
        int num = 0; for (int x : d) num = num * 10 + x;
        return num == sum;
    }
    public static int[] largestTwo(int[] d) {
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE;
        for (int x : d) { if (x > max1) { max2 = max1; max1 = x; } else if (x > max2 && x != max1) max2 = x; }
        return new int[]{max1, max2};
    }
    public static int[] smallestTwo(int[] d) {
        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;
        for (int x : d) { if (x < min1) { min2 = min1; min1 = x; } else if (x < min2 && x != min1) min2 = x; }
        return new int[]{min1, min2};
    }
    public static void main(String[] args) {
        int n = 153;
        int[] d = getDigits(n);
        System.out.println("Duck: " + isDuck(d));
        System.out.println("Armstrong: " + isArmstrong(d));
        System.out.println("Largest & Second: " + Arrays.toString(largestTwo(d)));
        System.out.println("Smallest & Second: " + Arrays.toString(smallestTwo(d)));
    }
}

