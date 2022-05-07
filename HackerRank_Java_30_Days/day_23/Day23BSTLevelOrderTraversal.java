package day_23;
// https://www.hackerrank.com/challenges/30-binary-trees/problem

import java.util.Scanner;

class Node{
    Node left,right;
    int data;
    Node(int data){
        this.data=data;
        left=right=null;
    }
}

public class Day23BSTLevelOrderTraversal {

    static void levelOrder(Node root) {
        // Write your code here
        int h = height(root); // calculating height
        //System.out.println("height value  :" + h);
       
        int i;
        for (i = 1; i <= h; i++){
            printDataInEachLevel(root, i);
        }
           
    }

    /*
     * Compute the "height" of a tree -- the number of nodes along the longest path
     * from the root node down to the farthest leaf node.
     */
    static int height(Node root) {
        if (root == null)
            return 0;
        else {
            /* compute height of each subtree */
           // System.out.println(root.left + "   " + root.right);
            int lheight = height(root.left);
            int rheight = height(root.right);
            return Math.max(lheight, rheight) + 1;
        }
    }

    /* Print nodes at the given level */
    static void printDataInEachLevel(Node root, int level) {
        if (root == null)
            return;
        if (level == 1)
            System.out.print(root.data + " ");
        else if (level > 1) {
            printDataInEachLevel(root.left, level - 1);
            printDataInEachLevel(root.right, level - 1);
        }
    }


	public static Node insert(Node root,int data){
	        if(root==null){
	            return new Node(data);
	        }
	        else{
	            Node cur;
	            if(data<=root.data){
	                cur=insert(root.left,data);
	                root.left=cur;
	            }
	            else{
	                cur=insert(root.right,data);
	                root.right=cur;
	            }
	            return root;
	        }
	    }
	    public static void main(String args[]){
	            Scanner sc=new Scanner(System.in);
	            int T=sc.nextInt();
	            Node root=null;
	            while(T-->0){
	                int data=sc.nextInt();
	                root=insert(root,data);
	            }
	            levelOrder(root);
	        }	
	}