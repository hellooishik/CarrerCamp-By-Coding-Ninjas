package BackTracking;

public class RatInMaze {

	public static boolean Ratmaze(int maze[][]) {
		
		// TODO Auto-generated method stub
		int n = maze.length;
		int[][] path = new int [n][n];
		// Returning Function
		return MazeSolver(maze, 0, 0, path);

	}
	// The Main Function Calcuted
	// A NXN MATICS AS A 2D ARRAY
	// I FOR ROWS TRAVERSING
	// J FOR COLUM TRAVERSING
	// A PATH 2D ARRAY MATCIS FOR DECLARING THE PATH
	
	public static boolean MazeSolver(int maze[][], int i, int j, int path [][]) {
		// Cheking the Base Case
		// Checking Where I'm I
		// iF i Or J sHELL IS vALID Or not
		if(i < 0 || i>=maze.length || j<0 || j>= maze.length || maze[i][j] == 0 /*What is The mat is Empty */  || /*Stop Traversing the Return path */ path[i][j] == 1) {
			return false;
		}
		// Include The cell in current path
		path[i][j] = 1;
		// Destination cell
		
		if(i == maze.length -1 && j == maze.length - 1 ) {
			return true;
		}
		
		// Top Direction
		if (MazeSolver(maze, i - 1, j, path)) {
            return true;
        }
		
		// Right Direction

        if (MazeSolver(maze, i, j + 1, path)) {
            return true;
        }
        // Down Direction

        if (MazeSolver(maze, i + 1, j, path)) {
            return true;
        }
        // Left Direction

        if (MazeSolver(maze, i, j - 1, path)) {
            return true;
        }
        return false;
	}  
		// Driver Code
        public static void main(String args[] ){
        	int maze[][] = {{1,1,1},{1,1,0},{1,0,1}};
        	boolean pathPosible = Ratmaze(maze);
        	System.out.print(pathPosible);
        
	}

}
