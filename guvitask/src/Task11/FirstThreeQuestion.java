package Task11;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class FirstThreeQuestion {
	
	// https://hashnode.com/preview/65a94cfa4146e8f5ac27b979
	
	public static void main(String[] args) {
		
		
		int arr[]= {10,20,30,10,40,50};
		
		Set<Integer> hasset=new LinkedHashSet<Integer>();
		
		for(int i=0;i<arr.length;i++) {
			hasset.add(arr[i]);
			
		}
		
		for (Integer integer : hasset) {
			System.out.println(integer);
		}
		
//		int [] arrr= {1,1,1,3,45,6,7,8};
//		
//		List<int[]> asList = Arrays.asList(arrr);
//		Set<Integer> hasset1=new LinkedHashSet<Integer>(asList);
//		System.out.println(hasset1);
		
	}

}
