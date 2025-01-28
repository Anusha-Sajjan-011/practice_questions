import java.util.Scanner;
class Manager
{
	short id, age;
	float salary = 9000.0f;
	String name;
	String designation= "Manager";
	Manager()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter ID:");
		id = (short)sc.nextInt(); 
		System.out.print("Enter Name:");
		name = sc.next(); 
		System.out.print("Enter age:");
		age = (short)sc.nextInt(); 
		//System.out.print("Enter salary:");
		//salary = sc.nextInt(); 
		//System.out.print("Enter designation:");
		//designation = sc.next(); 
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

class Tester
{
	short id, age;
	float salary = 200.00f;
	String name;
	String designation= "tester";
	Tester()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter ID:");
		id = (short)sc.nextInt(); 
		System.out.print("Enter Name:");
		name = sc.next(); 
		System.out.print("Enter age:");
		age = (short)sc.nextInt(); 
		//System.out.print("Enter salary:");
		//salary = sc.nextInt(); 
		//System.out.print("Enter designation:");
		//designation = sc.next(); 
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


class Developer
{
	short id, age;
	float salary = 908.70f;
	String name;
	String designation= "developer";
	Developer()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter ID:");
		id = (short)sc.nextInt(); 
		System.out.print("Enter Name:");
		name = sc.next(); 
		System.out.print("Enter age:");
		age = (short)sc.nextInt(); 
		//System.out.print("Enter salary:");
		//salary = sc.nextInt(); 
		//System.out.print("Enter designation:");
		//designation = sc.next(); 
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

class Clerk
{
       	short id, age;
	float salary = 9099.0f;
	String name;
	String designation= "clerk";
	Clerk()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter ID:");
		id = (short)sc.nextInt(); 
		System.out.print("Enter Name:");
		name = sc.next(); 
		System.out.print("Enter age:");
		age = (short)sc.nextInt(); 
		//System.out.print("Enter salary:");
		//salary = sc.nextInt(); 
		//System.out.print("Enter designation:");
		//designation = sc.next(); 
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


class Demo4
{
	public static void main(String[] args)
	{
		Manager m = new Manager();
		m.display();
		Tester t = new Tester();
		t.display();
		Developer d = new Developer();
		d.display();
		Clerk c = new Clerk();
		c.display();
		
	}
}

