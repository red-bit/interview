/* To check if a binary tree is a Bst or not.
 * This approach uses the Integer.MAX_VALUE and Integer.MIN_VALUE to check if root.data 
 * lies in between the correct range.
 */
package bst;
import tree.*;
class is_binarybst_minmax{
	Node root;
	public boolean binary_bst(Node root,int min,int max){
		if(root==null)
			return true;
		if(root.data<min || root.data>max)
			return false;
		return(binary_bst(root.left, min, root.data-1)&& binary_bst(root.right, root.data+1, max));
	}
	public static void main (String args[]){
		is_binarybst_minmax isbst=new is_binarybst_minmax();

		isbst.root = new Node(4);
		isbst.root.left = new Node(2);
		isbst.root.right = new Node(5);
		isbst.root.left.left = new Node(1);
		isbst.root.left.right = new Node(3);
 
        if (isbst.binary_bst(isbst.root,Integer.MIN_VALUE,Integer.MAX_VALUE))
            System.out.println("IS BST");
        else
            System.out.println("Not a BST");
		
	}
}