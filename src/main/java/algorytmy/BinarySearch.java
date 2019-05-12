package algorytmy;

public class BinarySearch {

    public boolean find(int[] A, int y) {
        int lewo = 0;
        int prawo =A.length - 1;
        int indeks = -1;      // dla typow prostych nie mozna null wiec dajemy -1

        while (lewo <prawo) {
            int srodek = (lewo+prawo) / 2;

            if (A[srodek] < y) {
                lewo = srodek+1;
            }else{
                prawo = srodek;
            }
        }

        if (A[lewo]==y) {
            indeks = lewo;
            System.out.println("znaleziona na indeksie: " + indeks);
            return true;
        }else{
            indeks=-1;
            System.out.println("nie znaleziono");
            return false;
        }
    }
}
