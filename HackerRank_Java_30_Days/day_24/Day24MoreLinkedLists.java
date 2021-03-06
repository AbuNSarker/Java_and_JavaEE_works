package day_24;
//https://www.hackerrank.com/challenges/30-linked-list-deletion/problem

import java.util.*;
class Node{
	int data;
	Node next;
	Node(int d){
        data=d;
        next=null;
    }
	
}

public class Day24MoreLinkedLists {
	 public static Node removeDuplicates(Node head) {
	      //Write your code here
         Node current = head;
         Node prev = null;
         HashSet<Integer> hs = new HashSet<>();             
         while (current != null) 
         {
             int curval = current.data;                  
              // If current value is seen before
             if (hs.contains(curval)) {
                 prev.next = current.next;
             } else {
                 hs.add(curval);
                 prev = current;
             }
             current = current.next;
         }
         return head;
 
  }

	    

		 public static  Node insert(Node head,int data)
	     {
	        Node p=new Node(data);			
	        if(head==null)
	            head=p;
	        else if(head.next==null)
	            head.next=p;
	        else
	        {
	            Node start=head;
	            while(start.next!=null)
	                start=start.next;
	            start.next=p;

	        }
	        return head;
	    }
	    public static void display(Node head)
	        {
	              Node start=head;
	              while(start!=null)
	              {
	                  System.out.print(start.data+" ");
	                  start=start.next;
	              }
	        }
	        public static void main(String args[])
	        {
	              Scanner sc=new Scanner(System.in);
	              Node head=null;
	              int T=sc.nextInt();
	              while(T-->0){
	                  int ele=sc.nextInt();
	                  head=insert(head,ele);
	              }
	              head=removeDuplicates(head);
	              display(head);

	       }
}