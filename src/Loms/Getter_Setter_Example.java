package Loms;

import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;


/**
 * @author Ash
 *Class wise getters and setters for all fields
 */
@Getter
@Setter
@EqualsAndHashCode
public class Getter_Setter_Example {

	private String first_name;
	private String last_name;
	private int age;
	@Setter(value = AccessLevel.PROTECTED)
	private int secretCode; // managing setters access level

	/*
	 * //field wise Getter and Setter
	 * 
	 * @Getter
	 * 
	 * @Setter private String iAmString;
	 */

	// <-----------------------------------------------Testing Example------------------------------------------------------------>

	public static void main(String[] args) {
		Getter_Setter_Example gse = new Getter_Setter_Example();

		gse.setFirst_name("Hrk");
		gse.setLast_name("Singh");
		gse.setAge(21);
		gse.setSecretCode(1234);

		System.out.println(gse.getFirst_name());
		System.out.println(gse.getLast_name());
		System.out.println(gse.getAge());
		System.out.println(gse.getSecretCode());

	}
}
