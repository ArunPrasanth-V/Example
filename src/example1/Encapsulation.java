package example1;

public class Encapsulation {
    private int age;
	private String name;
	public void setter(int age) {
	  this.age =age;//this.age it belong to the global variable
	  }
	public int getter() {
		  return age;}
}
class b 
{
	public static void main(String args[])
	{
		Encapsulation object=new Encapsulation();
		object.setter(19);
		System.out.println(object.getter());
		//it is a correct way to access the class variable
	   
	}
}
