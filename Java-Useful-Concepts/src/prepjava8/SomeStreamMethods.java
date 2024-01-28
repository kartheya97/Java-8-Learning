package prepjava8;

import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class SomeStreamMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> list                   = List.of(3,2,1,4,7,6,9,8,5);
		Predicate<Integer>  evenPredicate    = number -> number % 2 == 0;
		List<Integer> evenList               = list.stream().filter(evenPredicate).collect(Collectors.toList());
		
		int evenCount                        = (int) list.stream().filter(evenPredicate).count();
		System.out.println("Even Count "+evenCount);
		
		Comparator<Integer> ascendingCompartor = (number1,number2) -> number1.compareTo(number2);
		int min                                = list.stream().min(ascendingCompartor).get();
		System.out.println("Min Value : "+min);
		int max                                = list.stream().max(ascendingCompartor).get();
		System.out.println("Max Value : "+max);
	}

}
