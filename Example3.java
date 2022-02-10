public class Example3
{
   public static void main(String[] args) 
   {
      // 두 수 입력받기
      int first = Integer.parseInt(args[0]);
      int second = Integer.parseInt(args[1]);
      int temp=0;
      // 두수 사이의 합 구하기
      if(first<second){
         for(int i = first; i<=second; i++){
            temp +=i;
         }
         System.out.println(first+" ~ "+second+"의 합은 "+temp+"입니다.");
      }else if(first==second){
         System.out.println("입력값이 같습니다.");
      }else{
         for(int  i = second; i<=first; i++){
            temp +=i;
         }
         System.out.println(second+" ~ "+first+"의 합은 "+temp+"입니다.");
      }
   }
}