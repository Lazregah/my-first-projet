package complexe;

public class TesPoint {

	public static void main(String[] args) {
		Point p=new Point(1,2);
		p.afficher();
		Point q=new Point(1,2);
		q.afficher();
		System.out.println(p.origine());
		System.out.println(p.egale(q));
	    Point s=new Point(-2,-1); 
		s.afficher();
		
	}
	

}
