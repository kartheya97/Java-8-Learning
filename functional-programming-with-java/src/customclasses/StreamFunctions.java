package customclasses;

import java.util.List;
import java.util.function.Predicate;

public class StreamFunctions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Course> courses = 
				List.of(
						new Course("Spring",        "Framework",       98,2000),
						new Course("Spring Boot",   "Framework",       95,1000),
						new Course("API",           "Microservices",   91,3000),
						new Course("Microservices", "Microsservices",  92,4000),
						new Course("FullStack",     "Full Stack",      92,4000),
						new Course("AWS",           "Cloud Platform",  91,2000),
						new Course("Azure",         "Cloud Platform",  88,1200),
						new Course("Docker",        "Devops",          98,2000),
						new Course("Kubernetes",    "Devops",          48,2000)
						);
       
		
		Predicate<Course> reviewScoregretareThan95Predicate = course -> course.getReview_score() > 95;
		Predicate<Course> reviewScoregretareThan90Predicate = course -> course.getReview_score() > 90;
		Predicate<Course> reviewScoreLessThan85Predicate = course -> course.getReview_score() < 85;
		
		System.out.println(courses.stream().allMatch(reviewScoregretareThan95Predicate));
		System.out.println(courses.stream().noneMatch(reviewScoreLessThan85Predicate));
		System.out.println(courses.stream().anyMatch(reviewScoreLessThan85Predicate));
	}

}
