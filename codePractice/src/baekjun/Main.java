package baekjun;

import java.util.ArrayList;
import java.util.Scanner;

import algorism.MergeSort;

public class Main {
	
	


	public static void main(String[] args) {
		
		MergeSort ms = new MergeSort();
		
		int[] data = {2,1,4,3,5,7,6,9,10};
		
		ms.mergeSort(data, 0, data.length-1);
		
		for(int i = 0; i < data.length; i++) {
			
			System.out.print(data[i] + " ");
		}
		
	}

	

}
