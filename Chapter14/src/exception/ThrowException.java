package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowException {
	
	public Class loadClass(String filename, String className) throws FileNotFoundException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream("a2.txt");
		Class c = Class.forName(className);
		return c;
	}
	
	public static void main(String[] args) {
		ThrowException test = new ThrowException();
		
//		throw new Exception();
		
		try {
			test.loadClass("a2.txt", "Test");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.out.println(e);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.out.println(e);
		} catch(Exception e) {
			System.out.println(e);
		}
	}

}
