public class Sudoku_Solver {
	public static void main(String[] args) {
		int[][] boarod = {{8,0,0,1,0,0,0,7,0},
				          {0,2,0,0,4,0,8,0,0},
				          {0,6,0,7,0,0,0,0,0},
				          {0,0,0,4,7,0,9,0,8},
				          {2,4,0,0,8,0,0,0,0},
				          {0,3,8,0,0,0,0,0,5},
				          {0,8,0,6,0,4,1,0,0},
				          {9,0,0,0,0,7,2,0,4},
				          {0,0,5,8,1,0,0,0,6}};
		showGrid(boarod);
		solve(boarod);
		System.out.println("______________________________________");
		System.out.println("Solution: ");
		showGrid(boarod);
	}
	
	public static void showGrid(int[][] boarod) {
		for(int i = 0; i < boarod.length; i++) {
			if(i % 3 == 0 && i != 0) {
				System.out.println("_______________________________");
			}
			for(int j = 0; j < boarod[0].length; j++) {
				if(j % 3 == 0 && j != 0) {
					System.out.print(" | ");
				}
				if(j == 8) {
					System.out.println(boarod[i][j]);
				} else {
					System.out.print(boarod[i][j] + "  ");
				}
			}
		}
	
	}
	
	public static int[] findEmpty(int[][] boarod) {
		int[] arr = new int[2];
		for(int i = 0; i < boarod.length; i++) {
			for(int j = 0; j < boarod[i].length; j++) {
				if(boarod[i][j] == 0) {
					
					arr[0] = i;
					arr[1] = j;
					return arr;
				}
			}
		}
		return null;
	}
	
	public static boolean valid(int[][] boarod, int num, int[] pos) {
		// check the rows
		for(int i = 0; i < boarod[0].length; i++) {
			if(boarod[pos[0]][i] == num && pos[1] != i)
				return false;
		}
		// check the cols.
		for(int i = 0; i < boarod.length; i++) {
			if(boarod[i][pos[1]] == num && pos[0] != i)
				return false;
		}
		
		// check boxs
		int box_x = pos[1]/3;
		int box_y = pos[0]/3;
		
		for(int i = box_y*3; i < box_y*3+3; i++) {
			for(int j = box_x*3; j < box_x*3+3; j++) {
				if(boarod[i][j] == num && pos[0]!= i && pos[1] != j) {
					return false;
				}
			}
		}
		
		return true;
	}
	
	public static boolean solve(int[][] boarod) {
		int row = -1, col = -1;
		int[] find = findEmpty(boarod);
		if(find == null) {
			return true;
		} else {
			row = find[0];
			col = find[1];
		}
		
		for(int i = 1; i <= 9; i++) {
			int[] arr = {row, col};
			if(valid(boarod, i, arr)) {
				boarod[row][col] = i;
				if(solve(boarod)) {
					return true;
				}
				boarod[row][col] = 0;
			}
		}
		return false;
	}
	
}