package customclasses;

import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class SomeMoreUtilityMethods {

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
		
		System.out.println("Return only the top5 courses with most number of students");
        Comparator<Course> studentNoAscendingComparator = Comparator.comparing(Course::getNumberOfStudents).reversed();		
        List<Course> fiveMaxStudentCourses              = courses.stream()
        														 .sorted(studentNoAscendingComparator)
        														 .limit(5)
        														 .collect(Collectors.toList());
        
        fiveMaxStudentCourses.stream().forEach(course -> System.out.println(course.getName() +" "+ course.getNumberOfStudents()));
        System.out.println("==========================================================");
        System.out.println("Return only Top 3,4,5 courses with most number of students");
        List<Course> threeMaxStudentCourses = courses.stream()
        											 .sorted(studentNoAscendingComparator)
        											 .skip(2)
        											 .limit(3)
        											 .collect(Collectors.toList());
        threeMaxStudentCourses.stream().forEach(course -> System.out.println(course.getName()+" "+course.getNumberOfStudents()));
        
        System.out.println("===========================================================");
        System.out.println("Return the list of courses till u reach a review score of 95");
        Comparator<Course> reviewScoreComparator = Comparator.comparing(Course::getReview_score);
        Predicate<Course> reviewScorePredicate = (course) -> course.getReview_score() < 95;
        /*
         * takeWhile() returns the Object/value till that condition is satisfied in the order it receives 
         * Suppose the firstValue in the Object does not match the condition and then its stops taking any values
         * even if there are suitable values to enter (It takes values till it matches the condition once Condition is not
         * met it does not take.
         */
        List<Course> reviewScoreTill95 = courses.stream()
        		                                .sorted(reviewScoreComparator)
        										.takeWhile(reviewScorePredicate)
        										.collect(Collectors.toList());
        reviewScoreTill95.stream().forEach(course -> System.out.println(course.getName()+ " "+course.getReview_score()));
       
        System.out.println("======================= Return Values Greater than 95 ====================================");
        List<Course> reviewScoreGreaterThan95 = courses.stream()
                .sorted(reviewScoreComparator)
				.dropWhile(reviewScorePredicate)
				.collect(Collectors.toList());
        reviewScoreGreaterThan95.stream().forEach(course -> System.out.println(course.getName()+ " "+course.getReview_score()));
        
 	}

	
}
