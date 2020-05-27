package HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Unlock {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++) {
        	arr[i]=sc.nextInt();
        }
        Unlock(arr,k);
       for(int i:arr) {
    	   System.out.print(i+" ");
       }
	}

	private static void Unlock(int[] arr, int k) {
		int kvalue=1;
		HashMap<Integer,Integer> map=new HashMap<>();
		for(int i=0;i<arr.length;i++) {
			map.put(arr[i], i);
		}
		for(int i=arr.length;i>0;i--) {
			int inx = map.get(i);
			int best = (arr.length) - (i);
			if (inx == best)
				continue;
			else {
				int temp = arr[best];
				arr[best] = arr[inx];
				arr[inx] = temp;

				map.put(arr[inx], inx);
				map.put(arr[best], best);
				// if (inx != best) {

				k--;
				// }
			}
		/*	int inx=map.get(i);
		int best=(arr.length)-(i);
		map.put(i, best);
		map.put(arr[best],inx);
		if(inx!=best) {
			
			int temp=arr[inx];
			 arr[inx]=arr[best];
			 arr[best]=temp;
			 if(kvalue==k) {
					return;
				}
			  
		}
		}
		*/
		}
	}

}
