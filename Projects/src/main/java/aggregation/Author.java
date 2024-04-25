package aggregation;

public class Author {

	String authorname;
	String place;
	Book h;
	public Author(String authorname,String place, Book h)
	{
		this.authorname=authorname;
		this.place=place;
		this.h=h;
	}
	public void show()
	{
		System.out.println("Authorname:" + authorname + " " + "place:" + " " +place);
		System.out.println(h.name +" " + h.age);
	}
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
    Book n=new Book("Saira",28);
    Author k=new Author("James","tvm",n);
    k.show();
    
	}

}
