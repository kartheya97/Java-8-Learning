package functionalinterfaces;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class BehaviourParameterizationExercise_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> numbers        = List.of(1,2,3,4,5);
		Function< Integer, Integer > mappingFunction = x -> x * x; 
		List<Integer> result = mapAndCreateNewList(numbers, mappingFunction);
		System.out.println(result);
		
	}

	private static List<Integer> mapAndCreateNewList(List<Integer> numbers, Function<Integer, Integer> squareFunction) {
		List<Integer> list   = numbers.stream().map(squareFunction).collect(Collectors.toList());
		return list;
	}

}
