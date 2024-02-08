package inheritance;

public class MemberShip {
	
	protected int memberId;
	protected String memberName;
	protected int bonusPoint;
	protected double bonusRatio;
	public String memberShip;
	
//	public MemberShip(){
//		memberShip = "Silver";
//		System.out.println("Create Silver member class");
//	}
//	
	public MemberShip(int memberId, String memberName) {
		this.memberId = memberId;
		this.memberName = memberName;
		this.memberShip = "Silver";
		this.bonusRatio = 0.01;
		System.out.println("Create Silver member class");
	}
	
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price;
	}

}
