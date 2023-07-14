package homework;

public class Person {

	private String name; 
	
	public Person() {
		
	}
	
	public Person(String name) {
		
	}
	
	public void setName (String name) {
	
		this.name = name;
		
	}

	public String getName() {
		
		return name;
		
	}
	
	public void display() {
		System.out.println("Name: " + getName());	
	}
	
	public boolean hasSameName(Person person) {
		if (person.getName().equals(this.name)) {
		return true;
		} else {
			return false;
			}
	}
}

// Person p1 = new Person("Tunji");
//Person p2 = new Person("Tunji");

//p1.hasSameName(p2);  return true