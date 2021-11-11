package example1;

public class Template {
	String student_name;
	int roll_no;
	int age;
	public Template(String student_name, int roll_no, int age) {
		this.student_name = student_name;
		this.roll_no = roll_no;
		this.age = age;
	}
	//It like a primitive variable 
	// our own data type is an object

}
class B
{
	Template object1=new Template("Arun",13,19);
	Template object2=new Template("Aananth",06,19);
	Template object3=new Template("Narayanan",58,19);
	
}
