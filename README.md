# Sudoku Solver
This project solve the most difficult Sudoku puzzles using Backtracking algorithm to reduce the time used to solve it.
In the future 

# Installation
This project is written in java, so be sure that Java SE installed in your device.

# Usage
1- In the main method we had 2D array (9*9) representing the puzzle numbers, which zeros representing the empty spaces in the puzzle.
Note: you can change the Matrix to any puzzle that you want but be sure that you representing the empty spaces with zeros.

2- We called showGrid method and passed on it the 2D array to visualize the puzzle.

3- Then we called solve method and passed on it the 2D array to solve it.

4- Then we called showGrid method and passed on it the 2D array to visualize the puzzle with its solution.

# Screenshots
   ![Screenshot (7)](https://user-images.githubusercontent.com/88712877/132352897-882d62a5-81f9-49b2-9de8-f8b2b6ba3c74.png)

Screenshot for the output result.

# Extra Tests
1- puzzle:

boarod = {{3, 0, 6, 5, 0, 8, 4, 0, 0}, 
         {5, 2, 0, 0, 0, 0, 0, 0, 0},
         {0, 8, 7, 0, 0, 0, 0, 3, 1},
         {0, 0, 3, 0, 1, 0, 0, 8, 0},
         {9, 0, 0, 8, 6, 3, 0, 0, 5}, 
         {0, 5, 0, 0, 9, 0, 6, 0, 0},
         {1, 3, 0, 0, 0, 0, 2, 5, 0},
         {0, 0, 0, 0, 0, 0, 0, 7, 4},
         {0, 0, 5, 2, 0, 6, 3, 0, 0}};
         
solution:

          3    1    6     | 5    7    8     | 4    9    2
          5    2    9     | 1    3    4     | 7    6    8
          4    8    7     | 6    2    9     | 5    3    1
          ________________________________________________
          2    6    3     | 4    1    5     | 9    8    7
          9    7    4     | 8    6    3     | 1    2    5
          8    5    1     | 7    9    2     | 6    4    3
          ________________________________________________
          1    3    8     | 9    4    7     | 2    5    6
          6    9    2     | 3    5    1     | 8    7    4
          7    4    5     | 2    8    6     | 3    1    9
      
2- puzzle:

boarod = {{ 3, 1, 6, 5, 7, 8, 4, 9, 2 },
         { 5, 2, 9, 1, 3, 4, 7, 6, 8 },
         { 4, 8, 7, 6, 2, 9, 5, 3, 1 },
         { 2, 6, 3, 0, 1, 5, 9, 8, 7 },
         { 9, 7, 4, 8, 6, 0, 1, 2, 5 },
         { 8, 5, 1, 7, 9, 2, 6, 4, 3 },
         { 1, 3, 8, 0, 4, 7, 2, 0, 6 },
         { 6, 9, 2, 3, 5, 1, 8, 7, 4 },
         { 7, 4, 5, 0, 8, 6, 3, 1, 0 }};
         
solution:

           3    1    6     | 5    7    8     | 4    9    2
           5    2    9     | 1    3    4     | 7    6    8
           4    8    7     | 6    2    9     | 5    3    1
           ________________________________________________
           2    6    3     | 4    1    5     | 9    8    7
           9    7    4     | 8    6    3     | 1    2    5
           8    5    1     | 7    9    2     | 6    4    3
           ________________________________________________
           1    3    8     | 9    4    7     | 2    5    6
           6    9    2     | 3    5    1     | 8    7    4
           7    4    5     | 2    8    6     | 3    1    9
           
 # License
 MIT Licence
