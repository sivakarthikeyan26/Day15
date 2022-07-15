package day15;

public class Bst_main {

	public static void main(String[] args) {
	        Bst_func tree=new Bst_func();
	        tree.insert(56);
	        tree.insert(30);
	        tree.insert(70);
	        tree.insert(22);
	        tree.insert(40);
	        tree.insert(60);
	        tree.insert(95);
	        tree.insert(11);
	        tree.insert(3);
	        tree.insert(16);
	        tree.insert(65);
	        tree.insert(63);
	        tree.insert(67);
	        tree.inorder();
	        tree.searchNode(tree.root,95);
	        
	}

	}


