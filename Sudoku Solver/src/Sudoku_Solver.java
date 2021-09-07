public class Sudoku_Solver {
	public static void main(String[] args) {
		int[][] grid = {{8,0,0,1,0,0,0,7,0},
				          {0,2,0,0,4,0,8,0,0},
				          {0,6,0,7,0,0,0,0,0},
				          {0,0,0,4,7,0,9,0,8},
				          {2,4,0,0,8,0,0,0,0},
				          {0,3,8,0,0,0,0,0,5},
				          {0,8,0,6,0,4,1,0,0},
				          {9,0,0,0,0,7,2,0,4},
				          {0,0,5,8,1,0,0,0,6}};
		showGrid(grid);
		solve(grid);
		System.out.println("______________________________________");
		System.out.println("Solution: ");
		showGrid(grid);
	}
	
	public static void showGrid(int[][] grid) {
		for(int i = 0; i < grid.length; i++) {
			if(i % 3 == 0 && i != 0) {
				System.out.println("_______________________________");
			}
			for(int j = 0; j < grid[0].length; j++) {
				if(j % 3 == 0 && j != 0) {
					System.out.print(" | ");
				}
				if(j == 8) {
					System.out.println(grid[i][j]);
				} else {
					System.out.print(grid[i][j] + "  ");
				}
			}
		}
	
	}
	
	public static int[] findEmpty(int[][] grid) {
		int[] arr = new int[2];
		for(int i = 0; i < grid.length; i++) {
			for(int j = 0; j < grid[i].length; j++) {
				if(grid[i][j] == 0) {
					
					arr[0] = i;
					arr[1] = j;
					return arr;
				}
			}
		}
		return null;
	}
	
	public static boolean valid(int[][] grid, int num, int[] pos) {
		// check the rows
		for(int i = 0; i < grid[0].length; i++) {
			if(grid[pos[0]][i] == num && pos[1] != i)
				return false;
		}
		// check the cols.
		for(int i = 0; i < grid.length; i++) {
			if(grid[i][pos[1]] == num && pos[0] != i)
				return false;
		}
		
		// check boxs
		int box_x = pos[1]/3;
		int box_y = pos[0]/3;
		
		for(int i = box_y*3; i < box_y*3+3; i++) {
			for(int j = box_x*3; j < box_x*3+3; j++) {
				if(grid[i][j] == num && pos[0]!= i && pos[1] != j) {
					return false;
				}
			}
		}
		
		return true;
	}
	
	public static boolean solve(int[][] grid) {
		int row = -1, col = -1;
		int[] find = findEmpty(grid);
		if(find == null) {
			return true;
		} else {
			row = find[0];
			col = find[1];
		}
		
		for(int i = 1; i <= 9; i++) {
			int[] arr = {row, col};
			if(valid(grid, i, arr)) {
				grid[row][col] = i;
				if(solve(grid)) {
					return true;
				}
				grid[row][col] = 0;
			}
		}
		return false;
	}
	
}
