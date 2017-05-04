package tree;
class binary_mirror_tree{
	static Node root;
	public Node mirror(Node node){
		if(node==null)
			return node;
		Node left=mirror(node.left);
		Node right=mirror(node.right);
		
		node.left=right;
		node.right=left;
		return node;
	}
	public void inorder(Node node){
		if(node==null)
			return;
		inorder(node.left);
		System.out.print(node.data+" ");
		inorder(node.right);
	}
	public static void main(String args[])
	{
		binary_mirror_tree bmt= new binary_mirror_tree();
		root=new Node(1);
		root.left=new Node(2);
		root.right=new Node(3);
		root.left.left=new Node(4);
		root.left.right=new Node(5);
		bmt.inorder(root);
		Node tmp=bmt.mirror(root);
		
		System.out.println();
		bmt.inorder(root);
	}
}