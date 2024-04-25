package Inheritence;

public class HiercB extends Hierp 
{
public void add()
{
	int l=25;
	int m=35;
	int d=l+m;
	System.out.println("Sumof two numbers:" + d);
}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
    HiercB h=new HiercB();
    h.add();
   h.mult(4,4);
	}
	
	}


