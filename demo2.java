import java.util.Scanner;
class Demo2
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter ID:");
		int id = sc.nextInt(); 

		System.out.print("Enter Name:");
		String name = sc.next(); 

		System.out.print("Enter age:");
		int age = sc.nextInt(); 

		System.out.print("Enter salary:");
		int salary = sc.nextInt(); 

		System.out.print("Enter designation:");
		String designation = sc.next(); 

		System.out.println("=============");

		System.out.println("My ID is:"+ id);
		System.out.println("My name is:"+ name);
		System.out.println("My age is:"+age);
		System.out.println("My salary is:" + salary);
		System.out.println("My designation:" + designation);

		}
}

