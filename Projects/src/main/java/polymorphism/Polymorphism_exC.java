package polymorphism;

public class Polymorphism_exC extends Overriding_example
{
public void add()
{   super.add(10, 20);
	int a=12;
	int b=10;
	int c=5;
	int d=a+b+c;
	System.out.println("Sumof three values:" + d);
}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Polymorphism_exC h=new Polymorphism_exC();
		h.add();

	}

}
