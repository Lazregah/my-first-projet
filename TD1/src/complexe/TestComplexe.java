package complexe;

public class TestComplexe {

	public static void main(String[] args) {
		
		Complexe c1=new Complexe(2,2);
		Complexe c2=new Complexe(-3,4);
		c1.Afficher();
		c2.Afficher();
		Complexe somme=c1.plus(c2);
		System.out.print("c1 + c2 = ");
		somme.Afficher();
		Complexe diff=c1.Moins(c2);
		System.out.print("c1 - c2= ");
		diff.Afficher();
		
	}

}

