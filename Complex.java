
public class Complex {
  double real;
  double imaginary;
  
  
	public Complex(double real, double imaginary) {
	super();
	this.real = real;
	this.imaginary = imaginary;
}

  public Complex add(Complex num)
  {
	  double real=this.real+num.real;
	  double imaginary=this.imaginary+num.imaginary;
	  return new Complex(real,imaginary);
  }
  
  public Complex sub(Complex num)
  {
	  double real=this.real-num.real;
	  double imaginary=this.imaginary-num.imaginary;
	  return new Complex(real,imaginary);
  }
  public void display() {
	  System.out.println(real+"+"+imaginary+"i");
  }
	public static void main(String[] args) {
		Complex obj=new Complex(10, 20);
		Complex obj1=new Complex(20, 30);
		Complex result=obj.add(obj1);
		result.display();

	}

}
