public class Example2  
{
   public static void main(String[] args) 
   {
      // �μ� �Է¹ޱ�
      int number = Integer.parseInt(args[0]);

      //�Է°��� 0�����̰ų� 10�̻��ΰ�� 1~9������ ���� �Է����Ұ��� ����ϴ� ����
      if(number <= 0 || number >= 10){
         System.out.println("1~9������ ���� �Է��ϼ���.");
      }

      System.out.println(number+" ���� ����մϴ�");
      for(int i=1; i<=9;i++){
         System.out.println(i+"*"+number+"="+(i*number));
      }
   }
}