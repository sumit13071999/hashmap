package HashMap;

public class HashMapclient {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
           HashTable<String,Integer> map=new HashTable<>(2);
           map.put("usa", 101);
           map.put("India", 102);
           map.put("china",103);
    /*       map.display();
          System.out.println( map.get("India"));
          map.display();
          System.out.println(map.remove("china"));
          map.display();
          */
           map.put("russia", 104);
           map.put("nepal", 105);
           map.display();
	}

}
