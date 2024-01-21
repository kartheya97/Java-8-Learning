package functionalprogramming;

import java.util.List;

public class FunctionalApproachPrintingListAdvanced_3 {

	public static void printListFunctionalApproach(List<Integer> list) {
		 list.stream().forEach(System.out::println);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printListFunctionalApproach(List.of(12,9,13,4,6,2,4,1,2));
	}

}
