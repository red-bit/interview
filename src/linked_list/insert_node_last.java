package linked_list;

import java.util.*;

class insert_node_last{
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
	public void printlist(LNode head){
		LNode tmp=head;
		while(tmp!=null)
		{
			System.out.print(tmp.data+" ");
			tmp=tmp.next;
		}
		System.out.println();
	}
	public static void main(String args[])
	{
		insert_node_last nfl =new insert_node_last();
		nfl.insert(10);
		nfl.insert(20);
		nfl.insert(30);
		nfl.printlist(head);
	}
}