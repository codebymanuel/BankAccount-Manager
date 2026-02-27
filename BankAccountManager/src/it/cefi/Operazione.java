package it.cefi;

import java.time.LocalDateTime;

public class Operazione {
    


	private TipoDiOperazione tipo; // Tipo di operazione (VERSAMENTO o PRELIEVO)
    private double importo;        // Importo dell'operazione
    private LocalDateTime data;    // Data dell'operazione
    
    
    public double getImporto() {
		return importo;
	}

	public void setImporto(double importo) {
		this.importo = importo;
	}

	public TipoDiOperazione getTipo() {
		return tipo;
	}

	public LocalDateTime getData() {
		return data;
	}
    
    

    // Costruttore parametrico
    public Operazione(TipoDiOperazione tipo, double importo) {
        this.tipo = tipo;
        this.importo = importo;
        this.data = LocalDateTime.now();  // Imposta la data corrente
    }

    // Metodo toString per rappresentare l'operazione come stringa
    @Override
    public String toString() {
        return "Tipo: " + tipo + ", Importo: " + importo + "€" + ", Data: " + data;
    }
}
