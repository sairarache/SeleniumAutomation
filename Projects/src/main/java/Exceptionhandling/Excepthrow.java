package Exceptionhandling;

public class Excepthrow  {

	public static void main(String[] args) throws AgeException {
		// TODO Auto-generated method stub
int age=5;
if(age>=18)
{
	System.out.println("Eligible for driving");
}
else 
{
	throw new AgeException("Not Eligibe");

}
	}

}
