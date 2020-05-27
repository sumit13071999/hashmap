package HashMap;
import java.util.*;
public class frequencycunt {
	public static void frequency(int[] arr){
		int max=-1;
		int k=0;
		HashMap<Integer,Integer> map=new HashMap<>();
    for(int i=0;i<arr.length;i++){
		if(map.containsKey(arr[i])){
			map.put(arr[i],map.get(arr[i])+1);
		}else{
			map.put(arr[i],0);
		}
	}
    ArrayList<Integer> array=new ArrayList<>(map.keySet());
	for(Integer key:array) {
   int temp=map.remove(key);
   if(max<temp) {
   max=temp;
   k=key;
	}}
	System.out.println(k);
	}
    public static void main (String args[]) {
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int arr[]=new int[n];
for(int i=0;i<n;i++){
	arr[i]=sc.nextInt();
}
frequency(arr);
    }
}
