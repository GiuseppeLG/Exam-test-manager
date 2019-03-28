package it.unipr.old.sowide.persistence;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Set;


public class Archivio 
{
	private String testoProva;
    Set<Prova> prove;
	Docente docente;
	Set<Studente> studenti;
	
	Studente s = new Studente();
    Prova p = new Prova();
	
	
	//Sfrutto il costruttore per inserire tipi di dati diversi
    Archivio(String nome, String cognome, Integer numMatricola, String nomeCorso, String data, Integer durata, Calendar tempLim)
    {
   
    }

	
	public Archivio() {
		// TODO Auto-generated constructor stub
	}


	public void registraDati() {  
		  List<Archivio> datiStudente = new ArrayList<>();
		  datiStudente.add(new Archivio(this.s.getNome(), this.s.getCognome(), this.s.getNumMatricola(), this.p.getNomeCorso(), this.p.getData(), this.p.getDurata(),p.calcolaTempoLimite()));
		  System.out.println("Dati registrati \n");
	}
	  
	public String getTestoProva() {
		return this.testoProva;
	}

	public void setTestoProva(String testoProva) {
		this.testoProva = testoProva;
	}

	public void fornireProva()
	{
		 String prova;
		 Calendar consegna = p.calcolaTempoLimite();  
		 prova = String.format("Fornita prova di %s, della durata di %d minuti, alle ore: %s", p.getNomeCorso(), p.getDurata(), p.getData());
		 System.out.println(prova);
		 String tempo;
		 tempo = String.format("Tempo limite consegna: %d:%d \n",consegna.get(Calendar.HOUR_OF_DAY),consegna.get(Calendar.MINUTE));
		 System.out.println(tempo);
	}
	
	public void mailRicezione()
	{
		String tempo1;
		Calendar c1 = Calendar.getInstance(); //controllo l'ora corrente
		tempo1 = String.format("Tempo corrente: %d:%d",c1.get(Calendar.HOUR_OF_DAY),c1.get(Calendar.MINUTE));
		System.out.println(tempo1);

		if(c1.before(p.calcolaTempoLimite()))  //confronto l'ora della consegna con l'ora che indica il tempo limite
		{
			System.out.println("Consegna andata a buon fine! \n");

		}
		else
		{
			System.out.println("Tempo scaduto! \n");
			
		}
	}
	
}

