package iostream;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class SystemInTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
//		int i = System.in.read();
//		System.out.println(i + " " + (char)i);
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("name : ");
		String name = scanner.nextLine();
		System.out.println("no : ");
		int num = scanner.nextInt();
		
		System.out.println(name);
		System.out.println(num);
		
		System.out.println("======");
		
		int i = 0;
		while ( (i = System.in.read()) != 'q') {
			System.out.println(i + " " + (char)i);
			
		}
		System.out.println("----------------");
		InputStreamReader isr = new InputStreamReader(System.in);
		while ( (i = isr.read()) != '끝') {
			System.out.println(i + " " + (char)i);
		}

	}

}
