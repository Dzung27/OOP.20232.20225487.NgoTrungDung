package SolvingEquation;
import java.util.Scanner;
import java.lang.Math;
public class seconddegree {
	public static void main(String args[]) {
		 Scanner input = new Scanner(System.in);
		 System.out.print("Enter a,b,c: ");
	     double a = input.nextInt();
	     double b = input.nextInt();
	     double c = input.nextInt();
	     double k = b*b - 4*a*c;
	     if(k<0) {
	    	 System.out.print("no solution");
	     }else if(k== 0) {
	    	 double x = -b/(2*a);
	    	 System.out.print("the result is"+x);
	     }else {
	    	 double x1 = (-b + Math.sqrt(k))/(2*a);
	    	 double x2 = (-b - Math.sqrt(k))/(2*a);
	    	 System.out.print("the result is"+x1+"and"+x2);
	     }
	}
}
