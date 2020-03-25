package uvsq21921358;

import java.util.ArrayDeque;

public class ParGroupeIterator extends IteratorPersonnel{

	public ParGroupeIterator(PersonnelGroupe personnelGroupe) {
		super(personnelGroupe, new ArrayDeque<Personnel>());
	}

	@Override
	protected Personnel getFromCollection() {
		return ((ArrayDeque<Personnel>) collection).remove();
	}
}
