package thread;

class MyThread extends Thread{
	public void run() {
		int i;
		for(i=0;i<=50;i++) {
			System.out.print(i + "\t");
			try {
				sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class MyThread1 implements Runnable{
	public void run() {
		int i;
		for(i=0;i<=50;i++) {
			System.out.print(i + "\t");
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class ThreadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main start");
		MyThread thread1 = new MyThread();
		thread1.start();
		MyThread thread2 = new MyThread();
		thread2.start();
		
		
		MyThread1 thread3 = new MyThread1();
		Thread th3 = new Thread(thread3);
		th3.start();
		
		Thread th4 = new Thread(new MyThread1()); 
		th4.start();
		System.out.println("main end");
	}

}
