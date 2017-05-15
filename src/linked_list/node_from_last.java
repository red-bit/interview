/* This program prints nth node from last of a linked list in a single traversal.
 The idea is to use 2 pointers- reference and current. First move the reference pointer nth node ahead.
The move both the pointers till the reference pointer encounters null
*/
package linked_list;

import java.util.*;

class LNode{
	int data;
	LNode next;
	LNode(int d)
	{
		data=d;
		next=null;
	}
}
class node_from_last{
	static LNode head;
	public void insert(int d)
	{
		if(head==null)
			head=new LNode(d);
		else
		{
			LNode last=head;
			while(last.next!=null)
			{
				last=last.next;
			}
			LNode new_node=new LNode(d);
			last.next=new_node;
		}
	}
	public void printfromlast(int n){
		LNode ref=head;
		LNode curr=head;
		int cnt=0;
		while(cnt<n){
			if(ref==null)
			{
				System.out.println(n+" is out of bound");
				return;
			}
			ref=ref.next;
			cnt++;
		}
		/*Here ref!=null because in the above while loop, ref already pointed to the null of the last pointer 
		in the last execution of the while loop*/
		while(ref!=null){
			ref=ref.next;
			curr=curr.next;
		}
		System.out.println(n+" element from last is "+curr.data);
	}
	public static void main(String args[])
	{
		node_from_last nfl =new node_from_last();
		nfl.insert(20);
		nfl.insert(4);
		nfl.insert(15);
		nfl.insert(35);
		nfl.printfromlast(4);
		
	}
}