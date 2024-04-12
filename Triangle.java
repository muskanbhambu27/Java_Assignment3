
public class Triangle {
     double side1;
     double side2;
     double side3;
     
	public Triangle(double side1, double side2, double side3) {
		super();
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	public double calPerimeter()
	{
		//double perimeter=side1+side2+side3;
		return side1+side2+side3;
				
	}
	
	public double calArea()
	{
		double s=(side1+side2+side3)/2;
		double area=Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
		return area;
	}
	public void display()
	{
		System.out.println("Side1: "+side1+"\n");
		System.out.println("Side2: "+side2+"\n");
		System.out.println("Side3: "+side3+"\n");
		System.out.println("Perimeter: "+calPerimeter());
		System.out.println("Area: "+calArea());
		
	}

	public static void main(String[] args) {
		Triangle obj=new Triangle(4,5, 3);
		obj.display();

	}

}
