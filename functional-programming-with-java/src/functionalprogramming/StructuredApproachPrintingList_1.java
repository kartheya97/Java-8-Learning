package functionalprogramming;

import java.util.List;

public class StructuredApproachPrintingList_1 {

	public static void printList(List<Integer> numbers ) {
		for(int num : numbers)
			System.out.print(num+"\t");
	}
	
	public static void printEvenList(List<Integer> numbers) {
		for(int num : numbers)
			if(num % 2 == 0)
				System.out.print(num + "\t");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          printList(List.of(12,9,13,4,6,2,4,1,2));
          System.out.println();
          printEvenList(List.of(12,9,13,4,6,2,4,1,2));
	}

}
