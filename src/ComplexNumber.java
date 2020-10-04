public class ComplexNumber{
         
	 private double real;
	 private double imaginary;
	 
	 public ComplexNumber(double real, double imaginary){
	     
	     this.real = real;
	     this.imaginary = imaginary;
	 }
	 
	 public void add(double real, double imaginary){
		 
	     this.real += real;
	     this.imaginary += imaginary;
	 }
	 
	 public void square(){
	     
	     double a;
	     double b;
	     double c;
	     
	     a = this.real * this.real;
	     b = 2 * (this.real * this.imaginary);
	     c = this.imaginary * this.imaginary;
	     
	     this.real = a - c;
	     this.imaginary = b;
	 }
	 
	 
	 @Override
	public String toString() {
		return this.real + " + " + this.imaginary + "i";
	}
}