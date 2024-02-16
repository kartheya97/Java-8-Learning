import java.util.Scanner;

public class PrintFirstNFibonacciNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1     = 0;
		int num2     = 1;
		int fib      = 0;
		
		Scanner sc   = new Scanner(System.in);
		System.out.println("Enter value of N");
		int n        = sc.nextInt();
		System.out.print(num1+" "+num2+" ");
		for(int i = 0;i<n;i++) {
			fib      = num1 + num2;
			System.out.print(fib+" ");
			num1     = num2;
			num2     = fib;
		}
		
	}

}
