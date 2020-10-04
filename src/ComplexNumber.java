public class ComplexNumber{
         
	 private double real;
	 private double imaginary;
	 
	 public ComplexNumber(double real, double imaginary){
	     
	     this.real = real;
	     this.imaginary = imaginary;
	 }
	 
	 public double getReal() {
		 return this.real;
	 }
	 
	 public double getImaginary() {
		 return this.imaginary;
	 }
	 
	 public void add(ComplexNumber c) {
		 this.real += c.real;
		 this.imaginary += c.imaginary;
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
	 
	 public void resetToZero() {
		 this.real = 0;
		 this.imaginary = 0;
	 }
	 
	 
	 @Override
	public String toString() {
		 
		 if(this.imaginary < 0)
			 return this.real + " - " + -this.imaginary + "i";
		return this.real + " + " + this.imaginary + "i";
	}
}