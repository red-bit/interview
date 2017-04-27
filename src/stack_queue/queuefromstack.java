package stack_queue;

import java.util.*;

class queuefromstack{
	Stack<Integer> s;
	Stack<Integer> tmp;
	queuefromstack(){
		s=new Stack<Integer>();
		tmp=new Stack<Integer>();
	}
	public void add(int d){
		int size=s.size();
		if(size==0)
			s.push(d);
		else
		{
			for(int i=0;i<size;i++)
				tmp.push(s.pop());
			s.push(d);
			for(int i=0;i<size;i++)
				s.push(tmp.pop());
		}
	}
	public void remove(){
		if(s.size()==0)
			System.out.println("Queue empty");
		else
			s.pop();

	}
	public void printqueue(){
		if(s.size()==0){
			System.out.println("Queue Empty");
		}
		/*else
		{
			Iterator it =s.iterator();
			while(it.hasNext()){
				System.out.print(it.next()+" ");
			}
			System.out.println();
			
		}
		This iterator method is not used as it prints the queue in reverse order.
		Instead use for loop from backward.
		*/
		for(int i=s.size()-1;i>=0;i--)
			System.out.print(s.get(i)+" ");
		System.out.println();
	}
	public static void main(String args[]){
		queuefromstack qfs=new queuefromstack();
		qfs.add(10);
		qfs.add(20);
		qfs.add(30);
		qfs.printqueue();
		qfs.remove();
		qfs.printqueue();
		
	}
}