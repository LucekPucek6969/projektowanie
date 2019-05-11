package struktury_danych.kolejka;

public class KolejkaElem {

    private int value;

    private KolejkaElem next;

    public KolejkaElem(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public KolejkaElem getNext() {
        return next;
    }

    public void setNext(KolejkaElem next) {
        this.next = next;
    }
}
