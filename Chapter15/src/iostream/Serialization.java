package iostream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Person implements Serializable{
	
	String name;
	//transient 하면 직렬화 할때 제외 한다.
	transient String address;
	Person(String name, String address){
		this.name = name;
		this.address = address;
	}
	public String toString() {
		return name;
	}
}
public class Serialization {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		
		Person personKim = new Person("Kim", "Seoul");
		Person personLee = new Person("Lee", "Incheon");
		
		FileOutputStream fos = new FileOutputStream("object.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(personKim);
		oos.writeObject(personLee);
		
		oos.close();
		
		FileInputStream fis = new FileInputStream("object.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Object obj1 = ois.readObject();
		if(obj1 instanceof Person) {
			Person p = (Person)obj1;
			System.out.println(p);
		}
		
		Object obj2 = ois.readObject();
		if(obj2 instanceof Person) {
			Person p = (Person)obj2;
			System.out.println(p);
		}
		
		
	}
}
