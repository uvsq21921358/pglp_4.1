package uvsq21921358;

import java.util.Stack;

public class ParHierarchieIterator extends IteratorPersonnel {

	public ParHierarchieIterator(PersonnelGroupe personnelGroupe) {
		super(personnelGroupe, new Stack<Personnel>());
	}

	@Override
	protected Personnel getFromCollection() {
		return ((Stack<Personnel>) collection).pop();
	}


}
