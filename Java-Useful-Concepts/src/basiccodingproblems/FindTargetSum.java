package basiccodingproblems;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FindTargetSum {

	public static void main(String[] args) {
		int targetSum = 32;
		int arr[]     = {30,20,18,14,17};
		Map<Integer,Integer> map = new HashMap<Integer, Integer>();
		for(int i = 0;i<arr.length;i++) {
			int remainingSum = targetSum - arr[i];
			if(map.containsKey(remainingSum)) 
				System.out.println(" "+arr[i]+" + "+remainingSum+"  = "+targetSum+" ");
			else
				map.put(arr[i], i);
				
		}
		
	}
	
}
