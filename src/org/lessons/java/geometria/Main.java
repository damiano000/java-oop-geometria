package org.lessons.java.geometria;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci la base del rettangolo: ");
        int base = scanner.nextInt();

        System.out.print("Inserisci l'altezza del rettangolo: ");
        int altezza = scanner.nextInt();

        // Creazione di un nuovo oggetto Rettangolo utilizzando il costruttore con i valori inseriti dall'utente
        Rettangolo rettangolo = new Rettangolo(base, altezza);

        // Calcolo dell'area e del perimetro utilizzando i metodi della classe Rettangolo
        int area = rettangolo.calcolaArea();
        int perimetro = rettangolo.calcolaPerimetro();

        // Stampa dell'area e del perimetro
        System.out.println("Area del rettangolo: " + area);
        System.out.println("Perimetro del rettangolo: " + perimetro);
    }
}
