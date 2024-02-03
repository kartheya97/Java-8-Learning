package customclasses;

import java.util.List;
import java.util.function.Predicate;


public class HigherOrderFunction {

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
						new Course("Kubernetes",    "Devops",          48,2000),
						new Course("React",         "Front_End",       90,12000)
						);
		
		Predicate<Course> predicate1 = returnPredicateWithReviewScoreFilter(90);
		Predicate<Course> predicate2 = returnPredicateWithReviewScoreFilter(95);
		System.out.println(predicate1);
		 
	}

	public static Predicate<Course> returnPredicateWithReviewScoreFilter(int reviewScore){
		return course -> course.getReview_score() > reviewScore;
	}
	
}
