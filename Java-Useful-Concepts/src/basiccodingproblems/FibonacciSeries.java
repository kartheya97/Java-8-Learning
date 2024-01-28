package basiccodingproblems;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int num1 = 0;
        int num2 = 1;
        int fibResult;
        int count = 10;
        System.out.println("First 10 Fibonacci series numbers are");
        System.out.print(num1 + " "+ num2+" ");
        for(int i = 2;i<count;i++) {
        	fibResult = num1 + num2;
        	System.out.print(fibResult+" ");
        	num1      = num2;
        	num2      = fibResult;
        }
        
	}

}
