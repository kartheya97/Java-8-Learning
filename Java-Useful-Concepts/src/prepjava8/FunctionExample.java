package prepjava8;

import java.util.function.Function;

public class FunctionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Function<String,Integer> lengthFunction = str->str.length();
		System.out.println("Length of string is = "+lengthFunction.apply("sheru"));
		System.out.println("Length of String is = "+lengthFunction.apply("sai"));
	}

}
