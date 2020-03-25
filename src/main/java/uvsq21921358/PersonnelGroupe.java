package uvsq21921358;

import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class PersonnelGroupe implements Personnel, Iterator<Personnel> {
	

	private final List<Personnel> personnelList;
	
	public PersonnelGroupe() {
		personnelList = new ArrayList<Personnel>();
	}
	
	public void addPersonnel(Personnel p) {
		personnelList.add(p);
	}

	public void removePersonnel(Personnel p) {
		personnelList.remove(p);
	}

	public List<Personnel> getAllPersonnel() {
		return personnelList;
	}

	public Iterator<Personnel> iterator() {
		return personnelList.listIterator();
	}


	public ParGroupeIterator parGroupeIterator() {
		return new ParGroupeIterator(this);
	}

	public ParHierarchieIterator parHierarchieIterator() {
		return new ParHierarchieIterator(this);
	}

	public boolean isGroupe() {
		return true;
	}
	
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return false;
	}

	public Personnel next() {
		// TODO Auto-generated method stub
		return null;
	}

	public void print() {
		// TODO Auto-generated method stub
		
	}

	public Collection<? extends Personnel> getAllPersonnel1() {
		// TODO Auto-generated method stub
		return null;
	}

}
