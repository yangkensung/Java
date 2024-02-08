package inheritance;

public class GoldMemberShip extends MemberShip {
	
	public double salesRatio;
	public GoldMemberShip(int memberId, String memberName) {
		super(memberId, memberName);
		memberShip = "Gold";
		bonusRatio = 0.05;
		salesRatio = 0.05;
		System.out.println("Create Gold member class");
	}
	
	@Override
	public int calcPrice(int price) {
		// TODO Auto-generated method stub
		bonusPoint += price * bonusRatio;
		price -= price * salesRatio;
		return price;
	}
	
//	public GoldMemberShip() {
//		//super();
//		//상위 클래스의 디폴트 생성자를 호출한다.
//		memberShip = "Gold";
//		bonusRatio = 0.05;
//		System.out.println("Create Gold member class");
//	}
	
	

}
