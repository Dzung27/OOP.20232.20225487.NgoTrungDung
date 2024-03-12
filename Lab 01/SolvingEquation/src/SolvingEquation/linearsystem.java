package SolvingEquation;
import java.util.Scanner;
public class linearsystem {
	 public static void main(String args[]) {
		 Scanner input = new Scanner(System.in);
		 System.out.print("Enter a1,b1,c1: ");
	     double a1 = input.nextInt();
	     double b1 = input.nextInt();
	     double c1 = input.nextInt();
	     System.out.print("Enter a2,b2,c2: ");
	     double a2 = input.nextInt();
	     double b2 = input.nextInt();
	     double c2 = input.nextInt();
	     double D = a1*b2 - a2*b1;
	     double Dx= c1*b2 - c2*b1;
	     double Dy= a1*c2 - a2*c1;
	     if(D==0) {
	    	 if (Dx+Dy==0) {
	    		 System.out.print("infinite solution");
	    		   	 }else {
	    		   		 System.out.print("no solution");
	    		   	 }
	     }else {
	    	 double x = Dx/D;
	    	 double y = Dy/D;
	    		 System.out.print("the result is"+x+"and"+y);
	     }
	 }   
	 }
