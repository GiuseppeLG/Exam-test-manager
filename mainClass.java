package it.unipr.old.sowide.persistence;
/* terzoAssegnamento
 * Giuseppe La Gualano [Matricola 265681] , Daniele Antonucci [Matricola 266779]
 * 
 * Persistenza dati della classe "Prova"
 * JUnit test in Studente
 * Mocking in TestStudente
 */

public class mainClass {
  
	public static void main(String[] args) {
		Docente d = new Docente();
	//	Prova p = new Prova();
	 //   Studente s = new Studente();
	//	Archivio a = new Archivio(s.getNome(), s.getCognome(), s.getNumMatricola(), p.getNomeCorso(), p.getData(), p.getDurata(),p.calcolaTempoLimite());
		
	    // Richiamo di questa sola funzione per testare la persistenza dei dati
		d.registraProve();
	//	s.iscrivereEsame();
	//	a.fornireProva();
	//	a.registraDati();
	//	s.consegnaProva();
	//	d.mailVoto();
	}

}


