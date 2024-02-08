package interfaceex;

public interface Buyer {
	
	void buy();
	
	default void order() {
		System.out.println("buy order : ");
	}

}
