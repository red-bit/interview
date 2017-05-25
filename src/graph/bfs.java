package graph;

import java.util.*;
class bfs{
	static int V;
	static LinkedList<Integer> adj[];
	bfs(int v){
		V=v;
		adj=new LinkedList[v];
		for(int i=0;i<V;i++)
			adj[i]=new LinkedList();
	}
	public void addEdge(int x,int y){
		adj[x].add(y);
	}
	public void bfsUtil(int s){
		boolean visited[]=new boolean[V];
		LinkedList<Integer> queue=new LinkedList<Integer>();
		visited[s]=true;
		queue.add(s);
		while(queue.size()!=0){
			s=queue.poll();
			System.out.print(s+" ");
			Iterator<Integer> it=adj[s].iterator();
			while(it.hasNext()){
				int n=it.next();
				if(!visited[n]){
					visited[n]=true;
					queue.add(n);
				}
			}
		}
	}
	public static void main(String args[]){
		bfs g = new bfs(4);
		 
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);
 
        System.out.println("Following is Breadth First Traversal "+
                           "(starting from vertex 2)");
 
        g.bfsUtil(2);
	}
}