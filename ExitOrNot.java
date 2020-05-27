package HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class ExitOrNot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t != 0) {
			int n = sc.nextInt();
			int arr[] = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
			}
			HashMap<Integer, Boolean> map = new HashMap<>();
			for (int i = 0; i < arr.length; i++) {
				map.put(arr[i], true);
			}

			int q = sc.nextInt();
			while (q != 0) {
				int val = sc.nextInt();
				// ExitOrNot(arr, val);
				if (map.containsKey(val)) {
					System.out.println("Yes");
				} else {
					System.out.println("No");
				}

				q--;
			}
			t--;
		}
	}

	private static void ExitOrNot(int[] arr,int val) {
		HashMap<Integer,Boolean> map=new HashMap<>();
		for(int i=0;i<arr.length;i++) {
			map.put(arr[i],true);
		}
		if(map.containsKey(val)) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}

}
