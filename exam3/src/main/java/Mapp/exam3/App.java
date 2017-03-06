package Mapp.exam3;

import java.util.Scanner;

/**
 * 输入某年某月某日，给出下一天的日期？
 * 当然输入日期不合法需要做出错误提示.
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	boolean isyear=false;
    	Integer year;
    	Integer mouth;
    	Integer day;
    	String y;
    	String m;
    	String d;
    	System.out.println("请输入一个日期：(格式为YYYY-MM-DD) 要用0 占位 ");
        Scanner sc= new Scanner(System.in);
        String s= sc.nextLine();
        y= s.substring(0, 4);
        m= s.substring(5, 7);
        d= s.substring(8);
        year  =Integer.parseInt(y);
        mouth =Integer.parseInt(m);
        day   =Integer.parseInt(d);
        
/*        System.out.println(year);
        System.out.println(mouth);
        System.out.println(day);*/
        
/*        System.out.println(y);
        System.out.println(m);
        System.out.println(d);*/
        //
        if (((year % 100 == 0) && (year % 400 == 0))
                || ((year % 100 != 0) && (year % 4 == 0))){
               	 if(mouth==2){
                    	if(day<29){
                    		day=day+1;
                    		System.out.println("下一天是："+year+"-"+mouth+"-"+day);
                    	}else if(day==29){
                    		mouth=mouth+1;
                    		day=1;
                    		System.out.println("下一天是："+year+"-"+mouth+"-"+day);
                    	}
                    }
               	 else if(mouth==4 && mouth==6 && mouth ==9 && mouth==11 ){
                 	if(day< 30){
                 		day=day+1;
                 		System.out.println("下一天是："+year+"-"+mouth+"-"+day);	
                 	}else if(day==30){
                 		mouth=mouth+1;
                 		day=1;
                 		System.out.println("下一天是："+year+"-"+mouth+"-"+day);	
                 	}
                 }
                 //1 3 5 7 8 10 
                 else if(mouth==1 && mouth==3 && mouth==5 && mouth==7 && mouth==8 && mouth == 10 ){
                 	if(day< 31){
                 		day=day+1;
                 		System.out.println("下一天是："+year+"-"+mouth+"-"+day);	
                 	}else if(day==31){
                 		mouth=mouth+1;
                 		day=1;
                 		System.out.println("下一天是："+year+"-"+mouth+"-"+day);	
                 	}
             	}
                 //12
                 else if(mouth==12 ){
                 	if(day< 31){
                 		day=day+1;
                 		System.out.println("下一天是："+year+"-"+mouth+"-"+day);	
                 	}else if(day==31){
                 		year=year+1;
                 		mouth=1;
                 		day=1;
                 		System.out.println("下一天是："+year+"-"+mouth+"-"+day);	
                 	}
             	}
                 //其他
                 else{
                 	System.out.println("您输入的日期不存在！~");
                 }
                 
               }else
        //2月
        if(mouth==2){
        	if(day<28){
        		day=day+1;
        		System.out.println("下一天是："+year+"-"+mouth+"-"+day);
        	}else if(day==28){
        		mouth=mouth+1;
        		day=1;
        		System.out.println("下一天是："+year+"-"+mouth+"-"+day);
        	}
        }
        /*if(mouth==2||day<28){
        	day=day+1;
        	System.out.println("下一天是："+year+"-"+mouth+"-"+day);
        }else if(mouth==2||day==28){
        	mouth=3;
        	day =1;
        	System.out.println("下一天是："+year+"-"+mouth+"-"+day);
        }*/
        // 4 6 9 11 月
        else if(mouth==4 && mouth==6 && mouth ==9 && mouth==11 ){
        	if(day< 30){
        		day=day+1;
        		System.out.println("下一天是："+year+"-"+mouth+"-"+day);	
        	}else if(day==30){
        		mouth=mouth+1;
        		day=1;
        		System.out.println("下一天是："+year+"-"+mouth+"-"+day);	
        	}
        }
        //1 3 5 7 8 10 
        else if(mouth==1 && mouth==3 && mouth==5 && mouth==7 && mouth==8 && mouth == 10 ){
        	if(day< 31){
        		day=day+1;
        		System.out.println("下一天是："+year+"-"+mouth+"-"+day);	
        	}else if(day==31){
        		mouth=mouth+1;
        		day=1;
        		System.out.println("下一天是："+year+"-"+mouth+"-"+day);	
        	}
    	}
        //12
        else if(mouth==12 ){
        	if(day< 31){
        		day=day+1;
        		System.out.println("下一天是："+year+"-"+mouth+"-"+day);	
        	}else if(day==31){
        		year=year+1;
        		mouth=1;
        		day=1;
        		System.out.println("下一天是："+year+"-"+mouth+"-"+day);	
        	}
    	}
        //其他
        else{
        	System.out.println("您输入的日期不存在！~");
        }
        
        
        System.out.println(y);
        System.out.println(m);
        System.out.println(d);
    }
}
