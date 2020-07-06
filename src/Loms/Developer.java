package Loms;

import lombok.ToString;
import lombok.ToString.Exclude;
import lombok.ToString.Include;

/**
 * @author Ash
 */

@ToString
public class Developer {

	private String name = "Ash";
	private String language = "Java";
	@Exclude
	private int salary = 0;
	private int experienceInYears;
	
	@Include
    public boolean isJunior() {
        return experienceInYears < 2;
    }

	//<----------------------------testing example------------------------------------>
	public static void main(String[] args) {
       System.out.println(new Developer().toString());
	}

}
