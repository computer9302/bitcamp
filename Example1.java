public class Example1
{
   public static void main(String[] args) 
   {
      //���� �Է¹ޱ�
      int  grade = Integer.parseInt(args[0]);

      //���� �Ǵ��ؼ� �˸��� ����ϱ�
      if(0<=grade && grade <=100){
      if(90<=grade){
            System.out.println("�Է��Ͻ� �� "+grade+"���� ���Դϴ�.");
      }else if(80<=grade){
            System.out.println("�Է��Ͻ� �� "+grade+"���� ���Դϴ�.");
      }else if(70<=grade){
            System.out.println("�Է��Ͻ� �� "+grade+"���� ���Դϴ�.");
      }else if(60<=grade){
            System.out.println("�Է��Ͻ� �� "+grade+"���� ���Դϴ�.");
      }else{
            System.out.println("�Է��Ͻ� �� "+grade+"���� ���Դϴ�.");
      }
      }
   }
}