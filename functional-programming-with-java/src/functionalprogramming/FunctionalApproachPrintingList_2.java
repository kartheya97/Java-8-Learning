package functionalprogramming;

import java.util.List;

public class FunctionalApproachPrintingList_2 {

	private static void print(int number) {
		System.out.print(number + "\t");
	}

	private static boolean isEven(int number) {
		return number % 2 == 0;
	}

	public static void printListFunctional(List<Integer> list) {
		list.stream().forEach(FunctionalApproachPrintingList_2 :: print); //Method is called by Method-Reference
	}

	public static void printEvenListFunctional(List<Integer> list) {
		/*
		     list.stream().filter(FunctionalApproachPrintingList_2 :: isEven) // Method being called by Method-Reference.
		    	.forEach(FunctionalApproachPrintingList_2 :: print);    //Method being called by Method-Reference
		 */
		list.stream().filter(number -> number % 2 == 0) //The Lambda Expression is being written in filter function.
		 .forEach(FunctionalApproachPrintingList_2 :: print);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printListFunctional(List.of(12,9,13,4,6,2,4,1,2));
		System.out.println();
		printEvenListFunctional(List.of(12,9,13,4,6,2,4,1,2));
	}

}
