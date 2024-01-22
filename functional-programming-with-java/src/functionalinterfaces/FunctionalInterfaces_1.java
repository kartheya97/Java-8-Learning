package functionalinterfaces;

import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionalInterfaces_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		    
			List<Integer> numbers = List.of(1,2,3,4,5);
			Predicate<Integer> isEvenPredicate = num -> num%2 == 0;
			Function<Integer, Integer> SquareFunction = number -> (int) Math.pow(number, 2);
			Consumer<Integer> sysoutConsumer = System.out :: println;
			numbers.stream().filter(isEvenPredicate)
				.map(SquareFunction)
				.forEach(sysoutConsumer);
			BinaryOperator<Integer> sumBinaryOperator = Integer::sum;
			numbers.stream().reduce(0,sumBinaryOperator);
		
	}

}
