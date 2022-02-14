package bitcamp0214;

public class abaseex07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year = 400;
		int month = 2;
		int maxDay = 0;
		//손가락 튀어나온 달이 31일 들어간 달이 30일 새끼손가락은 두번 터치
		
		if(year%4==0) {
			//4의 배수이면서 100의 배수인 해는 윤년이 아님
			if(year%100==0) {
				switch(month) {
				case 1, 3, 5, 7, 8, 10, 12 :
					maxDay= 31;
					break;
				case 2 :
					maxDay = 28;
					break;
				case 4, 6, 9, 11 :
					maxDay = 30;
				
				}
			//100의 배수가 아닌 해는 윤년임	
			}else{
				switch(month) {
				case 1, 3, 5, 7, 8, 10, 12 :
					maxDay= 31;
					break;
				case 2 :
					maxDay = 29;
					break;
				case 4, 6, 9, 11 :
					maxDay = 30;
					break;
			}
		// 100의 배수이면서 400의 배수인 해는 윤년
			}
		}else if(year%100==0 && year%400==0) {
			switch(month) {
			case 1, 3, 5, 7, 8, 10, 12 :
				maxDay= 31;
				break;
			case 2 :
				maxDay = 29;
				break;
			case 4, 6, 9, 11 :
				maxDay = 30;
				break;
		}
		}else {
			switch(month) {
			case 1, 3, 5, 7, 8, 10, 12 :
				maxDay= 31;
				break;
			case 2 :
				maxDay = 28;
				break;
			case 4, 6, 9, 11 :
				maxDay = 30;
				break;
		}
		}
			System.out.println(year + "년 " + month+ "월의 말일은 " + maxDay + "일 입니다.");
	

	}// end of main
}//end of class
