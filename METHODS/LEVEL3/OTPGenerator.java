 import java.util.*;

public class OTPGenerator {
    public static int generateOTP() {
        return (int)(Math.random() * 900000) + 100000;
    }
    public static boolean allUnique(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int x : arr) if (!set.add(x)) return false;
        return true;
    }
    public static void main(String[] args) {
        int[] otps = new int[10];
        for (int i = 0; i < 10; i++) otps[i] = generateOTP();
        System.out.println("OTPs: " + Arrays.toString(otps));
        System.out.println("Unique: " + allUnique(otps));
    }
}
 
