package uvsq21921358;

import org.junit.Before;
import org.junit.jupiter.api.Test;

public class CompositeTest {

	PersonnelImuable p1= new PersonnelImuable();
	PersonnelImuable p2= new PersonnelImuable();
	PersonnelImuable p3= new PersonnelImuable();
	PersonnelImuable p4= new PersonnelImuable();
		
	@Test
	public void test() {
		
		CompositePersonnel personne = new CompositePersonnel(0);
		CompositePersonnel personn1 = new CompositePersonnel(1);
		CompositePersonnel personn2 = new CompositePersonnel(2);
			
		personn1.add(p1);
		personn1.add(p2);
		
		personn2.add(p3);
		personn2.add(p4);
		
		personne.add(personn1);
		personne.add(personn1);
		
		
		personn1.print();
		personn2.print();
		
	}
		
}
