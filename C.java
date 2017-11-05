import java.util.Scanner;

public class C {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        if (a>=1&&a<=12||b >= 1 && b <= 31) {
            System.out.println("error");
        }else{
            if (a == 1 && b >= 21 || a == 2 && b <= 18) {
                System.out.println("Aquarius");
            } else {
                if (a == 2 && b >= 19 || a == 3 && b <= 20) {
                    System.out.println("Pisces");
                } else {
                    if (a == 3 && b >= 21 || a == 4 && b <= 20) {
                        System.out.println("Aries");
                    } else {
                        if (a == 4 && b >= 21 || a == 5 && b <= 21) {
                            System.out.println("Taurus");
                        } else {
                            if (a == 5 && b >= 21 || a == 6 && b <= 21) {
                                System.out.println("Gemini");
                            } else {
                                if (a == 6 && b >= 22 || a == 7 && b <= 22) {
                                    System.out.println("Cancer");
                                } else {
                                    if (a == 7 && b >= 23 || a == 8 && b <= 23) {
                                        System.out.println("Leo");
                                    } else {
                                        if (a == 8 && b >= 24 || a == 9 && b <= 23) {
                                            System.out.println("Virgo");
                                        } else {
                                            if (a == 9 && b >= 24 || a == 10 && b <= 23) {
                                                System.out.println("Libra");
                                            } else {
                                                if (a == 10 && b >= 24 || a == 11 && b <= 22) {
                                                    System.out.println("Scropio");
                                                } else {
                                                    if (a == 11 && b >= 23 || a == 12 && b <= 21) {
                                                        System.out.println("Sagittarius");
                                                    } else {
                                                        if (a == 12 && b >= 22 || a == 1 && b <= 20) {
                                                            System.out.println("Capricorn");
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}