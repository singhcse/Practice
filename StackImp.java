import java.util.*;

class StackImp{
	public static void main(String[] arg){
		Stack<Integer> st=new Stack<Integer>();
		st.push(12);
		st.push(2);
		st.push(19);
		st.push(28);
		st.push(34);
		
		System.out.println(st.pop());
		System.out.println(st.empty());
		System.out.println(st.search(2));
		
		System.out.println(st.peek());
		System.out.println(st);
		
		
	}

}