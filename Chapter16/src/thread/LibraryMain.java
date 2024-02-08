package thread;

import java.util.ArrayList;

class Library{
	public ArrayList<String> shelf = new ArrayList<String>();
	public Library() {
		shelf.add("book 1");
		shelf.add("book 2");
		shelf.add("book 3");
		
	}
	
	public synchronized String lendBook() throws InterruptedException {
		Thread t = Thread.currentThread();
		
		while(shelf.size()==0) {
			System.out.println(t.getName() +" waiting start");
			wait();
//			return null;
		}
		
		String book = shelf.remove(0);
		System.out.println(t.getName() +" " + book+" " + "lend");
		return book;
	}
	
	public synchronized void retrunBook(String book) {
		Thread t = Thread.currentThread();
		shelf.add(book);
		notifyAll();
		System.out.println(t.getName() +" " + book+" " + "return");
		
	}
}

class Student extends Thread{
	public void run() {
		
		
		try {
			String title = LibraryMain.library.lendBook();
			if (title==null) return;
			sleep(5000);
			LibraryMain.library.retrunBook(title);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.out.println(e);
		}
		
	}
}
public class LibraryMain {
	
	public static Library library = new Library();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student std1 = new Student();
		Student std2 = new Student();
		Student std3 = new Student();
		Student std4 = new Student();
		Student std5 = new Student();
		Student std6 = new Student();
		
		std1.start();
		std2.start();
		std3.start();
		std4.start();
		std5.start();
		std6.start();

	}

}

