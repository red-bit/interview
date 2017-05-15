package tree;

/* This prints the diameter of the binary tree. the time complexity of the below is O(n^2).
 * The diameter of a tree T is the largest of the following quantities:

* the diameter of T's left subtree
* the diameter of T's right subtree
* the longest path between leaves that goes through the 
* root of T (this can be computed from the heights of the subtrees of T)
 */

class tree_diameter_easy{
	static Node root;
	public int diameter(Node root){
		if (root==null)
			return 0;
		int lh=height(root.left);
		int rh=height(root.right);
		
		int ld=diameter(root.left);
		int rd=diameter(root.right);
		
		return (Math.max(lh+rh+1, Math.max(ld, rd)));
	}
	public int height(Node root){
		if(root==null)
			return 0;
		int lh=height(root.left);
		int rh=height(root.right);
		if(lh>rh)
			return lh+1;
		else
			return rh+1;
	}
	public static void main(String args[]){
		tree_diameter_easy tde=new tree_diameter_easy();
		root=new Node(1);
		root.left=new Node(2);
		root.right=new Node(3);
		root.left.left=new Node(4);
		root.left.right=new Node(5);
		System.out.println(tde.diameter(root));
	}
}