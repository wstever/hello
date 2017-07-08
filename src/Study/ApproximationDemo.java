package Study;

import java.util.Scanner;

public class ApproximationDemo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double d = scanner.nextDouble();
		System.out.println(getReturn(d));
	}

	public static int getReturn(double d) {
		int i = (int) d;
		return (d - i) >= 0.5 ? i + 1 : i;
	}
	
	
	
		
  /*  public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double num;
        int n = 0;
        while(sc.hasNext()){
            num = sc.nextDouble();
            num+= 0.5;
            n = (int)num;
            System.out.println(n);
        }
 
    }*/
}


