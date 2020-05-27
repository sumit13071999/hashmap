package HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class subArrayWithdintictElement {

	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int arr[]=new int[n];
       for(int i=0;i<n;i++) {
    	   arr[i]=sc.nextInt();
       }
      long sum= sumOfDintictElement(arr);
      System.out.println(sum);
	}

	private static long sumOfDintictElement(int[] arr) {
		HashMap<Integer,Boolean> map=new HashMap<>();
		int j=-1,ans=0;
		for(int i=0;i<arr.length;i++) {
			while(j<arr.length-1 && !map.containsKey(arr[j+1])) {
				j++;
				map.put(arr[j], true);
			}
			ans+=((j-i+1)*(j-i+2))/2;
			map.remove(arr[i]);
		}
	
		return ans;
	}

}
