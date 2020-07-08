package Loms;

import java.util.HashSet;
import java.util.Set;

import lombok.Builder;
import lombok.Singular;
import lombok.ToString;

public class builderExample {

	public static void main(String[] args) {
		Student s = Student.builder().name("Ash").age(20).build();
		System.out.println(s);

		StudentX sx = StudentX.builder().school("XYZ School").section("A").build();
		System.out.println(sx);

		StudentY sy =StudentY.createStudent("Hrk",21, "ABS School");
		System.out.println(sy);
		
		StudentZ sz = StudentZ.builder().lesson("Java").lesson("c").build();
		System.out.println(sz);
		
		Set<String> lessons = new HashSet<String>(); ;
		lessons.add("A");
		lessons.add("S");
		lessons.add("H");
		lessons.add("J");
		
		StudentZ sz1 = StudentZ.builder().lessons(lessons).build();
		System.out.println(sz1);
		
		StudentA sa = StudentA.builder().build();
		System.out.println(sa);
	}

}


//<----------------------------Class Based------------------------------->
@Builder
@ToString
class Student {

	private String name;
	private int age;
}


//<---------------------------Constructor Based--------------------------->
@ToString
class StudentX {

	private String name;
	private int age;
	private String section;
	private String school;

	@Builder
	public StudentX(String section, String school) {
		this.section = section;
		this.school = school;
	}
}


//<---------------------------Method Based--------------------------->
@ToString
class StudentY {

	private final String name;
	private final int age;
	private String section;
	private String school;

	public StudentY(String name, int age, String section, String school) {
		this.name = name;
		this.age = age;
		this.section = section;
		this.school = school;
	}

	@Builder
	public static StudentY createStudent(String name, int age, String school) {
		return new StudentY(name, age, "",school);
	}
}

//<---------------------------for Collection-Valued Fields----------------------->

@Builder
@ToString
class StudentZ {

    private String name;
    private int age;
    @Singular
    private Set<String> lessons;
}

//<---------------------------Default Value---------------------------------------->
@Builder
@ToString
class StudentA {

    private String name;
    private int age;
    @Builder.Default
    private String teacher = "Mr. White";
}


