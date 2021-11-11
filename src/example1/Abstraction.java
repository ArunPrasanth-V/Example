package example1;



//In a class any method is abstract then the class also should in abstract 
//because we can't create an object for an abstract class.




abstract class phone{
	public void call()
	{
		System.out.println("calling");
	}
	public void sing()
	{
		System.out.println("Singing");
	}
	public abstract void dance();
	
}


public class Abstraction extends phone
{
	public  void dance()
	{
		System.out.println("yeah!! it dancing as well");
	}// here i'm extending the abstract class and defining the 
	//abstract method
	//so we can create object of "phone" class by using "Abstraction" class
	
	
}
