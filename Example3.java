public class Example3
{
   public static void main(String[] args) 
   {
      // �� �� �Է¹ޱ�
      int first = Integer.parseInt(args[0]);
      int second = Integer.parseInt(args[1]);
      int temp=0;
      // �μ� ������ �� ���ϱ�
      if(first<second){
         for(int i = first; i<=second; i++){
            temp +=i;
         }
         System.out.println(first+" ~ "+second+"�� ���� "+temp+"�Դϴ�.");
      }else if(first==second){
         System.out.println("�Է°��� �����ϴ�.");
      }else{
         for(int  i = second; i<=first; i++){
            temp +=i;
         }
         System.out.println(second+" ~ "+first+"�� ���� "+temp+"�Դϴ�.");
      }
   }
}