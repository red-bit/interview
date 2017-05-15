package bst;
import tree.*;
class is_binarybst_inorder{
	Node root;
	Node prev;
	public boolean binary_bst(Node root){
		if(root!=null){
			if(!binary_bst(root.left))
				return false;
			if(prev!=null && root.data<=prev.data)
				return false;
			prev=root;
			return(binary_bst(root.right));
		}
		return true;
	}
	public static void main(String args[]){
		is_binarybst_inorder isbstmm=new is_binarybst_inorder();

		isbstmm.root = new Node(4);
		isbstmm.root.left = new Node(2);
		isbstmm.root.right = new Node(5);
		isbstmm.root.left.left = new Node(1);
		isbstmm.root.left.right = new Node(3);
 
        if (isbstmm.binary_bst(isbstmm.root))
            System.out.println("IS BST");
        else
            System.out.println("Not a BST");
	}
}