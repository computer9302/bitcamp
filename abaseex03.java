package bitcamp;

import java.util.Scanner;

public class abaseex03{
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		System.out.print("1보다 크고 10보다 작은 정수를 입력하세요.");
		int inputInt = keyboard.nextInt();
		
		int temp=1;
		if(inputInt<2 || inputInt>9) {
			System.out.println("잘못된 숫자가 입력되었습니다.");
			System.exit(0);
		}else {
			for(int i=1; i<=inputInt; i++) {
				for(int j=1; j<=i; j++) {
					temp=temp*j;		
				}
				System.out.println(i+"!"+ "="+temp);
				temp=1;
		}
		}
	}//end main
}//end class