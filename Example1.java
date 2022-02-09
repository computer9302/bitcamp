public class Example1
{
   public static void main(String[] args) 
   {
      //숫자 입력받기
      int  grade = Integer.parseInt(args[0]);

      //점수 판단해서 알맞은 기력하기
      if(0<=grade && grade <=100){
      if(90<=grade){
            System.out.println("입력하신 값 "+grade+"점은 수입니다.");
      }else if(80<=grade){
            System.out.println("입력하신 값 "+grade+"점은 우입니다.");
      }else if(70<=grade){
            System.out.println("입력하신 값 "+grade+"점은 미입니다.");
      }else if(60<=grade){
            System.out.println("입력하신 값 "+grade+"점은 양입니다.");
      }else{
            System.out.println("입력하신 값 "+grade+"점은 가입니다.");
      }
      }
   }
}