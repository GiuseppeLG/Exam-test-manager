package it.unipr.old.sowide.persistence;

public class StudenteService {

	public Studente getS() {
		return s;
	}
	public void setS(Studente s) {
		this.s = s;
	}
	Studente s;
	
	public boolean consegnareProva() {
		return s.consegnaProva();
	}
}
