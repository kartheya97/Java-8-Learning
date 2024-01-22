package functionalinterfaces;

import java.util.List;

public class MethodReferences_6 {

	private static void print(String str) {
		System.out.println(str);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String>  courses = List.of("Spring","Spring Boot","API","Microservices","AWS","PCF","Azure","Docker","Kubernetes");
		courses
			.stream()
			//.map(str -> str.toUpperCase())
			.map(String :: toUpperCase)
			.forEach(MethodReferences_6 :: print);
	}

}
