package Exceptionhandling;

public class Throwex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int age=10;
if(age>18)
{
	System.out.println("Eligible for driving");
}
else
{  
	throw new ArithmeticException("Not Eligibe");
}
	}

}
