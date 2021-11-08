public class HW8_3 {

	public static void main(String[] args) {
		
			Animal83[] animal = new Animal83[2]; 
			
			animal[0] = new Dog83("Tom", 3, "hunting"); 
			animal[1] = new Cat83("Jerry", 7, "yellow"); 
			printAnimalArray(animal); 
			
	}
		
    static void printAnimalArray(Animal83[] animal) {
			for (int i = 0; i < animal.length; i++) {
				System.out.print("animal[" + i + "] ");
				System.out.print(animal[i]); 
				System.out.println(" sound: " + animal[i].sound()); 
			}
	}
}
// your code for class Animal83, Dog83, Cat83

abstract class Animal83 {
    String name;
    int age;

    abstract String sound();

}


class Dog83 extends Animal83 {
    String specialty;

    public Dog83(String name, int age, String specialty) {
        this.name = name;
        this.age = age;
        this.specialty = specialty;
    }

    public String toString() {
        return ("[DOG] name("+ name + ") age("+ age + ") specialty(" + specialty +")");
    }

    public String sound() {
        return ("wal-wal");
    }

}

class Cat83 extends Animal83 {
    String color;

    public Cat83(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public String toString() {
        return ("[CAT] name("+ name + ") age("+ age + ") color(" + color+")");
    }

    public String sound() {
       return "meow";
    }
    
}