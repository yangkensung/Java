package interfaceex;

public class Customer implements Buyer, Seller {

	@Override
	public void sell() {
		// TODO Auto-generated method stub
		System.out.println("Sell ");
		
	}

	@Override
	public void buy() {
		// TODO Auto-generated method stub
		System.out.println("Buy");
	}

	@Override
	public void order() {
		// TODO Auto-generated method stub
		System.out.println("Customer order : ");
	}

}
