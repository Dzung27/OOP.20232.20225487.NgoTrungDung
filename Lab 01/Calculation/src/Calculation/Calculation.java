package Calculation;
 import java.util.Scanner;
 public class Calculation {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
        System.out.print("Enter an double: ");
        double num1 = input.nextInt();
        System.out.print("Enter an double: ");
        double num2 = input.nextInt();
        double sum = num1 + num2;
        double diff = num1 - num2;
        double product = num1*num2;
		System.out.println("Sum:"+sum);
		System.out.println("Diff"+diff);
		System.out.println("Product"+product);
		if (num2 == 0) {
			System.out.print("Can not divided by 0");
		}else {
		        double quotient = num1/num2;
		        System.out.println("Quotient"+quotient);
			}
				
		}
		
	}
