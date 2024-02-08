package interfaceex;

public class CalculatorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 =10;
		int num2 =2;
		Calc calculator = new CompleteCalculator();
		calculator.description();
		System.out.println("add value is " + calculator.add(num1, num2));
		System.out.println("substract value is " + calculator.substract(num1, num2));
		System.out.println("times value is " + calculator.times(num1, num2));
		System.out.println("divide value is " + calculator.divide(num1, num2));
		
		Calc newCalc = new CalcNew();
		newCalc.description();
		
		int[] numbers = {1,2,3,4,5,6,7,8,9,10};		
		System.out.println(Calc.total(numbers));
		
		int[] numbers2 = new int[] {1,2,3,4,5,6,7,8,9,10};
		System.out.println(Calc.total(numbers2));
	}

}
