package complexe;

public class Complexe {
	private int partrell;
	private int partimag;
	
	public Complexe() {
		partrell=0;
		partimag=0;
		
	}
	public Complexe(int r,int i) {
		partrell=r;
		partimag=i;
		
	}
	public int getPartrell() {
		return this.partrell;
	}
	public void setPartrell(int r) {
		this.partrell=r;
	}
	public int getPartimag() {
		return this.partimag;
	}
	
	public void setPartimag(int i) {
		this.partimag=i;
	}
	
	public Complexe plus(Complexe c) {
		return new Complexe(partrell + c.partrell,
				+partimag+ c.partimag);
		
	}
	
	
	public Complexe Moins(Complexe c) {
		return new Complexe(partrell - c.partrell,
				partimag-c.partimag);
	}
	
	public void Afficher() {
		System.out.println(+partrell+" + " +partimag+ " i " );
	}
	
	
	
	
	
	
	
}
