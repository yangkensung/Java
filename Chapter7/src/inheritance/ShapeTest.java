package inheritance;

class Point{
	int x;
	int y;
}

class Shape{
	public void draw() {
		System.out.println("Draw shape");
		
	}
}
class Rectangle extends Shape{
	//is a relation 
	public void draw() {
		System.out.println("Draw Rectangle");
	}
	
}
class Circle extends Shape{
	//has a relation
	Point p =new Point() ;
	public void draw() {
		System.out.println("Draw Circle");
	}
}

public class ShapeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape s = new Shape();
		Rectangle r = new Rectangle();
		Circle c = new Circle();
		
		drawShape(s);
		drawShape(r);
		drawShape(c);
		

	}
	public static void drawShape(Shape s) {
		s.draw();		
	}

}
