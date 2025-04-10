package interfacejava;

public class Rectangle implements Shape {
	public void makeshape() {
		System.out.println("Shape is Rectangle");
	}

	public static void main(String[] args) {
		Rectangle shape = new Rectangle();
		shape.makeshape();
	}

}

interface Shape {
	void makeshape();

}
