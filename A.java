import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        if (a<=0 || b <=0){
            System.out.println("error");
        }
        if (a >= 0 && b >= 0){
           if (a*a+b*b<=100*100){
               System.out.println("inside");
           }else {
               System.out.println("outside");
           }
        }
    }

}
