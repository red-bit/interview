package stack_queue;

import java.util.*;
class stackfrompriorityqueue{
	class element
	{
		int prio;
		int data;
		public element(int p,int d){
			prio=p;
			data=d;
		}
	}
	int priority=0;
	public static Comparator<element> comparator=new Comparator<element>() {
		
		@Override
		public int compare(element o1, element o2) {
			/*if this function returns a value which is greater than 0 then that means the value has
			 * to be interchanged.Eg- to make the element with highest priority to be at head of the 
			 * priority queue we make sure that the difference of priority comes out as positive.
			 * o2 priority is high than o1 so difference is positive.   
			 */
			return (int) (o2.prio-o1.prio);
		}
	};
	//Creates a PriorityQueue that orders its elements according to the specified comparator.
	static PriorityQueue<element> queue=new PriorityQueue<element>(comparator);
	public void push(int d)
	{
		priority++;
		queue.add(new element(priority, d));
	}
	
	public void printstack(){
		if(queue.size()==0)
			System.out.println("Stack Empty");
		else
		{
			//This is used to do a shallow clone. It simply clones queue to cqueue;
			PriorityQueue<element> cqueue =new PriorityQueue<element>(queue);
			while(cqueue.size()!=0)
			{
				System.out.print(cqueue.poll().data+" ");
			}
			System.out.println();
		}
			
	}
	public void pop()
	{
		if(priority==0)
		{
			System.out.println("Stack Empty");
		}
		else
		{
		priority--;
		queue.remove();
		}
	}
	
	public static void main(String args[]){
		stackfrompriorityqueue sfpq =new stackfrompriorityqueue();
		sfpq.push(10);
		sfpq.push(20);
		sfpq.push(30);
		sfpq.printstack();
		sfpq.pop();
		sfpq.printstack();
		sfpq.push(40);
		sfpq.push(50);
		sfpq.printstack();
	}
}