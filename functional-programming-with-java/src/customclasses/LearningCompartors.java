package customclasses;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class LearningCompartors {

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
        
		Comparator<Course> noOfStudentsAscendingComparator    = Comparator.comparing(Course::getNumberOfStudents);
		List<Course> studentCoursesAscendingOrder             = returnCourseObjects(courses,noOfStudentsAscendingComparator);
		System.out.println("Courses with Number of Students in Ascending Order");
		studentCoursesAscendingOrder.stream().forEach(course -> System.out.println(course.getName() + "->"+ course.getNumberOfStudents()) );
		
		System.out.println("==================================================");
		System.out.println("Courses with Number of Students in Descending Order");
		Comparator<Course> studentCoursesDescendingComparator = Comparator.comparing(Course::getNumberOfStudents).reversed();
		List<Course> studentsCoursesDescendingOrder           = returnCourseObjects(courses, studentCoursesDescendingComparator);
		studentsCoursesDescendingOrder.stream().forEach(course -> System.out.println(course.getName() +"->"+ course.getNumberOfStudents()));
		
		Comparator<Course> comparingNoOfStudentsAndReviews = Comparator.comparing(Course::getNumberOfStudents)
				                                                       .thenComparing(Comparator.comparing(Course::getReview_score).reversed());
				                                                       
		System.out.println("===================================================");
		System.out.println("Courses with Number of students in Ascending order and Review Score in descending order");
		List<Course> studentReviewObject = returnCourseObjects(courses, comparingNoOfStudentsAndReviews);
		studentReviewObject.stream().forEach(course -> System.out.println(course.getName()+"->"+course.getNumberOfStudents()+"->"+course.getReview_score()));
		
	}
	
	public static List<Course> returnCourseObjects(List<Course> courses,Comparator<Course> comparator){
		return courses.stream()
         .sorted(comparator)
         .collect(Collectors.toList());
	}

}
