package customclasses;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class TerminalOperationVSIntermediateOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List<String>  courses                    = List.of("Spring","Adobe Experience Manager","Spring Boot","API","Microservices","AWS","PCF","Azure","Docker","Kubernetes");
		 Stream<String>	elevenCharacterCourse = courses.stream()
				 										   .peek(System.out::println)
		 						                           .filter(course->course.length()>11)
		 						                           .map(String::toUpperCase)
		 						                           .peek(System.out::println);
		 System.out.println("elevenCharacterCourse = " +elevenCharacterCourse);
		 Optional<String>	elevenCharacterCourse2 = courses.stream()
				   .peek(System.out::println)
                  .filter(course->course.length()>11)
                  .map(String::toUpperCase)
                  .peek(System.out::println)
                  .findFirst(); 
		 System.out.println(elevenCharacterCourse2);
		 
	}

}
