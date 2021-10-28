// do not change class 'Main' code

public class Mid2 {

	public static void main(String[] args) {
		Triple t1 = new Triple(); 
		Triple t2 = new Triple(9, 2, 3); 
		Triple t3 = new Triple(6, 12, 8); 
		
		System.out.println("t1 = " + t1); 
		System.out.println("t2 = " + t2); 
		System.out.println("t3 = " + t3); 
		System.out.println("t2 add t3 = " + t2.add(t3)); 
		System.out.println("t3 sub t2 = " + t3.sub(t2)); 
		System.out.println("t2 sub t3 = " + t2.sub(t3)); 
		System.out.println("t1 merge t2 = " + t1.merge(t2)); 
		System.out.println("t2 merge t3 = " + t2.merge(t3));
		System.out.println("t3 merge t2 = " + t3.merge(t2)); 

	}
}

// your code for class Triple

class Triple {
    public int x,y,z;

    public Triple() {
        x = y = z = 0;

    }

    public Triple(int x, int y, int z) {

		this.x = Math.min(Math.min(x,y),z);
        this.z = Math.max(Math.max(x,y),z);
        this.y = (x+y+z)-this.x-this.z;


    }

	public String toString() {
		return ("["+x+" "+y+" "+z+"]");
	}

	public Triple add(Triple tr) {
		return new Triple(x + tr.x, y + tr.y, z + tr.z);
	}

	public Triple sub(Triple tr) {
		return new Triple(x - tr.x, y- tr.y, z-tr.z);
	}

	public Triple merge(Triple tr) {
		return new Triple(Math.min(x, tr.x), y,Math.max(z, tr.z));
	}



}