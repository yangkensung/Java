package staticex;

public class CardTest {
	public static void  main(String[] args) {
		
		System.out.println(Card.serialNumber);
		
		Card cardLee = new Card();
		System.out.println(cardLee.cardNumber);
		
		Card cardKim = new Card();
		System.out.println(cardKim.cardNumber);
		
		System.out.println(cardLee.serialNumber);
		System.out.println(cardKim.serialNumber);
		System.out.println(Card.getSerialNumberP());
		
	}

}
