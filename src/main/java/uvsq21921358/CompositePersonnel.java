package uvsq21921358;

import java.util.ArrayList;

public class CompositePersonnel implements Personnel{

	public int Id;
	private ArrayList<Personnel> pers= new ArrayList<Personnel>();
	
	public CompositePersonnel(int Id) {
		this.Id=Id;
	}
	public void print() {
		
		System.out.println("L'identifiant du groupe est :"+ this.Id);
		
		for(Personnel person : pers) {
			person.print();
		}
	}
	
	public void add(Personnel person) {
		
		this.pers.add(person);
	}
	
	public void remove (PersonnelImuable person) {
		this.pers.remove(person);
	}

}
