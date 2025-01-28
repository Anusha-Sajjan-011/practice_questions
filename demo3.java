import java.util.Scanner;
class A
{
	int id, salary, age;
	String name, designation;
	A()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter ID:");
		id = sc.nextInt(); 
		System.out.print("Enter Name:");
		name = sc.next(); 
		System.out.print("Enter age:");
		age = sc.nextInt(); 
		System.out.print("Enter salary:");
		salary = sc.nextInt(); 
		System.out.print("Enter designation:");
		designation = sc.next(); 
	}
	void display()
	{
		System.out.println("=============");
		System.out.println("My ID is:"+ id);
		System.out.println("My name is:"+ name);
		System.out.println("My age is:"+age);
		System.out.println("My salary is:" + salary);
		System.out.println("My designation:" + designation);
	}
}

class Demo3
{
	public static void main(String[] args)
	{
		A a = new A();
		a.display();
		a.display();
	}
}

