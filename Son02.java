//package jb04.part07.outer;
public class Son02 extends jb04.part07.Father
{
	public Son02(){
		System.out.println(this.name);
		System.out.println(bank);
		System.out.println(branch);
		System.out.println(password);

		System.out.println(this.getBranch());
		System.out.println(getPassword(0));
	}
}
