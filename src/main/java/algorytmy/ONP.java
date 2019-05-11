package algorytmy;

import struktury_danych.stos.StosLista;

import java.util.Scanner;

public class ONP {

    public void uruchom() {
        Scanner scanner = new Scanner(System.in);
        String wyrazenie;
        String[] podzielone;
        StosLista stos = new StosLista();

        System.out.println("Podaj wyrażenie w Odwrotnej Notacji Polskiej:");
        wyrazenie = scanner.nextLine();

        podzielone = wyrazenie.split(" ");

        for(String element : podzielone) {
            try {
                int wartosc = Integer.parseInt(element);
                stos.push(wartosc);

            } catch (NumberFormatException e) {
                int wartoscDruga = stos.pop();
                int wartoscPierwsza = stos.pop();
                int wynik = 0;

                if ("+".equals(element)) {
                    wynik = wartoscPierwsza + wartoscDruga;
                } else if ("-".equals(element)) {
                    wynik = wartoscPierwsza - wartoscDruga;
                } else if ("*".equals(element)) {
                    wynik = wartoscPierwsza * wartoscDruga;
                } else if ("/".equals(element)) {
                    wynik = wartoscPierwsza / wartoscDruga;
                } else {
                    System.out.println("Nieprawidłowy znak");
                }

                stos.push(wynik);
            }
        }

        int ostatecznyWynik = stos.pop();
        System.out.println("Wynik : " + ostatecznyWynik);
    }
}
