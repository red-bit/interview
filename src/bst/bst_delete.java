package bst;
import tree.*;
class bst_delete{
	static Node root;
	public void deletebst(int d){
		root=deletebstUtil(root, d);
	}
	public Node deletebstUtil(Node root,int d)
	{
		if(root==null)
			return null;
		if(d<root.data)
			root.left=deletebstUtil(root.left, d);
		else if (d>root.data)
			root.right=deletebstUtil(root.right, d);
		else
		{
			if(root.left==null)
				return root.right;
			else if(root.right==null)
				return root.left;
			root.data=findmin(root.right);
			root.right=deletebstUtil(root.right, root.data);
		}
		return root;
	}
	public int findmin(Node root){
		int minv=root.data;
		if(root.left!=null){
			minv=root.left.data;
			root=root.left;
		}
		return minv;
	}
	public void insertbst(int d){
		root=insertbstUtil(root, d);
	}
	public Node insertbstUtil(Node root,int d){
		if(root==null)
		{
			root=new Node(d);
			return root;
		}
		if(d<root.data)
			root.left=insertbstUtil(root.left, d);
		else if(d>root.data)
			root.right=insertbstUtil(root.right, d);
		return root;
	}
	public void inorder(Node root)
	{
		if(root==null)
			return;
		inorder(root.left);
		System.out.print(root.data+" ");
		inorder(root.right);
	}
	public static void main(String args[])
	{
		bst_delete tree=new bst_delete();
		tree.insertbst(50);
        tree.insertbst(30);
        tree.insertbst(20);
        tree.insertbst(40);
        tree.insertbst(70);
        tree.insertbst(60);
        tree.insertbst(80);
 
        System.out.println("Inorder traversal of the given tree");
        tree.inorder(root);
 
        System.out.println("\nDelete 20");
        tree.deletebst(20);
        System.out.println("Inorder traversal of the modified tree");
        tree.inorder(root);
 
        System.out.println("\nDelete 30");
        tree.deletebst(30);
        System.out.println("Inorder traversal of the modified tree");
        tree.inorder(root);
 
        System.out.println("\nDelete 50");
        tree.deletebst(50);
        System.out.println("Inorder traversal of the modified tree");
        tree.inorder(root);
	}
}