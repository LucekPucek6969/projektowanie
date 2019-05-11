package struktury_danych.lista;

public class Lista {


    private ElemLista first;

    private ElemLista last;

    public Lista() {
        first = last = null;
    }

    public void addFirst(int value) {
        ElemLista newElem = new ElemLista(value);

        if (first == null) {              //jesli lista jeszcze jest pusta i
            first = last = newElem;       //dodajemy pierwszy element do listy

        } else {

            newElem.setNext(first);
            first.setPrev(newElem);
            first = newElem;
        }
    }


    public void addLast(int value) {

        ElemLista newElem = new ElemLista(value);

        if (last == null) {                      //jezeli lista pusta
            last = first = newElem;

        } else {                                  //jezeli dodajemy kolejne elementy do listy

            last.setNext(newElem);
            newElem.setPrev(last);
            last = newElem;
        }
    }


    public int peekFirst() {
        //TODO if null then exeption
        return first.getValue();
    }


    public int peekLast() {
        //TODO if null then exeption
        return last.getValue();
    }


    public int pollFirst() {
        //TODO if null then exeption
        //zapamietanie wartosci z first
        int value = first.getValue(); //zanim stracimy do niegoreferencje
        first = first.getNext();


        //jesli pobieramy ostatni element z listy
        //musimy takze uaktualic znaczik last
        if (first == null) {
            last = null;
        } else {
            first.setPrev(null);
        }
        return value;
    }


    public int poolLast() {
        //TODO if null then exeption

        int value = last.getValue();  //pobieramy wartosc komorki
        // last zanim ja usuniemy
        last = last.getPrev();      //ustawiamy znacznik last na elemencie
        // poprzedzajacym starego last

        if (last != null) {
            last.setNext(null);   //usuniecie ref do starego lasta
        }
        if (last == null) {         //lista zostaje pusta trzeba rowniez
            // zaktualiaowac first do null
            first = null;
        }
        return value;
    }

    public boolean isEmpty() {
        return first == null;

    }


    public void show() {

        ElemLista pointer = first;   //chcemy podejrzec liste bez jej zmieniania
        //dlatego tworzymy likalna zmienna pointer
        //i przypisujemy jej wartosc first
        //wykorzystujemy ja zeby skakac poliscie
        // ale nie zmieniamy wartosci prawdziwego first i last
        while (pointer != null) {
            System.out.println(pointer.getValue() + " ");
            pointer = pointer.getNext();
        }
        System.out.println("KONIEC LISTY");
    }


    public void showReverse() {

        ElemLista pointer = last;
        while (pointer != null) {
            System.out.println(pointer.getValue() + " ");
            pointer = pointer.getPrev();
        }
        System.out.println("POCZĄTEK");
    }

    public ElemLista search(int value) {   //przeszukanie listy i znalezienie
        // konkretnej wartosci
        ElemLista pointer = first;

        while (pointer != null) {

            if (pointer.getValue() == value) {
                return pointer;
            }
            pointer = pointer.getNext();
        }

        return null;                        //nie znaleziono szukanej wartosci
    }


    public  boolean contains(int value){
 //       ElemLista found = search(value);  //sprawdzamy czy szukana wart jest w liscie
 //       if (found != null){
 //           return true
 //       }else {
 //           return false;
 //       }
         return  search(value) != null;
    }



    public boolean remove(int value){
        ElemLista found = search(value);


        if (found == null){
            return false;
        }

        if (found == first){         //jesli szukana wartosc jest w elemencie first
            pollFirst();
        } else  if(found == last){   // lub last
            poolLast();
        } else {                     //jesli jest gdzies w srodku

            found.getPrev().setNext(found.getNext());//pobieramy poprzednika i ustawiamy
                                                     // jego nastepnika poprzez
                                                     //nastepnika znalezionego
            found.getNext().setPrev(found.getPrev());//
        }
        return true;                  //znaleziony i usuniety element z listy
    }
}

