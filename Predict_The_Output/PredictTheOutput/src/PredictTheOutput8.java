import java.util.function.Predicate;

public class PredictTheOutput8 {

	public static void main(String[] args) {
		
       Predicate<Integer> number = num -> num % 2 == 0;
       System.out.println(number.test(19));
		
	}
	
	
}
