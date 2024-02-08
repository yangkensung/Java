package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileIOExceptionTest {

	public static void main(String[] args) {
//		FileInputStream fis = null;
//		try {
//			fis = new FileInputStream("a.txt");
//			
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			//e.printStackTrace();
//			System.out.println(e);
//		}finally {
//			try {
//				fis.close();
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}catch(NullPointerException e) {
//				System.out.println(e);
//			}
//			System.out.println("Finally");
//		}
		
//		FileInputStream fis1 = new FileInputStream("a.txt");
		try(FileInputStream fis2 = new FileInputStream("a.txt")){
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println(e);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("End----");

	}

}
