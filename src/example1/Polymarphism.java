package example1;

public class Polymarphism {
	//overloading
   public void add()
   { System.out.println(1+1);}
   
   public int add(int a)
   { return a+a;}

   public void add(int a,int b)
   {System.out.println(a+b);}
   public int add(int a,int b,int c)
   {return a+b+c;}

}
class B extends Polymarphism
{
	//overriding
	public void add()
	//here we are overriding the parent class method
	   { System.out.println(1+5);}	
	public int add(int a,int b,int c)
	   {return a+b-c;}
}
