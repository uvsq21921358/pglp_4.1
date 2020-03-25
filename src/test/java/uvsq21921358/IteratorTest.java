package uvsq21921358;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import org.junit.Before;
import org.junit.Test;

public class IteratorTest {

private PersonnelGroupe racine;

	@Before()
	public void setUp() {
		racine = new PersonnelGroupe();	
	}	
	
	@Test()
	public void testGetRacineParGroupe() {
		IteratorPersonnel pti = racine.parGroupeIterator();
		assertEquals(pti.getRacine(), racine);
	}
	
	@Test()
	public void testIsEmptyParGroupe() {
		IteratorPersonnel pti = new ParGroupeIterator(racine);
		assertFalse(pti.hasNext());
	}
	
	@Test()
	public void testPersonnelGroupeParGroupe() {
		PersonnelGroupe pg = new PersonnelGroupe();
		racine.addPersonnel(pg);
		IteratorPersonnel pti = new ParGroupeIterator(racine);
		assertEquals(pti.next(), pg);
	}
	
	@Test()

	public void testPersonnelParGroupe() {

		Personnel pg = new PersonnelImuable.Builder("TAHOURA","JEAN").dateNaiss(1997,02,8).numT(new NumTelephone("70010203","34567890","2345676788")).build();
		racine.addPersonnel(pg);
		IteratorPersonnel pti = new ParGroupeIterator(racine);
		assertEquals(pti.next(), pg);
	}

	
}

