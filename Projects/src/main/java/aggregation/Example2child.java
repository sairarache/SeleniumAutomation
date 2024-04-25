package aggregation;

public class Example2child {
	int a;
	int b;
	Exampl1 g;
	int c;
	public Example2child(int a,int b,Exampl1 g)
	{
		this.a=a;
		this.b=b;
		this.g=g;
		this.c= a+b;
	}

	public void show()
	{
		System.out.println("Sum of two values:" + c +" "+  "factorial:"+ g.f);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Exampl1 m=new Exampl1(3);
     Example2child k=new Example2child(5,6,m);
     k.show();
	}

}
