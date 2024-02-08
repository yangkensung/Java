package classexample;

public class Person {
	
	public int height;
	public int weight;
	public String name;
	private String fullname;
	
//	default constructor
//	public Person() {}
	
//constructor overloading
	public Person() {}
	public Person(String pName) {
		this.name = pName;
		this.fullname = pName;
	}
	public Person(int pHeight, int pWeight, String pName) {
		this.name = pName;
		this.weight = pWeight;
		this.height = pHeight;
	}
	
	public String showPersonInfo() {
		return "name is " + name + " height is " + height + " weight is " + weight;
	}
	
	public void setName(String newName) {
		this.fullname = newName;
	}
	
	public String getName() {
		return this.fullname;
	}

}
