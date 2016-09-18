/*Assignment – Calculate an area of different shapes.
*/
interface Shape{
	public void draw();
	public void getArea();
}
class Rectangle implements Shape{
	
	int width;
	int height;
        //constructor
	public Rectangle(int x, int y, int width, int height){
	this.width=width;
	this.height=height;
	}
	@Override
	public void draw() {
		System.out.println("Draws a rectangle with width = "+width+ " and height = "+height);
		
	}

	@Override
	public void getArea() {
		int area = width * height;
		System.out.println("The Area of the Rectangle is "+area);
		
	}
	
}
class Square implements Shape{
	int side;
	public Square(int side){
		this.side=side;
	}
	@Override
	public void draw() {
		System.out.println("Draws a square with side = "+side);
		
	}
	@Override
	public void getArea() {
		int area = side*side;
		System.out.println("The area of the Square is "+area);
		
	}
	
}
class Triangle implements Shape{
	int base;
	int height;
	public Triangle(int b, int h){
		this.base=b;
		this.height=h;
		
	}
	

	@Override
	public void draw() {
		System.out.println("Draws a triangle with base = "+base+ " and height = "+height);
		
	}
	@Override
	public void getArea() {
		int area = (base*height)/2;
		System.out.println("The area of the triangle is "+area);
		
	}
}
class Rhombus implements Shape{
	int altitude;
	int side;
	public Rhombus(int altitude, int side){
		this.altitude=altitude;
		this.side=side;
	}
	@Override
	public void draw() {
		System.out.println("Draws a rhombus with altitude = "+altitude+ " and side = "+side);
		
	}
	@Override
	public void getArea() {
		int area = altitude * side;
		System.out.println("The area of the rhombus is "+area);
		
	}
	
}
public class Session_6_Assignment_3 {
    public static void main(String[] args) {
		Shape rectangle = new Rectangle(10 , 10, 60, 30);
		rectangle.draw();
		rectangle.getArea();
		
	Shape square = new Square(8);
		square.draw();
		square.getArea();
		
		Shape triangle = new Triangle(20, 15);
		triangle.draw();
		triangle.getArea();
		
		Shape rhombus = new Rhombus(15, 8);
		rhombus.draw();
		rhombus.getArea();
		
	}
}
