package classexample;

public class PersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person personLee = new Person();
		personLee.height = 180;
		personLee.weight = 80;
		personLee.name = "Leecc";
//		cannot access private variable
//		personLee.fullname
		
		System.out.println(personLee.showPersonInfo());
		System.out.println(personLee);
		Person personKim = new Person("Hong");
		personKim.height = 170;
		personKim.weight = 70;
		personKim.name = "Kim";
		
		System.out.println(personKim.showPersonInfo());
		personKim.setName("Kimmmmmmmmmmm");
		System.out.println("show the full name " + personKim.getName());
		System.out.println(personKim);
		
		Person personChoi = new Person (165, 50, "Choi");
		System.out.println(personChoi.showPersonInfo());
		

	}

}
