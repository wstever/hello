package Other;
//编写一个Java程序，用if-else语句判断某年份是否为闰年。
// Programme Name LeapYear.java
public class leapYearDemo{
	public static void main(String args[]){
		int year=2010; 
		if(args.length!=0)
			year=Integer.parseInt(args[0]);
		if((year%4==0 && year%100!=0)||(year%400==0))
			System.out.println(year+" 年是闰年。");
		else
			System.out.println(year+" 年不是闰年。");
	 }
 }
