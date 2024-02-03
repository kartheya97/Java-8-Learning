package playingwithfuntionalprogramming;

import java.util.List;
import java.util.stream.Collectors;

import customclasses.Course;

public class FlatMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Course> courses = 
				List.of(
						new Course("Spring",        "Framework",       98,2000),
						new Course("Spring Boot",   "Framework",       95,1000),
						new Course("API",           "Microservices",   91,3000),
						new Course("Microservices", "Microsservices",  92,4000),
						new Course("FullStack",     "Full_Stack",      92,4000),
						new Course("AWS",           "Cloud_Platform",  91,2000),
						new Course("Azure",         "Cloud_Platform",  88,1200),
						new Course("Docker",        "Devops",          98,2000),
						new Course("Kubernetes",    "Devops",          48,2000)
						);
		//Return a list of the distinct characters present in the courseNames of courses list.
		List<Character> distintCharacters = courses.stream()
												   .map( course -> course.getName().chars().mapToObj(c -> (char)c) )
												  .flatMap(character->character)
												  .distinct()
												  .sorted()
												  .collect(Collectors.toList());
		System.out.println("Distinct Characters = "+distintCharacters);
												    
											
		
	}

}
