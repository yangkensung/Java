package object;

public class StudentTest {
	
	public static void main(String[] args) {
		
		Student studentKim = new Student("kim",1001);
		System.out.println(studentKim);
		
		String str = new String("test");
		String str2 = new String("test");
		System.out.println(str==str2);
		System.out.println(str.equals(str2));
		System.out.println(str.hashCode());
		System.out.println(str2.hashCode());
		
		Student studentKim2 = new Student("kimmm", 1001);
		System.out.println(studentKim==studentKim2);
		System.out.println(studentKim.equals(studentKim2));
		System.out.println(studentKim.hashCode());
		System.out.println(studentKim2.hashCode());
		System.out.println(System.identityHashCode(studentKim));
		System.out.println(System.identityHashCode(studentKim2));
	}

}
