import java.util.ArrayList;

public class ShapeArray {
	
	public static void main(String[] args) {
	
	ArrayList<Shape> shapeArray = new ArrayList<Shape>();
	
	Sphere sphere1 = new Sphere(5.0);
	Cylinder cylinder1 = new Cylinder(5.0, 10.0);
	Cone cone1 = new Cone(5.0, 10.0);
	
	shapeArray.add(sphere1);
	shapeArray.add(cylinder1);
	shapeArray.add(cone1);
	
	
	for (Shape shape : shapeArray) {
		System.out.println("Shape is: " + shape.getClass() + " and Surface Area is: " + shape.surface_area() + " and Volume is: " + shape.volume());
	}
	
	}
}
