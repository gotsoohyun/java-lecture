public class HW7_1 {

	public static void main(String[] args) {
		
		Point71 p1 = new Point71();
		Point71 p2 = new Point71(3, 5); 
		Point71 p3 = new Point71(); 
		p3.setXY(3,  5);
		System.out.println("p1: " + p1); 
		System.out.println("p2: " + p2);
		System.out.println("p3: " + p3);
		System.out.println("p1.equals(p2) = " + p1.equals(p2)); 
		System.out.println("p1.equals(p3) = " + p1.equals(p3)); 
		System.out.println("p2.equals(p3) = " + p2.equals(p3)); 
		
		Shape71 s1 = new Shape71();
		Shape71 s2 = new Shape71("Second_Shape", new Point71(2, 3)); 
		Shape71 s3 = new Shape71("Third_Shape", p2);
		Shape71 s4 = new Shape71("Third_Shape", p2);
		System.out.println("s1: " + s1); 
		System.out.println("s2: " + s2); 
		System.out.println("s3: " + s3); 
		System.out.println("s1.equals(s2) = " + s1.equals(s2)); 
		System.out.println("s1.equals(s3) = " + s1.equals(s3)); 
		System.out.println("s3.equals(s4) = " + s3.equals(s4)); 
		System.out.println("s2.equals(p2) = " + s2.equals(p2)); 
		
		Circle71 c1 = new Circle71(); 
		Circle71 c2 = new Circle71("Circle_Two", new Point71(5, 4), 6);
		Circle71 c3 = new Circle71("Circle_Two", new Point71(5, 4), 6); 
		System.out.println("c1: " + c1); 
		System.out.println("c2: " + c2);
		System.out.println("c3: " + c3); 
		System.out.println("c2.equals(c3) = " + c2.equals(c3)); 
		System.out.println("c2.equals(s2) = " + c2.equals(s2)); 
		
		Polygon71 poly1 = new Polygon71(); 
		Polygon71 poly2 = new Polygon71("Poly_First", new Point71(3, 3), 5);
		Polygon71 poly3 = new Polygon71("Poly_Second", new Point71(4, 4), 6); 
		System.out.println("poly1: " + poly1); 
		System.out.println("poly2: " + poly2); 
		System.out.println("poly3: " + poly3); 
		System.out.println("poly1.equals(poly2) = " + poly1.equals(poly2)); 
		System.out.println("poly2.equals(poly3) = " + poly2.equals(poly3)); 	
		System.out.println("poly2.equals(s3) = " + poly2.equals(s3)); 
	}

}

class Point71 {
    private int x,y;

    public Point71() {
        x = 0;
        y = 0;
    }

    public Point71(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setXY(int x, int y) {
        this.x = x; 
        this.y = y;
    }

	public String toString() {
		return ("[Point] ("+x+", "+y+")");
	}

	public boolean equals(Point71 other) {
		if (x == other.x && y == other.y) return true;
		return false;
	}
}

class Shape71 {
	protected String str;
	protected Point71 dot;

	public Shape71() {
		str = "noname";
		dot = new Point71(0,0);
	}

	public Shape71(String str, Point71 other) {
		this.str = str;
		this.dot = other;
	}

	public String toString() {
		return ("[Shape] "+ str + " center: "+ dot);
	}

	public boolean equals(Shape71 other) {
		if(str == other.str && dot == other.dot) return true;
		return false;
	}

	
}

class Circle71 extends Shape71 {
	protected int rad;

	public Circle71() {
		rad = 0;
	}

	public Circle71(String str, Point71 other, int rad) {
		this.str = str;
		this.dot = other;
		this.rad = rad;
	}

	public String toString() {
		return (super.toString()+" [CIRCLE] radius: "+ rad);
	}

	public boolean equals(Circle71 other) {
		if(str.equals(other.str) && dot.equals(other.dot) && rad == other.rad ) return true; //문제있음
		return false;
	}
}

class Polygon71 extends Shape71 {
	protected int ver;

	public Polygon71() {
		ver = 0;
	}

	public Polygon71(String str, Point71 other, int ver) {
		this.str = str;
		this.dot = other;
		this.ver = ver;
	}

	public String toString() {
		return (super.toString()+" [POLYGON] nVertex: "+ ver);
	}

	public boolean equals(Polygon71 other) {
		if(str == other.str && dot == other.dot && ver == other.ver) return true; 
		return false;
	}
}