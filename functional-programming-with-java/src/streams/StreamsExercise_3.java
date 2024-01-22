package streams;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class StreamsExercise_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> numbers = List.of(1,2,3,4,5,9,2,1,3);
		
		//Exercise 1 : Square Every Number and find the sum of Squares
        int result = numbers.stream().map( number -> (int)Math.pow(number,2))
			.reduce(Integer :: sum).orElse(0);
		System.out.println(result);

		
		//Exercise 2 : Cube Every number in a list and find the sum of cubes
		int result1 = numbers.stream().map( number -> (int)Math.pow(number, 3))
							.reduce(Integer :: sum).orElse(0);
		System.out.println(result1);
		
		//Exercise 3: Find the sum of odd numbers in a list
		int result2  = numbers.stream().filter( number -> number % 2 !=0 )
							.reduce(Integer :: sum).orElse(0);
		System.out.println(result2);
		
		//Exercise 4 : Print Distinct numbers present in a list
		numbers.stream().distinct().forEach(num -> System.out.print(num + " "));
		
		System.out.println( "\n" + "===================================================");
		
		//Exercise 5 : Arrange all the elements in ascending order
	    numbers.stream().sorted().forEach(num -> System.out.print(num + " "));	
	    
	    System.out.println("\n" + "===================================================");
	    
	    //Exercise 5 : Arrange all the elements in ascending order
	    numbers.stream().sorted(Comparator.reverseOrder()).forEach(num -> System.out.print(num + " "));	
	}

}
