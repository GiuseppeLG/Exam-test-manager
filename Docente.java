package it.unipr.old.sowide.persistence;
import java.util.Calendar;
import java.util.Scanner;
import java.text.SimpleDateFormat;

import org.hibernate.Session;
import org.hibernate.SessionFactory;


public class Docente 
{
	private Integer votiProve;
	Prova p = new Prova();
	Studente s = new Studente();
	
	Scanner input = new Scanner (System.in);
	
	 
	public void registraProve()
	{
		/////////////
		SessionFactory sessFact = HibernateUtil.getSessionFactory();
		Session session = sessFact.getCurrentSession();
		org.hibernate.Transaction tr = session.beginTransaction();
		//////////////
		
		String formdata = "HH:mm";
		SimpleDateFormat formData = new SimpleDateFormat (formdata);
		Calendar data = Calendar.getInstance();
		String dataFormattata = formData.format(data.getTime());
		
		// Il Docente inserisce i dati delle Prove
		System.out.print("- Inserisci i dati delle Prove nel database. \n");
		System.out.print("Nome corso: ");
		this.p.setNomeCorso(input.nextLine());
	
		p.setData(dataFormattata); // inserisce per comodita' l'orario attuale
		System.out.print("Durata (minuti): ");
		
		p.setDurata(input.nextInt());
		System.out.println("prove registrate. \n");
		
		/////////////
		session.save(p);
		tr.commit();
		System.out.println("Successfully inserted");
		sessFact.close();
		
	}
	
	public void correggeCompiti()
	{		
		 System.out.print("- Correzione Prove. \n"); 
		 System.out.print("Assegna voto: ");
		 this.setVotiProve(input.nextInt());
		  //riferimento ad una sola prova per evitare inserimento dati ciclicamente
	}
	
	public void mailVoto()  
	{
		correggeCompiti(); // la correzione dei compiti dovrebbe richiamare ogni prova consegnata ed assegnare un voto 
		if (this.votiProve >= 18 && this.votiProve <= 30)  
		{
			String voto;
			voto = String.format("Mail: voto assegnato %d",votiProve);
			System.out.println(voto);

		}
		else
		{
			System.out.println("Mail: voto insufficiente");
		}
	}

	public Integer getVotiProve() {
		return this.votiProve;
	}
	
	public void setVotiProve(Integer votiProve) {
		this.votiProve = votiProve;
	}
	

}
