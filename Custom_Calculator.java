package Demo;
class InvalidInputException extends Exception{
	public String toString() {
		return "Invalid input"; 
	}
}
class CannotDivideByZero extends Exception{
	public String toString() {
		return "You cannot divide by Zero"; 
	}
}
class MaxInputException extends Exception{
	public String toString() {
		return "Maximum input this cannot be done"; 
	}
}
class MaxMultiplicationReached extends Exception{
	public String toString() {
		return "MaxMultiplication Limit reached"; 
	}
}
class Calculator{
	public double add(double a,double b) throws MaxInputException {
		if(a==10000 ||b==10000) {
			throw new MaxInputException();
		}
		return a+b;
	}
	public double sub(double a,double b) throws MaxInputException {
		if(a==10000 ||b==10000) {
			throw new MaxInputException();
		}
		return a-b;
	}
	public double mul(double a,double b) throws MaxMultiplicationReached,MaxInputException {
		if(a==7000 || b==7000) {
			throw new MaxMultiplicationReached();
		}
		if(a==10000 ||b==10000) {
				throw new MaxInputException();
			}
		return a*b;
	}
	public double div(double a,double b) throws CannotDivideByZero,MaxInputException {
		if(b==0) {
			throw new CannotDivideByZero();
		}
		if(a==10000 ||b==10000) {
			throw new MaxInputException();
		}
		return a/b;
	}
}
public class Custom_Calculator {
public static void main(String[] args) throws MaxInputException ,CannotDivideByZero,MaxMultiplicationReached,InvalidInputException{
	Calculator c=new Calculator();
	System.out.println(c.div(20, 10));
}
}
