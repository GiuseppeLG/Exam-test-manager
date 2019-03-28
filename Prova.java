package it.unipr.old.sowide.persistence;
import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity
@Table(name = "DatiProva")
public class Prova 
{
	private static String nomeCorso; 
	private static String data;
	private static int durata;
	
	@Id
	public Integer getDurata() {
		return durata;
	}

	public void setDurata(Integer durata) {
		Prova.durata = durata;
	}

	
	public String getNomeCorso() {
		return nomeCorso;
	}

	public void setNomeCorso(String nomeCorso) {
		Prova.nomeCorso = nomeCorso;
	}

	public Calendar calcolaTempoLimite()
	{	
		Calendar tempLim = Calendar.getInstance();
		tempLim.add(Calendar.MINUTE,durata);   //sommo la durata in minuti all'orario corrente per calcolare il tempo limite
		return tempLim;
	}



	public String getData() {
		return data;
	}

	public void setData(String data) {
		Prova.data = data;
	}
	
}
