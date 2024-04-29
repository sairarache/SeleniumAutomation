package Interface;

public class Hdfc implements RBI
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Hdfc ob=new Hdfc();
		ob.recdepo(5);

	}

	@Override
	public void recdepo(float duration) 
	{
		// TODO Auto-generated method stub
		double amount;
		int p=5000;
		float r=0.05f;
		 amount=p*r*duration;
		System.out.println("Interest is :"+ amount);
		
	}

}
