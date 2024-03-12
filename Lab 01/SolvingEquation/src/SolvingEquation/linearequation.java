package SolvingEquation;
import java.util.Scanner;
public class linearequation {
 public static void main(String args[]) {
	 Scanner input = new Scanner(System.in);
	 System.out.print("Enter a: ");
     double a = input.nextInt();
     System.out.print("Enter b: ");
     double b = input.nextInt();
     if(a==0) {
    	 if(b==0) {
    		 System.out.print("infinite solution");
    	 }else {
    		 System.out.print("no solution");
    	 } 
     }else {
    	 double x = -b/a;
    	 System.out.print("The result is:"+x);
     }
 }
}
