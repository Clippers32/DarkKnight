import java.util.Scanner;
import java.text.*;
public class red_packet {
  public static void main(String args[]){
	    Scanner input = new Scanner(System.in);
	    System.out.print("�������ܽ��(��λ Ԫ): ");
	    double total_money = input.nextDouble();    
	    System.out.print("����������(��λ �� �� <=500): ");    //���ǵ�һ��΢��Ⱥ���ֻ��500�ˣ�����һ��500��С�������Դ��ÿ�������ռ������
	    int packet_num = input.nextInt();
	    double [] moneyrate = new double[500];
	    double moneyleft = total_money - 0.01*packet_num;  //Ϊ��֤ÿ�����������1��Ǯ����Ϊÿ�����ȡ��һ��Ǯ��Ϊ����
	    double money;
	    for(int i = 0;i < packet_num ; i++)
	    	 moneyrate[i] = Math.random();     //Ϊÿ���������һ�������
	    double total=0;
	    for(int j=0; j< packet_num ; j++)
	    	total += moneyrate[j];            //�����������֮��
	    for(int i = 0; i < packet_num ; i++)
	    	 moneyrate[i] = moneyrate[i] / total; //����ÿ�������ռ�ܽ��ı���
	    for(int i = 0; i < packet_num ; i++){
	    	NumberFormat numberFormat = new DecimalFormat("#0.##");
	        money =(moneyleft*moneyrate[i])+0.01;  //����ÿ������Ľ���Լ��0.01�����
	        System.out.println("��"+(i+1)+"������Ľ��Ϊ : " + numberFormat.format(money));
	    }	
	    input.close();
      
  }
  
 	 
   }
