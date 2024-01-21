package functionalprogramming;

import java.util.ArrayList;
import java.util.List;

public class FunctionalProgrammingExercise_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   
		List<Integer> list    = List.of(2,4,5,2,5,7,34,43,67,63,34,23,32);
	    List<String>  courses = List.of("Spring","Spring Boot","API","Microservices","AWS","PCF","Azure","Docker","Kubernetes");
	    
	    //Exercise 1 : Print Only Odd numbers from the list
	    list.stream().filter( number -> number%2 !=0 )
	    	.forEach(num -> System.out.print(num + "\t"));
	    
	    System.out.println("\n" + "======================================================================================");
	    
	    //Exercise 2 : Print all Courses Individually
	    courses.stream().forEach(val -> System.out.print(val + "\t"));
	    
	    System.out.println("\n" + "======================================================================================");
	    
	    //Exercise 3 : Print Courses Containing the word Spring
	    courses.stream().filter(course -> course.contains("Spring"))
	    		.forEach(val -> System.out.print(val + "\t"));
	    
	    System.out.println("\n" + "======================================================================================");
	    
	    //Exercise 4 : Print Cpurses whose names have atleast 4 letters
	    courses.stream().filter(course -> course.length() >=4 ? true : false)
	      .forEach(val -> System.out.print(val + "\t"));
	   
	    System.out.println("\n" + "======================================================================================");
	    
	    //Exercise 5 : Print Squares of the numbers 
	    list.stream().map(number -> (int)Math.pow(number,2))
	      	.forEach(number -> System.out.print(number + "\t"));
	    
	    System.out.println("\n" + "======================================================================================");
	    
	    //Exercise 6 : Print the cubes of odd numbers
	    list.stream().map(number -> (int) Math.pow(number, 3))
	    	.forEach(number -> System.out.print(number + "\t"));
	    
	    System.out.println("\n" + "======================================================================================");
	    //Exercise 7: Print the number of characters in each course name
	    courses.stream().forEach(course -> System.out.println( course + " -- " + course.length() ));
	    
	}

}
