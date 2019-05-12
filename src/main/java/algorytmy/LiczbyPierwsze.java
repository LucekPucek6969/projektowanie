package algorytmy;

import java.util.Arrays;

public class LiczbyPierwsze {

    private boolean[] sito;


    public void utworzSito(int rozmiar) {

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
        for (int i = 0; i < rozmiar; i++) {
            System.out.println(i + ":" + sito[i] + " ");

        }

    }
}
