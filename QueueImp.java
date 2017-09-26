import java.util.*;

class QueueImp{
	public static void main(String[] arg){
		Deque<String> dq = new LinkedList<String>();
		dq.add("Ramesh");
		dq.add("Shivam");
		dq.add("Ramu");
		dq.offer("Rahul");
		dq.add("Rakesh");
		dq.add("Raju");
		dq.push("Shubham");
		dq.remove("Rakesh");
		
		System.out.println(dq);
		dq.removeFirst();
		dq.removeLast();
		System.out.println(dq);
		
		
	}

}