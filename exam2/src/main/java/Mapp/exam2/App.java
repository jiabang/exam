package Mapp.exam2;

import java.util.Scanner;

/**
 * 编程实现工资个人所得税计算程序
 *
 */
public class App 
{
    public static void main( String[] args ){
    	
    	double pay =0;
    	double pay_money =0;
    	System.out.println( "请输入工资：");
    	Scanner sc=new Scanner(System.in);
    	double  money =sc.nextDouble();
    	//1500
    	if(money<=1500){
    		pay=money*0.03;
    		System.out.println( "所需要缴纳的税费为:"+pay);
    	}
    	//1500-4500
    	else if(money>1500 || money <=4500) {
    		pay_money=money-1500;
    		pay=pay_money*0.1;
    		System.out.println( "所需要缴纳的税费为:"+pay);
    	}
    	//4500-9000
    	else if (money >4500 || money <=9000){
    		pay_money=money-4500;
    		pay=pay_money*0.2;
    		System.out.println( "所需要缴纳的税费为:"+pay);
    	}
    	//9000-35000
    	else if (money>9000 || money <=35000){
    		pay_money=money-9000;
    		pay=pay_money*0.25;
    		System.out.println( "所需要缴纳的税费为:"+pay);
    	}
    	//35000-55000
    	else if (money>35000 || money <=55000){
    		pay_money=money-35000;
    		pay=pay_money*0.3;
    		System.out.println( "所需要缴纳的税费为:"+pay);
    	}
    	//55000-80000
    	else if (money>55000 || money <=80000){
    		pay_money=money-55000;
    		pay=pay_money*0.35;
    		System.out.println( "所需要缴纳的税费为:"+pay);
    	}
    	//>80000
    	else if (money>80000){
		pay_money=money-80000;
		pay=pay_money*0.45;
		System.out.println( "所需要缴纳的税费为:"+pay);
	}
    	
    	
    	
        
    }
}
