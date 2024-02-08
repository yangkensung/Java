package template;

public abstract class Car {
	
	public void startCar() {
		System.out.println("start car");
	}
	
	public void trunOff() {
		System.out.println("trun off the car");
	}
	
	public abstract void drive();
	
	public abstract void stop();
	
	//final function can not re-define in extends class
	public final void run() {
		startCar();
		drive();
		stop();
		trunOff();
	}
	

}
