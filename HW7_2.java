public class HW7_1 {

	public static void main(String[] args) {
		Parent72 p1 = new Parent72(); 
		Parent72 p2 = new Parent72(1); 
		Child72 c1 = new Child72(); 
		Child72 c2 = new Child72(2); 
		Child72 c3 = new Child72(3, 4); 
		GrandChild72 g1 = new GrandChild72(); 
		GrandChild72 g2 = new GrandChild72(11);
		GrandChild72 g3 = new GrandChild72(12, 13, 14); 
		
		System.out.println("p1: " + p1); 
		System.out.println("p2: " + p2);
		System.out.println("c1: " + c1);
		System.out.println("c2: " + c2);
		System.out.println("c3: " + c3);
		System.out.println("g1: " + g1);
		System.out.println("g2: " + g2);
		System.out.println("g3: " + g3);
		p1.hello();
		p2.hello();
		c1.hello();
		c2.hello();
		g1.hello(25);
		g2.hello(32);
		g3.hello(); 
	}

}

class Parent72 {
    protected int x = 5;

    public Parent72() {
        x = 5;
    }

    public Parent72(int x) {
        this.x = x;
    }

    public String hello() {
        String str = "Hello, friends!";
        System.out.println(str);
        return str;  
    }

    public String toString() {
		return "[PARENT] x = "+x;
	}


}

class Child72 extends Parent72 {
    protected int y = 7;

    public Child72() {
        x = 5;
        y = 7;
    }

    public Child72(int y) {
        x= 5;
        this.y = y;
    }

    public Child72(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
		return (super.toString() + " [CHILD] y = "+y);
	}

}

class GrandChild72 extends Child72 {
    protected int z = 9;

    public GrandChild72() {
        x = 5;
        y = 7;
        z = 9;
    }

    public GrandChild72(int c) {
        z = 5;
        y = 7;
        z = c;
    }

    public GrandChild72(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public String hello() {
        String str = "Hello, baby!";
        System.out.println(str);
        return str;
    }

    public int hello(int a) {
        System.out.println(a+" "+a+" "+a);
        return (a+a+a);
    }

    public String toString() {
		return (super.toString() + " [GRAND CHILD] z = "+z);
	}
}