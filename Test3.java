public class Test3
{
   public static void main(String[] args) 
   {
      // 두 수 입력받기
      int first= Integer.parseInt(args[0]);
      int second= Integer.parseInt(args[1]);

      //짝수, 홀수, 3의 배수 판단하기
      if (first%2==0)
      { 
         if(first%3==0){
            System.out.println("입력하신 1번째 인자값"+first+"은 짝수 이며3의 배수입니다.");
         }else{
            System.out.println("입력하신 1번째 인자값"+first+"은 짝수 이며3의 배수가 아닙니다.");
         }
      }else{
         if(first%3==0){
            System.out.println("입력하신 2번째 인자값"+first+"은 홀수 이며3의 배수입니다.");
         }else{
            System.out.println("입력하신 2번째 인자값"+first+"은 홀수 이며3의 배수가 아닙니다.");
         }
      
      }

      if (second%2==0)
      { 
         if(second%3==0){
            System.out.println("입력하신 1번째 인자값"+second+"은 짝수 이며3의 배수입니다.");
         }else{
            System.out.println("입력하신 1번째 인자값"+second+"은 짝수 이며3의 배수가 아닙니다.");
         }
      }else{
         if(second%3==0){
            System.out.println("입력하신 2번째 인자값"+second+"은 홀수 이며3의 배수입니다.");
         }else{
            System.out.println("입력하신 2번째 인자값"+second+"은 홀수 이며3의 배수가 아닙니다.");
         }
      
      }

   }
}