/*This programs prints the inorder,preorder,postorder of the binary tree.
 * Then it calculates the height of tree to print the level order traversal.
 */

package tree;

class tree_traversal{
	static Node root;
	public void preorder(Node root){
		if (root==null)
			return;
		System.out.print(root.data+" ");
		preorder(root.left);
		preorder(root.right);
	}
	public void postorder(Node root){
		if (root==null)
			return;
		postorder(root.left);
		postorder(root.right);
		System.out.print(root.data+" ");
	}
	public void inorder(Node root){
		if (root==null)
			return;
		inorder(root.left);
		System.out.print(root.data+" ");
		inorder(root.right);
	}
	public int height(Node root){
		if (root==null)
			return 0;
		int lheight=height(root.left);
		int rheight=height(root.right);
		if(lheight>rheight)
			return lheight+1;
		else
			return rheight+1;
	}
	public void levelorder(Node root){
		int h=height(root);
		for(int i=1;i<=h;i++)
			printlevel(root,i);
	}
	public void printlevel(Node node,int level)
	{
		if(node==null)
			return;
		if(level==1)
			System.out.print(node.data+" ");
		if(level>1)
		{
			printlevel(node.left, level-1);
			printlevel(node.right,level-1);
		}
	}
	
	public static void main(String args[]){
		tree_traversal tt=new tree_traversal();
		root=new Node(1);
		root.left=new Node(2);
		root.right=new Node(3);
		root.left.left=new Node(4);
		root.left.right=new Node(5);
		System.out.println("Preorder:");
		tt.preorder(root);
		System.out.println();
		System.out.println("Inorder:");
		tt.inorder(root);
		System.out.println();
		System.out.println("Postorder:");
		tt.postorder(root);
		System.out.println();
		System.out.println("Level Order");
		tt.levelorder(root);
		
	}
}