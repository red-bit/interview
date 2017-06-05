package greedy;
class dijkstras{
	int V=9;
	public int minDist(int d[],boolean spset[]){
		int min=Integer.MAX_VALUE; int min_ind=-1;
		for(int i=0;i<V;i++)
		{
			if(spset[i]==false && min>d[i])
			{
				min=d[i];
				min_ind=i;
			}
		}
		return min_ind;
	}
	public void printpath(int d[]){
		for(int i=0;i<V;i++){
			System.out.println(i+" "+d[i]);
		}
	}
	public void dijkstras_sort(int graph[][],int src){
		int d[]=new int[V];
		boolean spset[]=new boolean[V];
		int min;
		for(int i=0;i<V;i++)
		{
			d[i]=Integer.MAX_VALUE;
			spset[i]=false;
		}
		d[0]=0;
		for(int i=0;i<V-1;i++){
			min=minDist(d,spset);
			spset[min]=true;
			for(int j=0;j<V;j++){
				if(!spset[j] && graph[min][j]!=0 && d[min]!=Integer.MAX_VALUE && d[min]+graph[min][j]<d[j])
					d[j]=d[min]+graph[min][j];
			}
		}
		printpath(d);
	}
	public static void main(String args[]){
		dijkstras dij =new dijkstras();
				 int graph[][] = new int[][]{{0, 4, 0, 0, 0, 0, 0, 8, 0},
                {4, 0, 8, 0, 0, 0, 0, 11, 0},
                {0, 8, 0, 7, 0, 4, 0, 0, 2},
                {0, 0, 7, 0, 9, 14, 0, 0, 0},
                {0, 0, 0, 9, 0, 10, 0, 0, 0},
                {0, 0, 4, 14, 10, 0, 2, 0, 0},
                {0, 0, 0, 0, 0, 2, 0, 1, 6},
                {8, 11, 0, 0, 0, 0, 1, 0, 7},
                {0, 0, 2, 0, 0, 0, 6, 7, 0}
               };
		dij.dijkstras_sort(graph, 0);
	}
}