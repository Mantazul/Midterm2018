package datastructure;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */
		Queue<String> uName = new LinkedList<String>();
		uName.add("Kiran");
		uName.add("Luis");
		uName.add("Jewell");
		uName.add("Abby");
		System.out.println("First element of the queue: "+uName.peek());
		uName.remove();
		System.out.println("After removing head, first element of the queue: "+uName.peek());
		System.out.println("Printing queue using for each loop: ");
		for(String st : uName) System.out.print(st+" ");
		uName.add("Roy");
		uName.poll();

		System.out.println("\nPrinting queue After adding and removing one element using Iterator ");

		Iterator it = uName.iterator();
		while(it.hasNext()){
			System.out.print(it+" ");
		}

	}

}
