package spoj;

import java.util.Scanner;

public class MainNWD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {


            int a = scanner.nextInt();
            int b = scanner.nextInt();

            System.out.println(resztaZDzielenia(a, b));
        }
    }

    static public int resztaZDzielenia(int a, int b) {

        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;

    }

}


