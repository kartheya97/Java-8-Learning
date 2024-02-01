package customclasses;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class SingleValuedFunctions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Course> courses = 
				List.of(
						new Course("Spring",        "Framework",       98,2000),
						new Course("Spring Boot",   "Framework",       95,1000),
						new Course("API",           "Microservices",   91,3000),
						new Course("Microservices", "Microsservices",  92,4000),
						new Course("FullStack",     "Full Stack",      92,8000),
						new Course("AWS",           "Cloud Platform",  91,2000),
						new Course("Azure",         "Cloud Platform",  88,1200),
						new Course("Docker",        "Devops",          98,2100),
						new Course("Kubernetes",    "Devops",          48,2000)
						);
		
		//Return CourseObject which has max number of students
		Comparator<Course> maxStudentsComparator = Comparator.comparing(Course::getNumberOfStudents);
		Optional<Course> maxCourse = courses.stream().max(maxStudentsComparator);
		System.out.println(maxCourse.get());
		
		//Return CourseObject which has min number of students
	    Optional<Course> minCourse           = courses.stream().min(maxStudentsComparator);
	    System.out.println(minCourse.get());
		
	    //Return The TotalNumber of Students whose review_score is greater than 95.
	    Predicate<Course> reviewScoreGreaterThan95 = course -> course.getReview_score()>95;
	    int totalStudents                          = courses.stream()
	    													.filter(reviewScoreGreaterThan95)
	    													.mapToInt(Course::getNumberOfStudents)
	    													.sum();
	    System.out.println("Total Students with Review Score Greater than 95 = "+totalStudents);
	    
	    
	    
	}

}
