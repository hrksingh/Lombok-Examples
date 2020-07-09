package Loms;

import lombok.Data;

public class DataExample {

	public static void main(String[] args) {

		Superhero s = new Superhero();
		s.setName("Batman");
		s.setSuperPower("Detective Capabilities");
		s.setAge(30);
	
		System.out.println(s);
		
		System.out.println("Name: "+s.getName());
		System.out.println("Superpower: "+s.getSuperPower());
		System.out.println("Age: "+s.getAge());
		
	}
}

@Data
class Superhero {

	private String name;
	private String superPower;
	private int age;
}
