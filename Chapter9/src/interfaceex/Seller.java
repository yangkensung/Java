package interfaceex;

public interface Seller {
	
	void sell();
	
	default void order() {
		System.out.println("sell order");
	}
	
	

}
