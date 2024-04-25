package superkeyword;

public class Superchild extends Super1
{
	String a="Hai";
	public void display()
	{   
		System.out.println(a);
		System.out.println(super.a);
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Superchild n= new Superchild();
    n.display();
	}

}
