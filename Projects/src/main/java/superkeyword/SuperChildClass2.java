package superkeyword;

public class SuperChildClass2 extends Super2{
	
	public void display()
	{   super.display();
		System.out.println("Super class child");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   SuperChildClass2 k=new SuperChildClass2();
    k.display();
	}

}
