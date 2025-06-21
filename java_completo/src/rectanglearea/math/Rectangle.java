package rectanglearea.math;

public class Rectangle {

	public double a;
	public double b;
	
	
	public double area() {
	
		return a * b;

	}
	
	public double perimeter() { 
		
		return 2 * (a + b);
		
	}

	public double diagonal() {
		
		return Math.sqrt(b * b + a * a);
		
	}
	

}

