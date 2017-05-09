package backtracking;
import java.io.*;
class n_queen{
	static int N;
	public boolean isafe(int board[][],int row,int col)
	{
		for(int i=0;i<col;i++)
			if(board[row][i]==1)
				return false;
		for(int i=row,j=col;i>=0 && j>=0;i--,j--)
			if(board[i][j]==1)
				return false;
		for(int i=row,j=col;i<N && j>=0;i++,j--)
			if(board[i][j]==1)
				return false;
		return true;
	}
	public boolean queen(int board[][],int col){
		if(col>=N)
			return true;
		for(int i=0;i<N;i++)
		{
			if(isafe(board,i,col))
			{
				board[i][col]=1;
				if(queen(board,col+1))
					return true;
				board[i][col]=0;
			}
		}
		return false;
	}
	public void printqueen(int board[][]){
		for(int i=0;i<N;i++){
			for(int j=0;j<N;j++)
				System.out.print(board[i][j]+" ");
			System.out.println();
		}
	}
	public static void main(String args[]) throws IOException{
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		N=Integer.parseInt(bf.readLine());
		n_queen nq=new n_queen();
		int board[][]=new int[N][N];
		for(int i=0;i<N;i++)
			for(int j=0;j<N;j++)
				board[i][j]=0;
		if(nq.queen(board, 0))
			nq.printqueen(board);
		else
			System.out.println("Pattern Not possible");
	}
}