package struktury_danych.kolejka;

public class KolejkaLista {

    private KolejkaElem first;

    private KolejkaElem last;

    public KolejkaLista() {
        first = last = null;
    }

    public void add(int wartosc) {
        KolejkaElem newElem = new KolejkaElem(wartosc);

        if (last == null) {
            first = last = newElem;
        } else {
            last.setNext(newElem);
            last = newElem;
        }
    }

    public int poll() {
        int wartosc = first.getValue();
        first = first.getNext();

        if(first == null) {
            last = null;
        }

        return wartosc;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public int peek() {
        return first.getValue();
    }

    public void pokaz() {
        KolejkaElem pointer = first;
        while (pointer != null) {
            System.out.print(pointer.getValue() + " ");
            pointer = pointer.getNext();
        }
        System.out.println();
    }

}
