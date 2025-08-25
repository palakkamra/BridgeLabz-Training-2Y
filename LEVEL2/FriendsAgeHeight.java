package LEVEL2;

 import java.util.Scanner;

public class FriendsAgeHeight {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take input for ages and heights
        System.out.print("Enter age of Amar: ");
        int ageAmar = input.nextInt();
        System.out.print("Enter height of Amar: ");
        int heightAmar = input.nextInt();

        System.out.print("Enter age of Akbar: ");
        int ageAkbar = input.nextInt();
        System.out.print("Enter height of Akbar: ");
        int heightAkbar = input.nextInt();

        System.out.print("Enter age of Anthony: ");
        int ageAnthony = input.nextInt();
        System.out.print("Enter height of Anthony: ");
        int heightAnthony = input.nextInt();

        // Find youngest
        if (ageAmar < ageAkbar && ageAmar < ageAnthony) {
            System.out.println("Youngest is Amar");
        } else if (ageAkbar < ageAmar && ageAkbar < ageAnthony) {
            System.out.println("Youngest is Akbar");
        } else {
            System.out.println("Youngest is Anthony");
        }

        // Find tallest
        if (heightAmar > heightAkbar && heightAmar > heightAnthony) {
            System.out.println("Tallest is Amar");
        } else if (heightAkbar > heightAmar && heightAkbar > heightAnthony) {
            System.out.println("Tallest is Akbar");
        } else {
            System.out.println("Tallest is Anthony");
        }

        input.close();
    }
}

