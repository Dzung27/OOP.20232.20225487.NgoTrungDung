package JavaBasics;
 import java.util.Scanner;
   public class InputFromKeyboard {
     public static void main(String args[]) {
	Scanner keyboard = new Scanner(System.in);
	System.out.println("What's your name ?");
	String Name = keyboard.nextLine();
	System.out.println("How old are you? ");
	int age = keyboard.nextInt();
	System.out.print(Name+" ,"+age+" years old");
	}
}
