package generic;

public class GenericPrinterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericPrinter<Powder> powderPrinter = new GenericPrinter<Powder>();
		powderPrinter.setMaterial(new Powder());
		System.out.println(powderPrinter);
		
		GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<Plastic>();
		plasticPrinter.setMaterial(new Plastic());
		System.out.println(powderPrinter);
		
		//water is not extends from Material
		//GenericPrinter<Water> waterPrinter = new GenericPrinter<Water>();

	}

}
