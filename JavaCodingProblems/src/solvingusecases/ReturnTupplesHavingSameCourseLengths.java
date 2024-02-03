package solvingusecases;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import pojoclasses.Course;


/*
 * The time Complexity of this approach is O(N+M)
 */
public class ReturnTupplesHavingSameCourseLengths {

	public static void main(String[] args) {
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
						new Course("Kubernetes",    "Devops",          48,2000),
						new Course("React",         "Front_End",       90,12000)
						);

			Map<Integer, List<Course>> map         = courses.stream()
					                                       .collect(Collectors.groupingBy(course -> course.getName().length())); //Time Complexity of groupingBy is O(N) as it takes O(N) to reach till the end of loop while iterating. 
		    Set<List<String>> tuppleCourses		  = map.entrySet().stream()
												          .filter(entry -> entry.getValue().size()>1) //Time Complexity of filter is O(N) because in reaches the last N element while iterating.
												          .map(entry -> entry.getValue().stream()
												        		                        .map(course -> course.getName()) //Time Complexity is O(M) where M stands for the number of courses.
												        		                        .collect(Collectors.toList())
												        	  ).collect(Collectors.toSet());
		    System.out.println(tuppleCourses);
		
	}
	
	
}
