package collection;

import java.util.HashSet;
import java.util.TreeSet;

public class HashSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> set = new HashSet<String>();
		
		set.add("aaa");
		set.add("bbb");
		set.add("ccc");
		set.add("aaa");
		
		System.out.println(set);
		
		HashSet<Student> setStudent = new HashSet<Student>();
		setStudent.add(new Student("Kim", 1002));
		setStudent.add(new Student("Lee", 1001));
		setStudent.add(new Student("Park", 1003));
		//Student class check equal 
		setStudent.add(new Student("Kim", 1002));
		
		System.out.println(setStudent);
		
		TreeSet<String> strSet = new TreeSet<String>();
		
		strSet.add("aaa");
		strSet.add("bbb");
		strSet.add("ccc");
		strSet.add("aaa");		
		System.out.println(strSet);
		
		TreeSet<Student> setStudentTree = new TreeSet<Student>();
		setStudentTree.add(new Student("Kim", 1002));
		setStudentTree.add(new Student("Lee", 1009));
		setStudentTree.add(new Student("Park", 1003));
		//Student class check equal 
		setStudentTree.add(new Student("Kim", 1002));
		
		System.out.println(setStudent);

	}

}

