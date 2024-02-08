package iostream;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class FileIOTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub		
		FileInputStream fis = new FileInputStream("a.txt");
		
		int j = fis.read();
		System.out.println(j + " " + (char)j);
		
		FileOutputStream fos = new FileOutputStream("b.txt", true);
		fos.write(97);
		fos.write(98);
		fos.write(99);
		fos.close();

		int i;
		while ((i = fis.read()) != -1 ){
			System.out.println(i + " " + (char)i);			
		}
		fis.close();
		System.out.println("===================");
		
		FileInputStream fis2 = new FileInputStream("a.txt");
		InputStreamReader isr = new InputStreamReader(fis2);
		while ((i = isr.read()) != -1 ){
			System.out.println(i + " " + (char)i);			
		}
		isr.close();
		
		Socket socket = new Socket();
		BufferedReader br = new BufferedReader( new InputStreamReader(socket.getInputStream()));
		
	}
}
