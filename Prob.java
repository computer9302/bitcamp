package bitcamp;
import java.util.Scanner;
public class Prob 
{
	public static void main(String[] args) 
	{
		
		//정수 입력받기
		Scanner keyboard = new Scanner(System.in);
		System.out.print("1보다 크고 10보다 작은 정수를 입력하세요. : ");
		int number = keyboard.nextInt();
		
		if(number<2 || number>9){
			System.out.println("잘못된 숫자가 입력되었습니다.");
		}else{
			for(int i=1; i<10; i++){
				System.out.println(number+"*"+i+"="+(number*i));		
			}
		}
	}
}
