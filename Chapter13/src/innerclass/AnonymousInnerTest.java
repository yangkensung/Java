package innerclass;

class Outer{
	public Runnable getRunnable(){
//		class MyRunnable implements Runnable{
//			@Override
//			public void run() {
//				// TODO Auto-generated method stub
//				System.out.println("Run()");
//			} 
//		}
//		return new MyRunnable();
		
		return new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("Run Run Run");
			}
			
		};
	}
	Runnable runner = new Runnable() {

		@Override
		public void run() {
			// TODO Auto-generated method stub
			System.out.println("RRRRRin");
			
		}};
//	Runnable runner new Runnable() {
//		@Override
//		public void run() {
//			System.out.println("RRun");
//		}
//	};
//	
}

public class AnonymousInnerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer outer = new Outer();
		Runnable runnable = outer.getRunnable();
		runnable.run();
		outer.runner.run();

	}

}
