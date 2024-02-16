import java.util.function.Function;
import java.util.function.Predicate;

public class PredictTheOutput9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		Function<String, Integer> fun = str -> str.length();
		System.out.println(fun.apply("Karthik"));
		System.out.println(fun.apply("Singh"));
	    
	    
		
	}

}
