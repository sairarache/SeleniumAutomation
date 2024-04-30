package Exceptionhandling;

public class Excepex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
		String a=null;
		System.out.println(a.length());
		}
		catch(NullPointerException s)
		{
			System.out.println("Sorry error occured");
		}
		finally
		{
			System.out.println("issue is fixed");
		}

	}

}
