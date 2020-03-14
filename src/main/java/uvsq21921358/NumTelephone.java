package uvsq21921358;

public class NumTelephone {

	public String NumPro;
	public String NumPort;
	public String NumPer;
	
	
	public NumTelephone(String NumPro,String NumPort, String NumPer) {
		this.NumPro=NumPro;
		this.NumPort=NumPort;
		this.NumPer=NumPer;
	}
	
	public NumTelephone() {
		
	}
	
	public void setNumeroProf(String NumPro) {
		this.NumPro=NumPro;
	}
	
	public void setNumeroPort(String NumPort) {
		this.NumPort=NumPort;
	}
	
	public void setNumeroPer(String NumPer) {
		this.NumPer=NumPer;
	}
}
