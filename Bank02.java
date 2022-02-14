package bitcamp;

public class Bank02 {

	int balance;
	String bankName;
	String userName;
	int money;
	int command;
	
	public Bank02(){
		
	}
	
	public Bank02(String s1, String s2) {
		bankName = s1;
		userName = s2;
	}
	
	public Bank02(String s1, String s2, String s3, String s4) {
		bankName = s1;
		userName = s2;
		command = Integer.parseInt(s3);
		money = Integer.parseInt(s4);
	}
	
	///method
	public void deposit() {
		balance += money;
		System.out.println(money+"원 입금함.");
		System.out.println("현재 "+balance+"원 있습니다.");
	}
	
	public void displayMoney() {
		System.out.println("현재금액은 "+balance+"원입니다.");
	}
	
	public void withdraw() {
		balance -= money;
		System.out.println(money+"원 출금함.");
		System.out.println("현재 "+balance+"원 있습니다.");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length<2) {
			System.out.println("[usage]:: java Bank [customerName][bankName][option][money]");
			System.out.println("[usage]:: 인자값이 최소 2개가 필요합니다.");
			System.exit(0);
		}
		
		System.out.println(args[0]+"님은 주거래은행은 "+args[1]+" 입니다.");
		Bank02 b = new Bank02();
		
		switch(args.length) {
		case 2:
			b = new Bank02(args[0],args[1]);
			b.displayMoney();
			break;
			
		case 4:
			b = new Bank02(args[0],args[1], args[2], args[3]);
			if(b.command==1) {
				b.deposit();
			} else if(b.command==2) {
				b.withdraw();
			}
			break;
			
		default:
			System.out.println("혹시 인자값이 너무 많은게, 적은것은 아닌지 하여간에...");
			break;
			}
		
		
	}//end of main

}//end of class
