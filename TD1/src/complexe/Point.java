package complexe;

public class Point {
	
	double x,y;
	static int nob=0;
	int num;
	
	public Point(double x,double y) {
		this.x=x;
		this.y=y;
		nob++;
		num=nob;
		
	}
	public void afficher() {
		System.out.println("Point n "+num);
		System.out.println("X="+x+"Y="+y);
		System.out.println("Le nob"+nob);
	}
	public boolean origine() {
		return x==0 && y==0;
		
	}
	
	public boolean egale(Point q) {
		return x==q.x && y==q.y;
	}
	
	public Point symetrie() {
		return new Point(-x,-y);
		
	}
	
	
	
	
	
}
