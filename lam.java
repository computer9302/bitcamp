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

		iam.setName("홍길동");
		iam.setAge(100);
		iam.setJob("개발자");

		System.out.println("이름 : "+iam.getName());
		System.out.println("나이 : "+iam.getAge());
		System.out.println("직업 : "+iam.getJob());
	}//end of main
}//end of class
