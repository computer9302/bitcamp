public class Test2  
{
   public static void main(String[] args) 
   {
      // �μ� �Է¹ޱ�
      int first = Integer.parseInt(args[0]);
      int second = Integer.parseInt(args[1]);

      //�μ� ���ؼ� ���ǿ� �´� �� ����ϱ�
      if(first>second){
         System.out.println("ù��°�μ�:"+first+",�ι�°�μ�:"+second+","+first+"-"+second+"="+(first-second)+"�Դϴ�.");
      }else{
         System.out.println("ù��°�μ�:"+first+",�ι�°�μ�:"+second+","+second+"+"+first+"="+(first+second)+"�Դϴ�.");      
      }
   }
}