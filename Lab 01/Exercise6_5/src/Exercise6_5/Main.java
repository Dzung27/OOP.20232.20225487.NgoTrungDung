package Exercise6_5;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
        int num, i, j, temp;
        Scanner input = new Scanner(System.in);
        System.out.println("Input amount of number: ");
        num = input.nextInt();
        int array[] = new int[num];
        System.out.println("Input number: ");
        int sum = 0;
        for (i = 0; i < num; i++)
            array[i] = input.nextInt();
        for (i = 0; i < (num - 1); i++) {
            for (j = 0; j < num - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        System.out.println("Result: ");
        for (i = 0; i < num; i++) {
            System.out.print(array[i] + "\t");
            sum += array[i];
            
        }
        System.out.println();
        System.out.println("Sum is "+sum);
        System.out.println("Average is "+(sum/num));
}
}