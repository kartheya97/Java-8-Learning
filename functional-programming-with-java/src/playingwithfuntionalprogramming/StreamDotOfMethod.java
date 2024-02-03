package playingwithfuntionalprogramming;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamDotOfMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
      Stream<Integer> intValues =  Stream.of(12,9,2,1,5,6);
      int arr[]                 =  {12,9,2,1,5,6};
      System.out.println(Arrays.stream(arr));
      System.out.println("Min Value = "+Arrays.stream(arr).min());
      //Return the Sum of First ten even numbers
      int x = IntStream.iterate(2, e->e+2).limit(10).peek(System.out::println).sum();
      System.out.println("Sum is = "+x);
      
	}

}
