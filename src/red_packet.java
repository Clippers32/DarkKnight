import java.util.Scanner;
import java.text.*;
public class red_packet {
  public static void main(String args[]){
	    Scanner input = new Scanner(System.in);
	    System.out.print("请输入总金额(单位 元): ");
	    double total_money = input.nextDouble();    
	    System.out.print("输入红包总数(单位 个 且 <=500): ");    //考虑到一个微信群最多只有500人，分配一个500大小的数组以存放每个红包所占金额比例
	    int packet_num = input.nextInt();
	    double [] moneyrate = new double[500];
	    double moneyleft = total_money - 0.01*packet_num;  //为保证每个红包至少有1分钱，先为每个红包取出一分钱作为基础
	    double money;
	    for(int i = 0;i < packet_num ; i++)
	    	 moneyrate[i] = Math.random();     //为每个红包计算一个随机数
	    double total=0;
	    for(int j=0; j< packet_num ; j++)
	    	total += moneyrate[j];            //计算红包随机数之和
	    for(int i = 0; i < packet_num ; i++)
	    	 moneyrate[i] = moneyrate[i] / total; //计算每个红包所占总金额的比例
	    for(int i = 0; i < packet_num ; i++){
	    	NumberFormat numberFormat = new DecimalFormat("#0.##");
	        money =(moneyleft*moneyrate[i])+0.01;  //计算每个红包的金额，大约有0.01的误差
	        System.out.println("第"+(i+1)+"个红包的金额为 : " + numberFormat.format(money));
	    }	
	    input.close();
      
  }
  
 	 
   }
