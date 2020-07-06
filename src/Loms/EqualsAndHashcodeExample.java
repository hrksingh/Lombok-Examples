package Loms;

import lombok.EqualsAndHashCode;
import lombok.EqualsAndHashCode.Exclude;
import lombok.EqualsAndHashCode.Include;

/**
 * @author Ash
 * @see http://www.javabyexamples.com/delombok-equalsandhashcode
 *
 */

@EqualsAndHashCode
public class EqualsAndHashcodeExample { 
	private String name;
    private int salary;
    
    @EqualsAndHashCode.Exclude
    private int age;
    
    @Exclude
    private int favNumber;
    
    //<--------------------------------------------------------------------------->

    @EqualsAndHashCode(onlyExplicitlyIncluded = true )
	class ABC{
		
    	@Include
		int a;
		int b;
	}

}
