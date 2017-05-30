package graph;

import java.util.*;
class dfs{
	static int V;
	LinkedList<Integer> adj[];
	dfs(int v){
		V=v;
		adj=new LinkedList[V];
		for(int i=0;i<V;i++)
			adj[i]=new LinkedList();
	}
	public void addEdge(int x,int y){
		adj[x].add(y);
	}
	public void dfsfunc(){
		boolean visited[]=new boolean[V];
		for(int i=0;i<V;i++)
		{
			if(visited[i]==false)
				dfsUtil(i,visited);
		}
	}
	public void dfsUtil(int s,boolean[] visited){
		visited[s]=true;
		System.out.print(s+" ");
		Iterator<Integer> it=adj[s].iterator();
		while(it.hasNext())
		{
			int n=it.next();
			if(visited[n]==false)
				dfsUtil(n,visited);
		}
	}
	public static void main(String args[]){
		dfs g = new dfs(4);
		 
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);
 
        System.out.println("Following is Depth First Traversal");
 
        g.dfsfunc();
	}
}