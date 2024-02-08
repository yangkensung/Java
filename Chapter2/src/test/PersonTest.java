package test;

import classexample.Person;

public class PersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person personLee = new Person();
		personLee.height = 180;
		personLee.weight = 80;
		personLee.name = "Leecc";
		
		System.out.println(personLee.showPersonInfo());
		System.out.println(personLee);

	}

}
