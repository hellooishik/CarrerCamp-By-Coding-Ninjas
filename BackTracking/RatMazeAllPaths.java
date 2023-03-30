package BackTracking;

public class RatMazeAllPaths {
	static void ratInMaze(int maze[][], int n) {
		int path[][] = new int[maze.length][maze.length];
		solveMaze(maze, 0, 0, path, n);
	}
	// Implenting the Helpers Fun
	public static void solveMaze(int maze[][], int i, int j, int path [][], int n) {
		// Checking the base case
		if(i<0 || i>= n || j<0 || j>=n || maze[i][j] == 0 || path[i][j] == 1){
			return;
		}
		path[i][j] = 1;
		if(i == n-1 && j == n-1) {
			// Path Adjusting == Time Complexity 0(N) 
			// This Function will run from Zero to n-1 Direction
			for(int r = 0;r<n;r++)
			{
				for(int c = 0;c<n;c++)
				{
					System.out.print(path[r][c]+" ");
				}
				
			}
			// Stcututures That Need To be Defined
			// Time Complexity will run on O(n) and log(n)
			
			// Defining Out the Space Complexity
			// O(mn)
			//Reset Path
			path[i][j]=0;
            System.out.println();
            return;
		}
		// This Statement root is adjustable with most 0f the cases
		// Using the Recursion Statement
				//top
		solveMaze(maze,i-1,j,path,n);
				//down
		solveMaze(maze, i+1, j, path,n);
		        //left
		solveMaze(maze, i, j-1, path,n);
				//right
		solveMaze(maze,i,j+1,path,n);
				// Reset the Path	
				path[i][j]=0;
	}
}
