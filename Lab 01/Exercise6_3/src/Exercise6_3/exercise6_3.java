package Exercise6_3;
import java.util.Scanner;
public class exercise6_3 {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		String string ="*";
		String string1=" ";
		int n = input.nextInt();
		int j=n-1;
		int i =0;
		for (i=0;i<n;i++)
			  System.out.println(string1.repeat(n-i-1)+string.repeat(2*i+1));
	}
}