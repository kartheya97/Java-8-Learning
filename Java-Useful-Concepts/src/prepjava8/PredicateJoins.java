package prepjava8;

import java.util.function.Predicate;

public class PredicateJoins {

	
	public static void main(String[] args) {
		
		int arr[] = {0,2,4,1,3,54,10,12,53,23,56,11,8};
		
		Predicate<Integer> greaterThenTenPredicate = num -> num > 10;
		Predicate<Integer> evenPredicate           = num -> num%2 == 0;
		Predicate<Integer> oddPredicate            = num -> num%2 != 0;
		
		System.out.println("Print Numbers Greater than 10");
		printElements(greaterThenTenPredicate, arr);
		
		System.out.println("Print Numbers Greater than 10 and even numbers ");
		printElements(greaterThenTenPredicate.and(evenPredicate),arr);
		
		System.out.println("Print Numbers Greater than 10 or odd numbers");
		printElements(greaterThenTenPredicate.or(oddPredicate),arr);
		
		System.out.println("Print Number Less Than 11");
		printElements(greaterThenTenPredicate.negate(), arr);
	}
	
	static void printElements(Predicate<Integer> predicate,int x[]) {
		for(int value : x) {
			if(predicate.test(value))
				System.out.print(value+" ");
		}
		System.out.println();
	}
	
	
}
