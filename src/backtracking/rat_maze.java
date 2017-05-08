package backtracking;
class rat_maze{
	int N=4;
	public boolean safe(int maze[][],int i,int j){
		if(i>=0 && i<N &&j>=0 && j<N && maze[i][j]==1)
			return true;
		else
			return false;
	}
	public boolean solvemaze(int sol[][],int i,int j,int maze[][]){
		if(i==N-1 &&j==N-1)
		{
			sol[i][j]=1;
			return true;
		}
		if(safe(maze,i,j))
		{
			sol[i][j]=1;
			if(solvemaze(sol, i+1, j, maze))
				return true;
			if(solvemaze(sol, i, j+1, maze))
				return true;
			sol[i][j]=0;
			return false;
		}
		return false;
	}
	public void printmaze(int sol[][])
	{
		for(int i=0;i<N;i++)
		{
			for(int j=0;j<N;j++)
				System.out.print(sol[i][j]+" ");
			System.out.println();
		}
	}
	public static void main(String args[])
	{
		rat_maze rm= new rat_maze();
		int sol[][]={{0,0,0,0},{0,0,0,0},{0,0,0,0},{0,0,0,0}};
		int maze[][]={{1, 0, 0, 0},
	            {1, 1, 0, 1},
	            {0, 1, 0, 0},
	            {1, 1, 1, 1}
	        };
		if(rm.solvemaze(sol, 0, 0, maze))
			rm.printmaze(sol);
		else
			System.out.println("No path found");
			
	}
}