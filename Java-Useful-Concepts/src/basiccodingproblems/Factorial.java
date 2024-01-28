package basiccodingproblems;

import java.nio.channels.NonReadableChannelException;
import java.util.Scanner;

public class Factorial {

	public static int nonRecursiveFactorial(int number) {
		int result = 1;
		for(int i = 1;i<=number;i++)
			result = result * i;
		return result;
	}

	public static  int recursiveFactorial(int number) {
		if(number == 0)
			return 1;
		else
			return number * recursiveFactorial(number-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int number = sc.nextInt();
	    System.out.println(nonRecursiveFactorial(number));
		

	}

}
