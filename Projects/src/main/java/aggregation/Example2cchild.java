package aggregation;

public class Example2cchild {
	int s;
	int g;
	int c;
	Example2pa k;
	
	public Example2cchild(int s,int g,Example2pa k)
	{
		this.s=s;
		this.g=g;
		this.k=k;
		c=s*g;
	}
     public void calculation()
     {
    	 System.out.println("Muiltiplication value:"+ c);
    	 if(k.num%2==0)
    		{
    			System.out.println("Even number:"+ k.num);
    		}
    		else
    		{
    			System.out.println("odd number:"+k.num);
    		}
     }

	public static void main(String[] args) 
	{  
		Example2pa e=new Example2pa(8);
		Example2cchild h=new Example2cchild(6,2,e);
		h.calculation();
		
		// TODO Auto-generated method stub

	}

}
