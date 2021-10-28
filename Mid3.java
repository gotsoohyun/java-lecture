// do not change class 'Main' code
public class Mid3 {

	public static void main(String[] args) {
		Process p = new Process(); 
		Process q = new Process(); 
		Process r = new Process(); 
		Process s = new Process(); 
		
		p.sendX(5);
		q.receiveX();
		r.receiveX();
		r.sendX(7);
		s.receiveX();
		p.receiveX();
		
		System.out.println(p);
		System.out.println(q);
		System.out.println(r);
		System.out.println(s);
	}
}

// your code for class Process
class Process {

    static int x;
    static int count = 0;
    int id;
    int realX;

    public Process() {
        id = count;
        count++;
    }
        
    

    public void sendX(int x) {
        this.x = x;
    }

    public int receiveX() {
        realX = x;
        return realX;
    }

    public String toString() {
        return ("Process ["+ id +"] x = "+ realX);
    }
}
