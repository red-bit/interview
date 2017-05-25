package backtracking;

class m_coloring{
	public static int V=4;
	public boolean isSafe(int graph[][],int col[],int v,int c){
		for(int i=0;i<V;i++)
		{
			if(graph[v][i]==1 && c==col[i])
				return false;
		}
		return true;
	}
	public void graphcolor(int graph[][],int m){
		int col[]=new int[V];
		for(int i=0;i<V;i++)
			col[i]=0;
		if(!graphcolorutil(graph,m,col,0))
		{
			System.out.println("Solution does not exist");
		}
		else
		{
			printsol(col);
		}
	}
	public void printsol(int col[]){
		int l=col.length;
		for(int i=0;i<l;i++)
			System.out.print(col[i]+" ");
		System.out.println();
	}
	public boolean graphcolorutil(int graph[][],int m,int col[],int v){
		if(v==V)
			return true;
		for(int c=1;c<=m;c++)
		{
			if(isSafe(graph,col,v,c))
			{
				col[v]=c;
				if(graphcolorutil(graph,m,col,v+1))
					return true;
				col[v]=0;
			}
		}
		return false;
	}
	public static void main(String args[]){
		m_coloring mc=new m_coloring();
		int graph[][] = {{0, 1, 1, 1},
	            {1, 0, 1, 0},
	            {1, 1, 0, 1},
	            {1, 0, 1, 0},
	        };
	        int m = 3; // Number of colors
	        mc.graphcolor(graph, m);
	}
}