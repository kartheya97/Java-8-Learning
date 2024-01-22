package streams;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class CollectingStreamElements_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> numbers         = List.of(1,2,3,4,5,9,2,1,3);
		List<Integer> doubledNumbers  = doubleList(numbers);
		List<String>  courses         = List.of("Spring","Spring Boot","API","Microservices","AWS","PCF","Azure","Docker","Kubernetes");
		List<Integer> courseTitles    = returnCourseTitlesList(courses);
	    System.out.println(doubledNumbers);	
	    System.out.println( courseTitles );
	}

	private static List<Integer> returnCourseTitlesList(List<String> courses) {
		// TODO Auto-generated method stub
		return courses.stream().map(course -> course.length()).collect(Collectors.toList());
	}

	private static List<Integer> doubleList(List<Integer> numbers) {
		// TODO Auto-generated method stub
		return numbers.stream()
				.map(num -> (int)Math.pow(num,2)).collect(Collectors.toList());
	}

	
	
}
