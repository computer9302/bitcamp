package bitcamp;

public class Prob02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int limit=50;
		boolean prime = false;
		int count=0;
		
		//1~50까지 수 표현
		for(int i=2;i<=limit;i++) {
			//i를 j로 나누기
			for(int j=2; j<=i; j++) {
				//소수이니까 count가 한번만 되어야함.
				if(i%j==0) {
					count++;
				}
			}
			if(count==1) {
				System.out.println(i);
			}
			count=0;
		}
	}

}
