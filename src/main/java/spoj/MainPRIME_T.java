package spoj;

import java.util.Arrays;
import java.util.Scanner;

public class MainPRIME_T {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        utworzSito(10001);

        for (int i = 0; i < n; i++) {
            int liczba = scanner.nextInt();

            if (czyPierwszaPrzezSito(liczba)) {
                System.out.println("TAK");
            } else {
                System.out.println("NIE");
            }
        }
    }


    private static boolean[] sito;

    public static void utworzSito(int rozmiar) {

        sito = new boolean[rozmiar];
        Arrays.fill(sito, true);  //wypelnia wszystkiekomorki tablicy na true

        sito[0] = false;
        sito[1] = false;

        for (int i = 2; i < rozmiar; i++) { //sprawdzimy czy liczba jest pierwsza
            //jesli tak to oznaczamy jako true a jej wielokrotnosci
            // w tab jako false

            if (sito[i]) {

                for (int a = i + i; a < rozmiar; a = a + i) {

                    sito[a] = false;
                }
            }
        }
        //      for (int i = 0; i < rozmiar; i++) {
        //           System.out.println(i + ":" + sito[i] + " ");
        //      }
    }

    public static boolean czyPierwszaPrzezSito(int liczba) {
        return sito[liczba];
    }
}
