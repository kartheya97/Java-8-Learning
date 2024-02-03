package solvingusecases;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

/*
 * The Time complexity of this approach is O(N) in worst case 
 * because all the HashMapOperations(grouping,entrySet()) and stream operations(filter, map) get executed in linearTime
 *  O(N+N+N+N) = O(N)
 */
public class ReturnDuplicatesPresentInList {

	public static void main(String[] args) {
		
		List<Integer> list                  = List.of(1,2,3,4,5,1,2,3);
		List<Integer> duplicateElements     = list.stream()
												  .collect(Collectors.groupingBy(e->e,Collectors.counting())) //O(N)
												  .entrySet()     //O(N)
												  .stream()
												  .filter(entry -> entry.getValue()>1) //O(N)
												  .map(entry ->entry.getKey()) //O(duplicates)
												  .collect(Collectors.toList());
		System.out.println("Duplicate Elements in a list = "+duplicateElements);
		           
		                  	
		               
		                  			 
		                     			 
		                  		

      
	}
	
}
