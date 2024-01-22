package functionalinterfaces;

import java.util.Random;
import java.util.function.BinaryOperator;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class SupplierInterfaceExample_4 {

	
	// Supplier is the situation where it does not take any input but returns something back.
	//  Supplier --> Take nothing give something.
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Supplier<Integer> randomIntegerSupplier = () -> {
			Random random = new Random();
			return random.nextInt(1000);
		};
		System.out.println(randomIntegerSupplier.get());
		
		// Unary Operator --> Takes an single-argument of same type and returns an output of that type.
		UnaryOperator<Integer> unaryOperator = (x) -> 3 * x;
		System.out.println(unaryOperator.apply(10));
		
		// Binary Operator --> Take two arguments of same type and returns a result of that type.
		BinaryOperator<Integer> binaryOperator = (x,y) -> x * y;
		System.out.println(binaryOperator.apply(10, 25));
		
		
	}
	
	

}
