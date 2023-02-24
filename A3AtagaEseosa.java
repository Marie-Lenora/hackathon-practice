// COMP 2140 SECTION A01
// Assignment 3
// @author Eseosa Ataga, 007914078
// @version 1st April 2022
//
// PURPOSE: This file shows an example of how to use the class MyQueue.
//

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class A3AtagaEseosa {

	public static void main(String [] args) {



		MyQueue<Integer> q = new MyQueue<Integer>();

		int testSize = 5;

		for (int i = 0 ; i < testSize ; i++) {
			q.enqueue(new Integer(i));
			System.out.println("enqueued " + i);
		}

		for (int i = 0 ; i < testSize/2 ; i++) {
			System.out.println("dequeued " + q.dequeue());
		}

		for (int i = testSize ; i < 2*testSize ; i++) {
			q.enqueue(new Integer(i));
			System.out.println("enqueued " + i);
		}

		while(!q.isEmpty()) {
			System.out.println("dequeued " + q.dequeue());
		}

		//CORE JAVA: Collections
		//2 - ArrayLists
		List<String> store1 = new ArrayList<>();
		store1.add("https://www.amazon.ca/Coders-Work-Reflections-Craft-Programming/dp/1430219483");// interviews of famous coders
		store1.add("https://www.amazon.ca/Code-Complete-2nd-Steve-McConnell/dp/0735619670/"); // thick book about all you need to know about ADT
		store1.add("https://www.amazon.ca/Mythical-Man-Month-Software-Engineering-Anniversary/dp/0201835959");//Software development bible
		store1.add("https://www.amazon.ca/Clean-Code-Handbook-Software-Craftsmanship/dp/0132350882");//Advanced software practises
		store1.add("https://www.amazon.ca/Computer-Programming-Volumes-1-4A-Boxed/dp/0321751043/");//bible of computer science.
		// Solving the questions of the first volume will get you a job in any country, any company.

		//2a- search the ArrayList class to find the function that can be used to get the element at a given index.
		int index =2;
		String book = store1.get(index);// write a single line of code here to find the book at the index;
		System.out.println("Book is retrieved: "+(book.contains("Mythical")));
		//2b- search the ArrayList class to find a way (more than 1 way exist) to add all books in store1 to store2 with a single line of code.
		List store2 = new ArrayList<String>();
		store2.addAll(store1);
		System.out.println("Books are copied:"+(!store2.isEmpty()&&store2.size()==store1.size()));

		List store3 = new LinkedList<String>();
		LinkedList<String> store4 = new LinkedList<String>();

		//related to 2d
		String book2 = store4.peek();//possible
		// but this is not:
		//store3.peek();

		//related to 2e
		//we can change store1 to linkedlist
		store1 = new LinkedList<>();
		//but we cannot change store 4 to an arraylist
		//will not compile: store4 = new ArrayList<String>();
	}



	/*     ***REPORT***
	* C) Differences between array list and linked list:
	*    1. Array list is implemented using arrays while linked lists is not
	*    2. Elements in array lists can be accessed directly while elements in linked lists are accessed sequentially
	*
	*
	* D) Store 3 is of type list while store 4 is of type linked list which is a subclass of the list class.
	*    The method that can be called on store 4 are methods that are particular to the linked list class
	*     i.e. not inherited from the list super class e.g add(), addAll(), clear(), element(), clone(), etc.
	*
	*
	* E) Differences:
	*     1. store4 has access to some methods that store3 does not have access to.
	*     2. store4 is a linked list object while store3 is a list object.
	*
	*    The advantage of using the linked list class in store4 is that it has accessors to more methods than store3
	*
	*    The disadvantage of using the linked list class in store4 is that the object type cannot easily be changed to
	*      another object type in the list class.
	 */
}

