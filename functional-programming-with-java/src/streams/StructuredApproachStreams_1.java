package streams;

import java.util.List;

public class StructuredApproachStreams_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> numbers = List.of(10,9,7,4,2,3,2,1);	
		int sum               = addListStructured(numbers);
		System.out.println(sum);
	}

	private static int addListStructured(List<Integer> numbers) {
		// TODO Auto-generated method stub
		
		int sum = 0;
		for(int num : numbers) {
			sum = sum + num;
		}
		return sum;
		
	}

}
