package Interface;

public class Interfaceclass implements Interfaceex{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Interfaceclass obj1=new Interfaceclass();
		obj1.add(80, 20);

	}

	@Override
	public void add(int a, int b) 
	{
		// TODO Auto-generated method stub
		int c=a+b;
		System.out.println("Sum:"+ c);
		
	}

}
