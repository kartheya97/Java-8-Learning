package playingwithfuntionalprogramming;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class IterateMethodPowerOfTwoExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Generate a stream of 10 elements with power of 2, starting from 2 and also print its sum
		List<Integer> result = IntStream.iterate(1, e -> e * 2)
				.limit(10)
				.boxed().collect(Collectors.toList());
		System.out.println("result is = "+result);


	}

}
