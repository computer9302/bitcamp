public class Test3
{
   public static void main(String[] args) 
   {
      // �� �� �Է¹ޱ�
      int first= Integer.parseInt(args[0]);
      int second= Integer.parseInt(args[1]);

      //¦��, Ȧ��, 3�� ��� �Ǵ��ϱ�
      if (first%2==0)
      { 
         if(first%3==0){
            System.out.println("�Է��Ͻ� 1��° ���ڰ�"+first+"�� ¦�� �̸�3�� ����Դϴ�.");
         }else{
            System.out.println("�Է��Ͻ� 1��° ���ڰ�"+first+"�� ¦�� �̸�3�� ����� �ƴմϴ�.");
         }
      }else{
         if(first%3==0){
            System.out.println("�Է��Ͻ� 2��° ���ڰ�"+first+"�� Ȧ�� �̸�3�� ����Դϴ�.");
         }else{
            System.out.println("�Է��Ͻ� 2��° ���ڰ�"+first+"�� Ȧ�� �̸�3�� ����� �ƴմϴ�.");
         }
      
      }

      if (second%2==0)
      { 
         if(second%3==0){
            System.out.println("�Է��Ͻ� 1��° ���ڰ�"+second+"�� ¦�� �̸�3�� ����Դϴ�.");
         }else{
            System.out.println("�Է��Ͻ� 1��° ���ڰ�"+second+"�� ¦�� �̸�3�� ����� �ƴմϴ�.");
         }
      }else{
         if(second%3==0){
            System.out.println("�Է��Ͻ� 2��° ���ڰ�"+second+"�� Ȧ�� �̸�3�� ����Դϴ�.");
         }else{
            System.out.println("�Է��Ͻ� 2��° ���ڰ�"+second+"�� Ȧ�� �̸�3�� ����� �ƴմϴ�.");
         }
      
      }

   }
}