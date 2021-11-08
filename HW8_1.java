public class HW8_1 {

	public static void main(String[] args) {
		People p1, p2, p3; 
		
		p1 = new Asian();
		p2 = new European(); 
		p3 = new African(); 
		
		introduceMe(p1);
		introduceMe(p2);
		introduceMe(p3);
	}
	
	static void introduceMe(People p) {
		p.introduce(); 
	}

}
// your code here for more classes

class People {
    String str;

    public void introduce() {
        System.out.println("I'm "+ str);
    }
}

class Asian extends People{
    public Asian() {
        str = "Asian.";
    }
}

class European extends People{
    public European() {
        str = "European.";
    }

}

class African extends People{
    public African() {
        str = "African.";
    }

}



