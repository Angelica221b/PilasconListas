package app;

import java.util.Iterator;

import stack.Stack;
import stack.StackEmptyException;
import stack.StackFullException;

public class App {
	
	public static void main(String[] args) {
		Stack<String> names = new Stack<String>(5);

		try {
			
			names.push("Andrea");
			names.push("Angela");
			names.push("Alejandro");
			names.push("Angelica");
			//names.push("Andrik");
			
			
			System.out.println("Peek: " + names.peek());
			
			System.out.println("Search: " + names.search("Alejandro"));
			
			System.out.println("Pop: " + names.pop());
			names.push("Jalil");
			
			Iterator<String> iterator =names.iterator();
			
			System.out.println("Size: " + names.size());
			
			System.out.println();
			
			System.out.println("------------------");
			System.out.println("Pila:");
			System.out.println();
			for(Iterator<String> it=iterator; it.hasNext(); ) {
				System.out.println(iterator.next());
			}
			
			//names.clear();
			
			//names.pop();
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
