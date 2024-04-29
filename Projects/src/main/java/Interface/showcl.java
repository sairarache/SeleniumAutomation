package Interface;

public class showcl implements show1In {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		showcl n=new showcl();
		n.show();
		n.show1();

	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println(" ShowI is an Interface class");
		
	}

	@Override
	public void show1() {
		// TODO Auto-generated method stub
		System.out.println("Show1In is an Interface class 2");
		
	}

}
