package thisex;

public class Person {
	
	private String name;
	private String address;
	public Person() {
		this("noname","noaddress");
	}
	
	public Person(String name, String address) {
		this.name = name;
		this.address = address;
	}
	
	public void showInfo() {
		System.out.println(name);
		System.out.println(address);
	}
	
	public Person returnSelf() {
		return this;
	}

}
