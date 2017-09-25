import java.util.Scanner;

public class p3 {

    public static void main(String[] args) {
        // write your code here
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        char chO = scn.next().charAt(0);
        char chN = scn.next().charAt(0);
        System.out.println(str);
        System.out.println(str.replace(chO, chN));
    }
}