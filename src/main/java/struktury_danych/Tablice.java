package struktury_danych;

public class Tablice {

    public void wypisanieLiczbNaParzystychIndeskach(int[] tab) {
        for(int i = tab.length - 1; i >= 0; i--) {
            if(i % 2 == 0) {
                System.out.print(tab[i] + " ");
            }
        }
        System.out.println();
    }

    public void wypisanieLiczbPodzielnychPrzezTrzy(int[] tab) {
        int suma  = 0;
        for (int i = 0; i < tab.length; i++) {
            if(tab[i] % 3 == 0) {
                suma += tab[i];
            }
        }
        System.out.println("Suma liczba podzielnych przez 3: " + suma);
    }

    public void wypisanieSumyPieciuPierwszychOdejmujacOstatni(int[] tab) {
        int wynik = 0;
        if (tab.length < 6) {
            System.out.println("Hola hola nie tak szybko");
            return;
        }

        for (int i = 0; i < 5; i++) {
            wynik += tab[i];
        }

        wynik = wynik - tab[tab.length-1];
        System.out.println("Wynik sumy pięciu pierwszych minus ostatnio: " + wynik);
    }
}
