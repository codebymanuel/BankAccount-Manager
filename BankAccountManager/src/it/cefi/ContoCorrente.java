package it.cefi;

import java.util.LinkedList;
import java.util.Queue;

public class ContoCorrente {

    private double saldo;
    private Queue<Operazione> movimenti;

    public ContoCorrente() {
        this.saldo = 0;
        this.movimenti = new LinkedList<>();
    }

    public void versa(double importo) {
        // Controlla che l'importo sia maggiore di 0
        if (importo > 0) {
            saldo += importo;
            movimenti.add(new Operazione(TipoDiOperazione.VERSAMENTO, importo));

            // Limita la coda dei movimenti a 5
            if (movimenti.size() > 5) {
                movimenti.poll(); // Rimuove il primo elemento (FIFO)
            }
        } else {
            // Se l'importo è negativo o zero, stampiiamo un messaggio di errore
            System.out.println("L'importo deve essere positivo");
        }
    }

    public void preleva(double importo) {
        // Verifica che l'importo sia positivo e che ci siano fondi sufficienti
        if (importo > 0 && saldo >= importo) {
            saldo -= importo;
            movimenti.add(new Operazione(TipoDiOperazione.PRELIEVO, importo));

            // Limita la coda dei movimenti a 5
            if (movimenti.size() > 5) {
                movimenti.poll(); // Rimuove il primo elemento (FIFO)
            }
        } else {
          
            System.out.println("Prelievo non valido. Verifica l'importo o il saldo disponibile.");
        }
    }

    // Metodo per ottenere il saldo attuale
    public double getSaldo() {
        return saldo;
    }

    // Metodo per visualizzare gli ultimi movimenti
    public void mostraMovimenti() {
        // Mostra gli ultimi 5 movimenti (se ce ne sono)
        for (Operazione operazione : movimenti) {
            System.out.println(operazione.toString());
        }
    }
}

