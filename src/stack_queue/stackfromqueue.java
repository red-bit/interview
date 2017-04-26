package stack_queue;

import java.util.*;
class stackfromqueue{
	Queue<Integer> q;
	Queue<Integer> tmp;
	stackfromqueue(){
		q=new LinkedList<Integer>();
		tmp=new LinkedList<Integer>();
	}
	public void push(int d){
		int size=q.size();
		if(size==0)
			q.add(d);
		else
		{
			for(int i=0;i<size;i++){
				tmp.add(q.remove());
			}
			q.add(d);
			for(int i=0;i<size;i++){
				q.add(tmp.remove());
			}
		}
	}
	public void pop(){
		if(q.size()==0)
			System.out.println("Stack Empty");
		else
			q.remove();
	}
	public void printstack(){
		if(q.size()==0)
			System.out.println("Stack Empty");
		else
		{
			Iterator it=q.iterator();
			while(it.hasNext()){
				System.out.print(it.next()+" ");
			}
			System.out.println();
		}
			
	}
	public static void main(String args[]){
		stackfromqueue sfq=new stackfromqueue();
		sfq.push(10);
		sfq.push(20);
		sfq.push(30);
		sfq.printstack();
		sfq.pop();
		sfq.printstack();
	}
}