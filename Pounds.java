import java.util.Scanner;

public class Pounds{

	public static void main(String [] args) {
	Scanner input= new Scanner(System.in);

	System.out.println("Enter the first integer: ");
	int number1 = input.nextInt();

	System.out.println("Enter the second integer: ");
	int number2 = input.nextInt();

	int sum = number1 * number2;

	System.out.printf("sum is %d%n", sum);

   }



}