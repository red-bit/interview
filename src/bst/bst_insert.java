// To insert a node in bst. In bst the new node is added at the end of the tree.
package bst;
import tree.*;
class bst_insert{
	static Node root;
	public void insertbst(int d)
	{
		root=insertbstUtil(root,d);
	}
	public Node insertbstUtil(Node root,int d){
		if(root==null){
			root=new Node(d);
			return root;
		}
		if(d<root.data)
			root.left=insertbstUtil(root.left,d);
		if(d>root.data)
			root.right=insertbstUtil(root.right,d);
		return root;	
		
	}
	public void printbst(Node root){
		if(root==null)
			return;
		printbst(root.left);
		System.out.print(root.data+" ");
		printbst(root.right);
		
	}
	public static void main(String args[]){
		bst_insert bi=new bst_insert();
		bi.insertbst(200);
		bi.insertbst(100);
		bi.insertbst(300);
		bi.printbst(root);
	}
}
