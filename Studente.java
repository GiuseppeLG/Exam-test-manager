package it.unipr.old.sowide.persistence;
import java.util.Scanner;

import org.junit.jupiter.api.Test;

public class Studente 
{
	private  String nome;
	private  String cognome;
	private  int numMatricola;
	
	
	Scanner input = new Scanner (System.in);

    Prova p = new Prova();
    
    // Test  della classe con JUnit
    @Test
	public void iscrivereEsame() 
	{	
	 // Lo Studente fornisce i propri dati ed effettua l'iscrizione
	 System.out.print("- Iscrizione studente.\n");
	 System.out.print("Nome: ");	
	 this.setNome(input.nextLine());
	 System.out.print("Cognome: ");	
	 this.setCognome(input.nextLine());
	 System.out.print("Matricola: ");	
	 this.setNumMatricola(input.nextInt());
	 String iscrizione;
	 iscrizione = String.format("Iscrizione effettuata per lo studente %s %s matricola %d \n",this.nome,this.cognome,this.numMatricola);
	 System.out.println(iscrizione);
	}
	
    @Test
	public boolean consegnaProva()
	{
		// La consegna della prova avviene in automatico per evitare richiesta ciclicamente
		Archivio a = new Archivio();
		System.out.print("- Consegna Prova: \n");
		System.out.println("prova consegnata \n");
		a.mailRicezione();
		return true;
		
	}
	
	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return this.cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public  Integer getNumMatricola() {
		return this.numMatricola;
	}

	public void setNumMatricola(Integer numMatricola) {
		this.numMatricola = numMatricola;
	}

}