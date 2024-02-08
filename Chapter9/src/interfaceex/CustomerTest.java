
package interfaceex;

public class CustomerTest {
	public static void main(String[] args) {
		
		Customer customer = new Customer();
		 customer.sell();
		 customer.buy();
		 customer.order();
		 
		 Buyer buyer = customer;
//		 buyer.sell();//안됨
		 buyer.order();
	}

}
