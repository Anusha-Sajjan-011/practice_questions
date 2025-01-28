import java.util.Scanner;

class Manager {
    int id, age;
    int salary = 900000;
    String name;
    String designation = "Manager";

    Manager() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter ID:");
        id = sc.nextInt();
        System.out.print("Enter Name:");
        name = sc.next();
        System.out.print("Enter age:");
        age = sc.nextInt();
    }

    void display() {
        System.out.println("=============");
        System.out.println("My ID is:" + id);
        System.out.println("My name is:" + name);
        System.out.println("My age is:" + age);
        System.out.println("My salary is:" + salary);
        System.out.println("My designation:" + designation);
    }
}

class Tester {
    int id, age;
    int salary = 200000;
    String name;
    String designation = "Tester";

    Tester() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter ID:");
        id = sc.nextInt();
        System.out.print("Enter Name:");
        name = sc.next();
        System.out.print("Enter age:");
        age = sc.nextInt();
    }

    void display() {
        System.out.println("=============");
        System.out.println("My ID is:" + id);
        System.out.println("My name is:" + name);
        System.out.println("My age is:" + age);
        System.out.println("My salary is:" + salary);
        System.out.println("My designation:" + designation);
    }
}

class Developer {
    int id, age;
    int salary = 908008;
    String name;
    String designation = "Developer";

    Developer() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter ID:");
        id = sc.nextInt();
        System.out.print("Enter Name:");
        name = sc.next();
        System.out.print("Enter age:");
        age = sc.nextInt();
    }

    void display() {
        System.out.println("=============");
        System.out.println("My ID is:" + id);
        System.out.println("My name is:" + name);
        System.out.println("My age is:" + age);
        System.out.println("My salary is:" + salary);
        System.out.println("My designation:" + designation);
    }
    void raiseSalary()
    {
   	salary= salary+40000;
    }
}

class Clerk {
    int id, age;
    int salary = 909922;
    String name;
    String designation = "Clerk";

    Clerk() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter ID:");
        id = sc.nextInt();
        System.out.print("Enter Name:");
        name = sc.next();
        System.out.print("Enter age:");
        age = sc.nextInt();
    }

    void display() {
        System.out.println("=============");
        System.out.println("My ID is:" + id);
        System.out.println("My name is:" + name);
        System.out.println("My age is:" + age);
        System.out.println("My salary is:" + salary);
        System.out.println("My designation:" + designation);
    }
}

class Demo5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ch1, ch2 = 0;
        Manager m = null;
        Developer d = null;
        Tester t = null;
        Clerk c = null;

        do {
            System.out.println("1) Create");
            System.out.println("2) Display");
	    System.out.println("3) Raise salary ");
            System.out.println("4) Exit");
            ch1 = sc.nextInt();

            if (ch1 == 1) {
                do {
                    System.out.println("1) Manager");
                    System.out.println("2) Developer");
                    System.out.println("3) Tester");
                    System.out.println("4) Clerk");
                    System.out.println("5) Exit");
                    ch2 = sc.nextInt();

                    if (ch2 == 1) {
                        m = new Manager();
                    }
                    if (ch2 == 2) {
                        d = new Developer();
                    }
                    if (ch2 == 3) {
                        t = new Tester();
                    }
                    if (ch2 == 4) {
                        c = new Clerk();
                    }
                } while (ch2 != 5);
            }

            if (ch1 == 2) {
                do {
                    System.out.println("1) Manager");
                    System.out.println("2) Developer");
                    System.out.println("3) Tester");
                    System.out.println("4) Clerk");
                    System.out.println("5) Exit");
                    ch2 = sc.nextInt();

                    if (ch2 == 1 && m != null) {
                        m.display();
                    } else if (ch2 == 2 && d != null) {
                        d.display();
                    } else if (ch2 == 3 && t != null) {
                        t.display();
                    } else if (ch2 == 4 && c != null) {
                        c.display();
                    } else if (ch2 != 5) {
                        System.out.println("No record found!");
                    }
                } while (ch2 != 5);
            }

            if (ch1 == 3) {
                System.out.println("Thank you..!");
                System.exit(0);
            }
        } while (true);
    }
}
