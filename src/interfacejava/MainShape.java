package interfacejava;

/*Create an interface named Shape consisting of two abstract methods named
calculateArea() and calculatePerimeter().

1. Create a class named Rectangle which implements the Shape interface.
2. Create a class named Circle which implements the Shape interface.
3. Create an object of the Rectangle class and assign it to a reference variable of the Shape interface.
4. Create an object of the Circle class and assign it to a reference variable of the Shape interface.

The overridden methods should calculate and print the following output:

For the Rectangle class:
- calculateArea() should calculate the area of the rectangle.
- calculatePerimeter() should calculate the perimeter of the rectangle.

For the Circle class:
- calculateArea() should calculate the area of the circle.
- calculatePerimeter() should calculate the circumference of the circle.

Implement the classes and interface with appropriate method implementations.

*/

interface ShapeRectangle {

	void makeshapeRectangle();
	void calculateArearectangle(float length, float width);
	void calculatePerimeter(float length, float width);
}

interface ShapeCircle {
	
	void makeshapecircle();
	void calculatPerimetercircle(float radius);
	void calculateArea(float radius);
}

class Rectangle implements ShapeRectangle {

	public void makeshapeRectangle() {
		System.out.println("The Shape is Rectangle");
	}

	@Override
	public void calculateArearectangle(float length, float width) {
		double area = length * width;
		System.out.println("Area of Rectangle: " + area);
	}

	@Override
	public void calculatePerimeter(float length, float width) {
		double perimeter = 2 * (length + width);
		System.out.println("Perimeter of Rectangle: " + perimeter);
	}
}

class Circle implements ShapeCircle {

	public void makeshapecircle() {
		System.out.println("The shape is circle");
	}

	@Override
	public void calculateArea(float radius) {
		final float pi = 3.14f;
		float area = pi * radius * radius;
		System.out.println("Area of Circle: " + area);
	}

	@Override
	public void calculatPerimetercircle(float radius) {
		final float pi = 3.14f;
		float Perimete = 2 * pi * radius;
		System.out.println("Perimeter  of Circle: " + Perimete);
	}

}

public class MainShape {
	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle();
		rectangle.makeshapeRectangle();
		rectangle.calculateArearectangle(10, 3);
		rectangle.calculatePerimeter(10, 3);
		Circle circle = new Circle();
		circle.makeshapecircle();
		circle.calculateArea(10);
		circle.calculatPerimetercircle(10);
	}

}
