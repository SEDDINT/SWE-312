class Rectangle {
	double length;
	double width;
	
	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}
	
	public double Area(double len, double wid) {
		double area = len * wid;
		return area;	
	}
}

public class Runner{

	public static void main(String[] args) {
		Rectangle rec = new Rectangle(10, 4);
		System.out.println("the area: " + rec.Area(rec.length, rec.width));
	}
}


