
public class Person {
	private String name ="";
	public Person() {
		name = "default name";
	}
	public String getName() {
		return name;
	}
	void setName(String nameString) {
		name = nameString;
		System.out.println("The name is set to " + nameString);
	}
}
