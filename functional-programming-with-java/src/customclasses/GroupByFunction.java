package customclasses;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class GroupByFunction {

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
		//Group the courses by category.
		System.out.println(courses.stream().collect(Collectors.groupingBy(Course::getCategory)));
		
		//Print How Many Courses are present per category
		System.out.println(courses.stream()
				.collect(Collectors.groupingBy(Course::getCategory,Collectors.counting())) ); 
		
		Comparator<Course> reviewScoreComparator = Comparator.comparing(Course::getReview_score);
		//Print How Many Courses are present per category in max_order
		System.out.println(courses.stream()
				.collect(Collectors.groupingBy(Course::getCategory,Collectors.maxBy(reviewScoreComparator))) ); 
		
		//Print How many courseNames come under one category
		System.out.println(courses.stream()
								  .collect(Collectors.groupingBy(Course::getCategory, Collectors.mapping(Course::getName, Collectors.toList()))));
		
	}

}
