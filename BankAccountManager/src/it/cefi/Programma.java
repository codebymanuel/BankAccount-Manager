package it.cefi;

public class Programma {

	public static void main(String[] args) {
		
		  ContoCorrente contoCorrente = new ContoCorrente();
		   
		   
		    contoCorrente.versa(1000);
		    contoCorrente.preleva(500);
		    contoCorrente.versa(20);
		    contoCorrente.preleva(20);

		    contoCorrente.getSaldo();
		    
		    
		    System.out.println("Saldo attuale:" + "\n" + "€" + contoCorrente.getSaldo());
		 
		    
		    contoCorrente.mostraMovimenti();
	}

}
