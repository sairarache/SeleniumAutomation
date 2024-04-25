package superkeyword;

public class SuperkeyA extends Assignment1
{   
	public void divide()
	{    
		super.add(15,15);
		if(c%10==0)
			{
			System.out.println("value is divisible by 10");
			}
		else
			{
			System.out.println("Not divisible");
			}
	}
	  public static void main(String[] args) {
		  SuperkeyA n=new SuperkeyA();
		  //int x=n.add();
		  n.divide();
		  n.display();
		  	}
		
}
	
