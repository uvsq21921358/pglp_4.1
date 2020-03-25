package uvsq21921358;


import java.time.LocalDate;
import java.util.ArrayList;

public class PersonnelImuable implements Personnel{

	private final String nom;
	private final String prenom;
	
	private final LocalDate dateNaiss;
	private  ArrayList<NumTelephone> numT = new ArrayList<NumTelephone>();
	
	
	public static class Builder{
		
	//PARAMETRE OBLIGATOIRE
		private final String nom;
		private final String prenom;
	//PARAMETRE OPTIONNEL	
		private LocalDate dateNaiss = LocalDate.of (1997, 06, 15);
		private  ArrayList<NumTelephone> numT = new ArrayList<NumTelephone>();
		
		
		public Builder (String nom,String prenom) {
			this.nom=nom;
			this.prenom=prenom;
		}
		
		public Builder dateNaiss(int annee, int mois,int jour) {
			this.dateNaiss= LocalDate.of(annee, mois, jour);
			return this;
		}
		
		public Builder numT(NumTelephone numT) {
			this.numT.add(numT);
			return this;
			
		}
		
		public PersonnelImuable build() {
			return new PersonnelImuable(this);
			
		}
	}
	
	private PersonnelImuable(Builder build) {
		
		nom=build.nom;
		prenom=build.prenom;
		
		dateNaiss=build.dateNaiss;
		numT=build.numT;
		
	}
	
	public static void main (String arg[]) {
		
		PersonnelImuable personne= new PersonnelImuable.Builder("TAHOURA","JEAN").dateNaiss(1997,02,8).numT(new NumTelephone("70010203","34567890","2345676788")).build();
	}

	public void print() {
		// TODO Auto-generated method stub
		
	}
}
