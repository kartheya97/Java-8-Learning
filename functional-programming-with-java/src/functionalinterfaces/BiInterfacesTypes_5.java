package functionalinterfaces;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class BiInterfacesTypes_5 {

	public static void main(String[] args) {
		
		
		//BiPredicate Interface --> It accepts two inputs and returns boolean
		//                          unlike Predicate interface that takes one input and returns boolean. 
		BiPredicate<Integer, String> bipredicate = (number,str) -> {
			return number>10 && str.length() >5;
		};
		System.out.println(bipredicate.test(7, "Sheru"));
		
		//BiFunction Interface --> It takes two inputs and returns an output. This output can be of different type as well.
		BiFunction<Integer, String, String> biFunction = (number, str) ->{
		    return number + str;  	
		};
		System.out.println(biFunction.apply(10, "K"));
		
		//BiConsumer Interface --> It takes two inputs and consumes it and does not produce/return any ouput.
		//                            Example where it can be used -> Sopln
		BiConsumer<String,String> biConsumer = (s1,s2) -> {
			System.out.println(s1);
			System.out.println(s2);
		};
		biConsumer.accept("Sai","Sheru");
		
	}
	
	
}
