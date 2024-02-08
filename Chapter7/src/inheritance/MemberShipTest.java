package inheritance;

public class MemberShipTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MemberShip memberLee = new MemberShip(1002,"Lee");
		
		GoldMemberShip memberKim = new GoldMemberShip(1001, "kim");
		
		MemberShip memberPark = new GoldMemberShip(1003,"Part");
		
		if( memberPark instanceof GoldMemberShip) {
			GoldMemberShip gmember = (GoldMemberShip)memberPark;
			System.out.println(gmember.salesRatio);
		}
		
		int price = 10000;
		int memberPrice = memberLee.calcPrice(price);
		System.out.println(memberPrice);
		
		int goldmemberPrice = memberKim.calcPrice(price);
		System.out.println(goldmemberPrice);
		
		int checkmemberPrice = memberPark.calcPrice(price);
		System.out.println(checkmemberPrice);

	}

}
