
public class Cylinder extends Shape {
	
	private double radius;
	private double height;
	
	public Cylinder(double radius, double height) {
		this.radius = radius;
		this.height = height;
	}
	
	@Override
	public double surface_area() {
		return ((2 * Math.PI * radius * height) + (2 * Math.PI * Math.pow(radius, 2)));
	}
	
	@Override
	public double volume() {
		return (Math.PI * Math.pow(radius, 2) * height);
	}
	public void toStr1ng() {
		String surfarea = Double.toString(surface_area());
		String volofcylinder = Double.toString(volume());
		System.out.println("Sphere Surface Area: " + surfarea);
		System.out.println("Sphere Volume: " + volofcylinder);
	}
	

}
