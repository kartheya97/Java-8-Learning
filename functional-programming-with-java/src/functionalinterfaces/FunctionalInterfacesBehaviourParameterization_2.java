package functionalinterfaces;

import java.util.List;
import java.util.function.Predicate;

public class FunctionalInterfacesBehaviourParameterization_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> numbers = List.of(1,2,3,4,5);
		filterAndPrint(numbers, x->x%2 == 0);
		System.out.println("======");
		filterAndPrint(numbers, x->x%2 != 0);
		
	}

	private static void filterAndPrint(List<Integer> numbers, Predicate<? super Integer> predicate) {
		numbers.stream().filter(predicate).forEach(System.out::println);
	}

}
