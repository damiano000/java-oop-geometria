package org.lessons.java.geometria;

public class Rettangolo {
    int base;
    int altezza;

    // Costruttore della classe Rettangolo
    Rettangolo(int base, int altezza) {
        this.base = base;
        this.altezza = altezza;
    }

    // Metodo per calcolare l'area del rettangolo
    int calcolaArea() {
        return base * altezza;
    }

    // Metodo per calcolare il perimetro del rettangolo
    int calcolaPerimetro() {
        return 2 * (base + altezza);
    }
}


