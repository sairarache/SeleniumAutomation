package Inheritence;

public class MultilevelcC extends MultilevelcB
{
public void marks(int a)
{
	System.out.println("Marks obtained:"+ a);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultilevelcC g=new MultilevelcC();
		g.detail();
		g.address();
		g.marks(65);

	}

}
