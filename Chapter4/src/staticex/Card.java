package staticex;

public class Card {
	
	static int serialNumber = 1000;
	int cardNumber;
	
	public Card() {
		serialNumber++;
		cardNumber = serialNumber;
	}
	
	private static int serialNumberP = 10000;

	public static int getSerialNumberP() {
		return serialNumberP;
	}

	public static void setSerialNumberP(int serialNumberP) {
		Card.serialNumberP = serialNumberP;
	}


	

}
