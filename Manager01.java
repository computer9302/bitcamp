//package jb04.part05;

public class Manager01 extends Employee01  
{
	int salary;

	public Manager01(){
		System.out.println("Manager�� default Constructor");
	}
	public Manager01(String name){
		super(name);
		System.out.println("Manager�� name�� �޴� Constructor");
	}
	public Manager01(String name, String part){
		this(name);
		this.part = part;
		System.out.println("Manager�� name, part�� �޴� Constructor");
	}
	public Manager01(String name, String part, int age){
		super(name, part, age);
		this.age = age;
		System.out.println("Manager�� name, part, age�� �޴� Constructor");
		}
	public Manager01(String name, String part, int age, int salary){
		this(name, part, age);
		this.salary = salary;
		System.out.println("Manager�� name, part, age, salary�� �޴� Constructor");
	}

	public int salary(){
		System.out.println("Manager�� salay method");
		baseSalary = 200;
		return baseSalary;
	}

	public void callSalary(){
		System.out.println("Employee�� �⺻���� : "+super.salary());
		System.out.println("Manager�� �⺻����1 : "+this.salary());
		System.out.println("Manager�� �⺻����2 : "+salary());
	}


	public static void main(String[] args) 
	{
		//Manager m1 = new Manager("ȫ�浿");

		
		//Manager m2 = new Manager("ȫ�浿", "EJB");

		Manager m3 = new Manager("ȫ�浿", "EJB", 25);

		//Manager m4 = new Manager("ȫ�浿", "EJB", 25, 300);

		System.out.print("\n");

		System.out.println("overridng�� salary ȣ��"+m3.salary());
		m3.callSalary();
		
	}//end of main
}//end of class