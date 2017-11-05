import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        if (a % 400 == 0) {
            System.out.println("bissextile year");
        } else if (a % 4 == 0) {
            if (a % 100 == 0) {
                System.out.println("common year");
            } else {
                System.out.println("bissextile year");
            }
        }
    }
}

