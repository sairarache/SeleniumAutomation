package Encapsulation;
import java.util.Scanner;


public class Bank 
{   
	private String name;	
	private int pinnumber;
    Scanner a=new Scanner(System.in);
	

public void setter()
{   System.out.println("Enter user name");
    name=a.nextLine();
    System.out.println("Enter pinnumber");
	pinnumber=a.nextInt();

}
public void pinn()
{
	if(pinnumber==1001)
	{
		System.out.println("Pin is valid");
		System.out.println("User details:" + pinnumber);

	}
	else if(pinnumber ==1234)
	{
		System.out.println("Pin is valid");
		System.out.println("User details:" + pinnumber);

	}
	else if(pinnumber==1212)
	{
		System.out.println("Pin is valid");
		System.out.println("User details:" + pinnumber);

	}
	else
	{
		System.out.println("Sorry pin is invalid");
	}
}
public void getter()

{  	System.out.println("User name:"+ name );
	
}
}

