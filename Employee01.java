//package jb04.part05;

public class Employee01

{
	String part;
	String name;
	int age;
	int baseSalary;

	public Employee01(){
		System.out.println("Emp�� default Constructor");
	}
	public Employee01(String name){
		this.name = name;
		System.out.println("Emp�� name�� �޴� Constructor");
	}
	public Employee01(String name, String part){
		this(name);
		this.part=part;
		System.out.println("Emp�� name, part�� �޴� Constructor");
	}
	public Employee01(String name, String part, int i){
		this(name, part);
		this.age = age;
		System.out.println("Emp�� name,part,age�� �޴� Constructor");
	}

	public int salary(){

		System.out.println("Emp�� salary() method");
		baseSalary = 100;
		return baseSalary;
	}
}//end of class
