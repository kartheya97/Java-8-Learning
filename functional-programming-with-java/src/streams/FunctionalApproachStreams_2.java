package streams;

import java.util.List;

public class FunctionalApproachStreams_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers = List.of(10,9,7,4,2,3,2,1);	
	   // System.out.println( numbers.stream().reduce(0,(a,b)->a+b) ) ;
	   System.out.println( numbers.stream().reduce(0, Integer :: sum) );
	}
	
}
