public class Example2  
{
   public static void main(String[] args) 
   {
      // 인수 입력받기
      int number = Integer.parseInt(args[0]);

      //입력값이 0이하이거나 10이상인경우 1~9까지의 값을 입력할할것을 출력하는 구문
      if(number <= 0 || number >= 10){
         System.out.println("1~9까지의 값을 입력하세요.");
      }

      System.out.println(number+" 단을 출력합니다");
      for(int i=1; i<=9;i++){
         System.out.println(i+"*"+number+"="+(i*number));
      }
   }
}