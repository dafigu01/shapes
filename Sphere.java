
public class Sphere extends Shape {
	private double radius;
	
	
	public Sphere(double radius) {
		this.radius = radius;
	}
	
	@Override
	public double surface_area() {
		return (4 * Math.PI * Math.pow(radius, 2));
	}
	
	@Override
	public double volume() {
		return ((1.33333) * Math.PI * Math.pow(radius,  3));
	}
	
	public void toStr1ng() {
		String surfarea = Double.toString(surface_area());
		String volofsphere = Double.toString(volume());
		System.out.println("Sphere Surface Area: " + surfarea);
		System.out.println("Sphere Volume: " + volofsphere);
	}
}
