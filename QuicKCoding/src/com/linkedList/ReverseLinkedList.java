package com.linkedList;

class ListNode {
	int val;
	ListNode next;
	ListNode() {}
	ListNode(int val) { this.val = val; }
	ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	
	public ListNode getNode() {
		return next;
	}
	@Override
	public String toString() {
		return ""+val;
	}
}

public class ReverseLinkedList {
	
	
	ListNode head;
	
	public static void main(String args[]) {
		try {
			
			//ListNode head =new ListNode(10);
			
			ListNode head =null;
			ListNode tail =null;
			/*head.next = new ListNode(20);
			head.next.next = new ListNode(30);
			head.next.next.next = new ListNode(40);
			head.next.next.next.next = new ListNode(50);
			*/
			for(int i=0;i<args.length;i++) {
				ListNode obj = new ListNode(Integer.parseInt(args[i]));
				
				if(head==null) {
					head = obj;
					tail = obj;
				}else {
					tail.next = obj;
					tail = obj;
				}
			}
			
			/*while (head != null) {
	            System.out.print(head.val + " ");
	            head = head.next;
	        }*/
			
			
			//Reverse -Starts
			ListNode previous = null;
			ListNode current = head;
			ListNode next = null;
			
			while(current!=null) {
				next = current.next;
				current.next = previous;
				previous = current;
				current = next;
				//System.out.println(current);
				
			}
			System.out.println("Head : "+head);
			System.out.println("Previous : "+previous);
			head = previous;
			System.out.println("Reverse print");
			while (head != null) {
	            System.out.print(head.val + " ");
	            head = head.next;
	        }
			
			//Reverse - Ends
	       
			
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}

}
