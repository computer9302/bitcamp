public class Test2  
{
   public static void main(String[] args) 
   {
      // 인수 입력받기
      int first = Integer.parseInt(args[0]);
      int second = Integer.parseInt(args[1]);

      //인수 비교해서 조건에 맞는 값 출력하기
      if(first>second){
         System.out.println("첫번째인수:"+first+",두번째인수:"+second+","+first+"-"+second+"="+(first-second)+"입니다.");
      }else{
         System.out.println("첫번째인수:"+first+",두번째인수:"+second+","+second+"+"+first+"="+(first+second)+"입니다.");      
      }
   }
}