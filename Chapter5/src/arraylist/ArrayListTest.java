package arraylist;

import java.util.ArrayList;

import array.Book;

public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ctrl shift o import
		ArrayList list = new ArrayList();
		
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
		for(int i =0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		ArrayList<Book> library = new ArrayList<Book>();
		library.add(new Book("태백산백1","조정래"));
		
		for(Book book : library) {
			book.showBookInfo();			
		}
		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("test1");
		list2.add("test2");
		list2.add("test3");
		for(String name:list2) {
			System.out.println(name);
		}

	}

}

