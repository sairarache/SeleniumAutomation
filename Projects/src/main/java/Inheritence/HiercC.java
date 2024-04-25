package Inheritence;

public class HiercC extends HiercB
{
 public void display()
 {
	 System.out.println("Maths values");
 }
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		HiercC k=new HiercC();
		k.add();
		k.display();
		k.mult(6,4);

	}

}
