package innerclass;

public class InnerClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OutClass outClass = new OutClass();
		
		outClass.usingInMethod();
		
		OutClass.InClass inClass = outClass.new InClass();
		inClass.inTest();
		

	}

}

class OutClass{
	
	private InClass inClass;
	private int num = 100;
	private static int snum = 300;
	public OutClass() {
		inClass = new InClass();
		
	}
	class InClass{
		int inNum =200;
		
		void inTest() {
			System.out.println(num);
			System.out.println(inNum);
			System.out.println(snum);
		}
	}
	
	static class StaticInClass{
		//staic class can not use not static value
//		int sinum = num;
		int sinum = snum;
	}
	
	public void usingInMethod() {
		inClass.inTest();
	}
}