package io.capgemini.junit;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SingleObject {
	public static void main(String args[]) {
		// Initializing array of integers
		Integer[] num= {56,34,7,3,54,34,34,53};
		 // using Collections.min() to
        // find minimum element
        // using only 1 line.
        int min = Collections.min(Arrays.asList(num));
 
        // using Collections.max()
        // to find maximum element
        // using only 1 line.
        int max = Collections.max(Arrays.asList(num));
        List <Integer> res = Arrays.asList(min,max);
        // printing minimum and maximum numbers
        System.out.println(res);
	}
}

