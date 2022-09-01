package String_Section;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] arr_int = new int[n];
		for(int i =0; i<n; i++) {
			arr_int[i] = scan.nextInt();
		}
		int lowest = 0;
		int highest = arr_int.length;
		int max = 0;
		
		while(lowest <= highest) {
			int mid = lowest + ((highest - lowest)/2);
			int mid_ele = arr_int[mid];
			int next_ele = arr_int[mid+1];
			int prev_ele = arr_int[mid-1];
			if(next_ele < mid_ele && prev_ele < mid_ele ) {
				max = mid_ele;
				break;
			}else if(next_ele > mid_ele){
				lowest = mid;
			}else if (prev_ele > mid_ele) {
				highest = mid;
			}
			
		}
		System.out.println(max);
	}
}


