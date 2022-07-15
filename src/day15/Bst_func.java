package day15;

import java.util.Stack;

public class Bst_func {
	Node_bst root;
	  /**
	   *  
	   * @param key
	   * Function to insert the key.
	   */
	  public void insert(int key){
	        Node_bst node=new Node_bst(key);
	        if(root==null) {
	            root = node;
	            return;
	        }
	        Node_bst prev=null;
	        Node_bst temp=root;
	        while (temp!=null){
	            if(temp.val>key){
	                prev=temp;
	                temp=temp.left;
	            }
	            else if (temp.val<key){
	                prev=temp;
	                temp=temp.right;
	            }
	        }
	        if(prev.val>key)
	            prev.left=node;
	        else prev.right=node;
	    }
	  /**
	   * Function to print the tree in inorder
	   */
	  public void inorder(){
	        Node_bst temp=root;
	        Stack<Node_bst> stack=new Stack<>();
	        while (temp!=null||!stack.isEmpty()){
	            if(temp!=null){
	                stack.add(temp);
	                temp=temp.left;
	            }
	            else {
	                temp=stack.pop();
	                System.out.print(temp.val+" ");
	                temp=temp.right;
	            }
	        }
	    }
}
