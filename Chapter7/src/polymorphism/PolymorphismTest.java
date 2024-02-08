package polymorphism;

import java.util.ArrayList;

import inheritance.GoldMemberShip;
import inheritance.MemberShip;

public class PolymorphismTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ctrl shift o
		ArrayList<MemberShip> memberlist = new ArrayList<MemberShip>();
		MemberShip memberLee = new MemberShip(1001, "Lee");
		MemberShip memberKim = new GoldMemberShip(1002,"Kim");
		
		memberlist.add(memberKim);
		memberlist.add(memberLee);
		
		int price = 10000;
		
		for (MemberShip member:memberlist) {
			int newPrice= member.calcPrice(price);
			System.out.println(member.memberShip + newPrice);
		}
		
	}

}
