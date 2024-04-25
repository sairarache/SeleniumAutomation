package methodoverridding;

public class RuntimeexC extends Runtimep
{ 
public void display()
{  
	super.display();
    System.out.println("Overriding child");

}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		RuntimeexC b=new RuntimeexC();
		b.display();;
		

	}

}
