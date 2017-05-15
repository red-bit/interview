/*You need to find the inorder successor and predecessor of a given key. 
 * In case the given key is not found in BST, then return the two values within which this key will lie.
 */
package bst;
import tree.*;
class inorder_pre_suc{
	Node root;
	static Node pre=null,suc=null;
	public void find_pre_suc(Node root,int key){
		if(root==null)
			return;
		if(root.data==key){
			if(root.left!=null){
				Node tmp=root.left;
				while(tmp.right!=null){
					tmp=tmp.right;
				}
				pre=tmp;
			}
			if(root.right!=null){
				Node tmp=root.right;
				while(tmp.left!=null)
				{
					tmp=tmp.left;
				}
				suc=tmp;
			}
			return;
		}
		if(root.data<key){
			pre=root;
			find_pre_suc(root.right, key);
		}
		else if(root.data>key)
		{
			suc=root;
			find_pre_suc(root.left, key);
		}
	}
	public static void main (String args[]){
		inorder_pre_suc inps=new inorder_pre_suc();
		inps.root = new Node(10);
		inps.root.left = new Node(5);
		inps.root.right = new Node(15);
		inps.root.left.left = new Node(1);
		inps.root.left.right = new Node(6);
		
		int key=9;
		inps.find_pre_suc(inps.root,key);
		if(pre==null)
			System.out.println("No Predecessor");
		else
			System.out.println(pre.data);
		if(suc==null)
			System.out.println("No Successor");
		else
			System.out.println(suc.data);
	}
}