package uvsq21921358;

import java.awt.List;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

public abstract class IteratorPersonnel implements Iterator<Personnel> {
	
	private PersonnelGroupe racine;
	protected Collection<Personnel> collection;

	public IteratorPersonnel(PersonnelGroupe personnelGroupe, Collection<Personnel> collection) {
		this.racine = personnelGroupe;
		this.collection = collection;
		this.collection.addAll(racine.getAllPersonnel());
	}
	
	

	public boolean hasNext() {
		return !collection.isEmpty();
	}

	public Personnel next() {
		if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Personnel pt = getFromCollection();
        if(pt.isGroupe()) {
        	collection.addAll(((PersonnelGroupe) pt).getAllPersonnel());
        }

		return pt;
	}
	abstract protected Personnel getFromCollection();

	public Personnel getRacine() {
		return racine;
	}

}
