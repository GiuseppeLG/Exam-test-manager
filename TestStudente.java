package it.unipr.old.sowide.persistence;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import static org.mockito.Mockito.*;

public class TestStudente {
	
	StudenteService service; 
	
	@Before
	public void setup() throws Exception {
		Studente s = mock(Studente.class);
		when(s.consegnaProva()).thenReturn(true);
		service = new StudenteService();
		service.setS(s);
	}
	
	@Test
	public void testConsegnaProva() {
		
	assertEquals(true, service.consegnareProva());
	}
	
}
