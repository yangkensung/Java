package bookshelf;

public class BookShelf extends Shelf implements Queue {

	@Override
	public void enQueue(String title) {
		// TODO Auto-generated method stub
		
		shelf.add(title);
		
	}

	@Override
	public String deQueue() {
		// TODO Auto-generated method stub
		
		return shelf.remove(0);
	}
	
	public String stack() {
		return shelf.remove(shelf.size()-1);
	}

}
