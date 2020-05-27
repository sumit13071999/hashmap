package HashMap;
import java.util.Arrays;
import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Arrayintersection{
	 public static void main(String args[]) {
		    Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			int arr1[]=new int[n];
			int arr2[]=new int[n];
			for(int i=0;i<n;i++){
				arr1[i]=sc.nextInt();
			}
			for(int i=0;i<n;i++){
				arr2[i]=sc.nextInt();
			}
		     PriorityQueue<Integer> ans=intersect(arr1,arr2);
		     System.out.print("[");
		  while(ans.size()!=1) {
			  System.out.print(ans.remove()+", ");
		  }
		  System.out.println(ans.remove()+"]");
		  
			 }
	 public static PriorityQueue<Integer> intersect(int[] nums1, int[] nums2) {
	        PriorityQueue<Integer> r=new PriorityQueue<>();
	        HashMap<Integer, Integer> count = new HashMap<Integer, Integer>();
	        for (int n: nums1) {
	            if (!count.containsKey(n)) {
	                count.put(n, 1);
	            } else {
	                count.put(n, count.get(n) + 1);
	            }
	        }
	      
	        for (int n: nums2) {
	            if (count.containsKey(n)) {
	                if (count.get(n) > 0) {
	                    r.add(n);
	                    count.put(n, count.get(n) - 1);
	                }
	            }
	        }
	        return r;
	 }
}
