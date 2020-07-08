package Loms;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

public class nonNull_Example {

	public static void main(String[] args) {

		EmployeeService es = new EmployeeService();
		es.increaseSalary(null);

		Company c = new Company();
		c.setLocation(null);
		System.out.println(c.getLocation());

	}

}

class EmployeeService {

	public void increaseSalary(@NonNull String name) {
		System.out.println(name);
	}
}

@Getter
@Setter
class Company {

	@NonNull
	private String location;
}
