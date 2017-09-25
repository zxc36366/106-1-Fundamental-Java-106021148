import java.util.Scanner;

public class P2 {

    public static void main(String[] args) {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int v1 = scn.nextInt();
        System.out.println(Math.round((v1/600f)*10)/10f);
    }
}
