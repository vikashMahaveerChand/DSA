package com.linkedList;

import java.util.LinkedList;

public class LinkedListExample1 {
	
	public void firstAddingMethod() {
		System.out.println("Adding Element Starts");
		try {
			LinkedList<String> ll = new LinkedList<String>();
			
			ll.add("A");
	        ll.add("B");
	        ll.addLast("C");
	        ll.addFirst("D");
	        ll.add(2, "E");
	 
	        System.out.println(ll);
	 
	        ll.remove("B");
	        ll.remove(3);
	        ll.removeFirst();
	        ll.removeLast();
	 
	        System.out.println(ll);
	        
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		System.out.println("Adding Element Ends");
	}
	
	public void secondChangingElement() {
		try {
			System.out.println("Changing Element Starts");
			LinkedList<String> ll = new LinkedList<>();
			   
	        ll.add("Geeks");
	        ll.add("Geeks");
	        ll.add(1, "Geeks");
	   
	        System.out.println("Initial LinkedList " + ll);
	   
	        ll.set(1, "For");
	   
	        System.out.println("Updated LinkedList " + ll);
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		System.out.println("Changing Element Ends");
	}
	
	public void thirdRemovingElement() {
		try {
			System.out.println("Removing Element Starts");
			LinkedList<String> ll = new LinkedList<>();
			   
	        ll.add("Geeks");
	        ll.add("Geeks");
	        ll.add(1, "For");
	   
	        System.out.println(
	            "Initial LinkedList " + ll);
	   
	        ll.remove(1);
	   
	        System.out.println(
	            "After the Index Removal " + ll);
	   
	        ll.remove("Geeks");
	   
	        System.out.println(
	            "After the Object Removal " + ll);
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		System.out.println("Removing Element Ends");
	}
	
	public void fourthIteratingElement() {
		try {
			System.out.println("Iterating Element Starts");
			
			LinkedList<String> ll
            = new LinkedList<>();
   
	        ll.add("Geeks");
	        ll.add("Geeks");
	        ll.add(1, "For");
	   
	        // Using the Get method and the
	        // for loop
	        for (int i = 0; i < ll.size(); i++) {
	   
	            System.out.print(ll.get(i) + " ");
	        }
	   
	        System.out.println();
	   
	        // Using the for each loop
	        for (String str : ll)
	            System.out.print(str + " ");
	        
	        System.out.println();
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		System.out.println("Iterating Element Ends");
	}
	
	public void fifthCloneExample() {
		try {
			System.err.println("Cloning Starts");
			LinkedList<String> ll = new LinkedList<>();
			
			ll.add("Vikash");
			ll.add("Chand");
			ll.add("Jain");
			
			System.out.println("linked list : "+ll);
			LinkedList<String> ll_sec = new LinkedList<>();
			
			ll_sec = (LinkedList)ll.clone();
			System.out.println("linked list Cloned : "+ll_sec);
			
			ll_sec.set(0,"Vikash Updated");
			
			System.out.println("linked list Cloned updated : "+ll_sec);
			System.out.println("linked list Org: "+ll);
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		System.err.println("Clone Ends");
	}
	
	public void sixthContainsExample() {
		System.err.println("Contains Starts");
		try {
			LinkedList<String> ll = new LinkedList<>();
			
			ll.add("Vikash");
			ll.add("Chand");
			ll.add("Jain");
			
			System.out.println("list contains Hello : "+ll.contains("Hello"));
			
			System.out.println("list contains Vikash : "+ll.contains("Vikash"));
			
			System.out.println("linked list : "+ll);
			
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		System.err.println("Contains Ends");
	}

}
