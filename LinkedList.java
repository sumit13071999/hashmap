package HashMap;
public class LinkedList<T> {
	class Node{
		T data;
		Node next;
	}
	
	private Node head ;
	private  Node tail;
	public  int size=0;
	public boolean isEmpty() {
		if(size==0) {
			return true;
		}else {
			return false;
		}
	}
   public void addLast(T value)

   {
	  Node ll=new Node();
	   ll.data=value;
	   if(head==null)
	   {
	 head = ll;
	 tail=ll;
	 size++;
	   }else {
		   tail.next=ll;
		   tail=tail.next;
	  size++;
	   }
	   
   }
   
   public void addFirst(T value)
   {
	   Node ll=new Node();
	   ll.data=value;
	   if(head==null)
	   {
	 head = ll;
	 tail=ll;
	 size++;
	   }else {
		   Node temp=head;
		   head=ll;
		   ll.next=temp;
		   size++;
	   }
   }
  
   public void addAt(int pos,T element) throws Exception
   {
	   Node ll=new Node();
	   ll.data=element;
	   Node t=head;
	   if(head==null)
	   {
		   throw new Exception("linked list is empty");
	   }else
	   if(size<pos)
	   {
		   throw new Exception("invalid position");
	   }else {
		   for(int i=0;i<pos;i++)
		   {
			   t=t.next;
		   }
		   ll.next=t.next;
		   t.next=ll;
		   size++;
	   }
	   
   }
   public T removeLast()
   {
	   T result=tail.data;
	   Node temp=head;
	   while(temp.next!=tail)
	   {
		   temp=temp.next;
	   }
	      tail=temp;
	      tail.next=null;
	      size--;
	      return result;
   }
   public T removeFirst()
   {
	  T result =head.data;
	  head=head.next;
	  size--;
	  return result;
   }
   public T removeAt(int pos) {
	   T result;
	   Node temp=head;
	   for(int i=1;i<pos;i++) {
		   temp=temp.next;
	   }
	   result=temp.next.data;
	   temp.next=temp.next.next;
	   size--;
	   return result;
   }
   public T getFirst() {
	   return head.data;
   }
   public T getLast() {
	   return tail.data;
   }
   public T getAt(int inx) {
	  Node temp=head;
	  for(int i=0;i<inx;i++) {
		  temp=temp.next;
	  }
	  return temp.data;
   }
   
   public void display()
   {
	Node   temp=head;
	   while(temp!=null)
	   {
		   System.out.print(temp.data+" => ");
		   temp=temp.next;
	   }
	   System.out.println();
	  // System.out.println("===========================================");
   }
   public int find(T data) {
	   int index =0;
	   for(Node temp=this.head;temp!=null;temp=temp.next) {
		   if(temp.data.equals(data)) {
			   return index;
		   }
		   index++;
	   }
	   return -1;
   }
}
