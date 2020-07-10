package Loms;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

public class AllAboutConstructors {

	public static void main(String[] args) {
		
		Employee e = new Employee("ad", 3456);
		System.out.println(e);
		
		System.out.println(Department.of("sdsfgd", "dfd243"));
		
		Worker w = new Worker();
		System.out.println(w);
		
		Dev d = new Dev("Ash");
		System.out.println(d);
		
		Person p = new Person("qwerty");
		System.out.println(p);
		

	}

}

@AllArgsConstructor
@ToString
class Employee {

    private String name;
    private int salary;
}

@AllArgsConstructor(staticName = "of")
@ToString
class Department {

    private String location;
    private String employeeNumber;
}


@NoArgsConstructor
@ToString
class Worker {

    private String name;
    private int salary;
}

@RequiredArgsConstructor
@ToString
class Dev {

    private final String name;
    private int salary;
}


class Citizen {

    private String country = "India";
    public Citizen() {
		System.out.println("printing citizen's Country: "+country);
	}

}

@AllArgsConstructor
@ToString
class Person extends Citizen {

    private String name;

}
