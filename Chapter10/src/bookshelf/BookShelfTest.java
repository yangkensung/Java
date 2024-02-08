package bookshelf;

public class BookShelfTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Queue bookShelf = new BookShelf();
		bookShelf.enQueue("book1");
		bookShelf.enQueue("book2");
		bookShelf.enQueue("book3");
		
		System.out.println(bookShelf.deQueue());
		System.out.println(bookShelf.deQueue());
		System.out.println(bookShelf.deQueue());
		
		BookShelf bookshelf2 = new BookShelf();
		bookshelf2.enQueue("Book1");
		bookshelf2.enQueue("Book2");
		bookshelf2.enQueue("Book3");
		System.out.println(bookshelf2.stack());
		System.out.println(bookshelf2.stack());
		System.out.println(bookshelf2.stack());

	}

}
