//package jb04.part02;
public class lam extends Human
{
	String job;

	public lam(){
		System.out.println("iam class default Constructor");
		}

	public void setJob(String str){
		job = str;
	}
	public String getJob(){
		return job;
	}


	public static void main(String[] args) 
	{
		lam iam = new lam();

		iam.setName("ȫ�浿");
		iam.setAge(100);
		iam.setJob("������");

		System.out.println("�̸� : "+iam.getName());
		System.out.println("���� : "+iam.getAge());
		System.out.println("���� : "+iam.getJob());
	}//end of main
}//end of class