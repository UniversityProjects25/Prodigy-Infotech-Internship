
public class Task_4_Sudoku_Solver {
        private static final int size = 9;
        public static boolean solveSudoku(int[][] grid){
                int row,col;
                if(!findEmptyLocation(grid)){
                        return true;
                }
                int[] emptyCell = findEmptyLocationIndex(grid);
                row =emptyCell[0];
                col =emptyCell[1];

                for(int num=1;num<=size;num++){
                        if(isSafe(grid,row,col,num)){
                                grid[row][col]=num;

                        if(solveSudoku(grid)){
                                return true;
                        }
                        grid[row][col]=0;

                        }

                }
        return false;
        }
        public static boolean findEmptyLocation(int[][] grid) {
                for (int row = 0; row < size; row++) {
                        for (int col = 0; col < size; col++) {
                                if (grid[row][col] == 0) {
                                        return true;
                                }
                        }
                }
                return false;
        }
        public static int[] findEmptyLocationIndex(int[][] grid){
                int[] indexes=new int[2];
                for(int row=0;row<size;row++){
                        for(int col =0;col<size;col++){
                                if(grid[row][col]==0){
                                        indexes[0]=row;
                                        indexes[1]=col;
                                        return indexes;
                                }
                        }
                }
                return null;
        }

        public static boolean isSafe(int[][] grid, int row, int col, int num){
                for(int x=0; x<size; x++){
                        if(grid[row][x]==num){
                                return false;
                        }
                }
                for(int y=0; y<size; y++){
                        if(grid[y][col]==num){
                                return false;
                        }
                }
                int startRow = row -row%3;
                int startCol = col- col%3;
                for(int i=0;i<3;i++){
                        for(int j=0;j<3;j++){
                                if(grid[i+startRow][j+startCol]==num){
                                return false;
                                }
                        }
                }

                return true;


        }
        public static void printGrid(int[][] grid){
                for(int i=0;i<size;i++){
                        for(int j=0;j<size;j++){
                                System.out.print(grid[i][j] + " ");
                        }
                        System.out.println();
                }
        }

        public static void main(String[] args) {

                int[][] puzzle = {
                        {3, 0, 6, 5, 0, 8, 4, 0, 0},
                        {5, 2, 0, 0, 0, 0, 0, 0, 0},
                        {0, 8, 7, 0, 0, 0, 0, 3, 1},
                        {0, 0, 3, 0, 1, 0, 0, 8, 0},
                        {9, 0, 0, 8, 6, 3, 0, 0, 5},
                        {0, 5, 0, 0, 9, 0, 6, 0, 0},
                        {1, 3, 0, 0, 0, 0, 2, 5, 0},
                        {0, 0, 0, 0, 0, 0, 0, 7, 4},
                        {0, 0, 5, 2, 0, 6, 3, 0, 0}
                };

                if(solveSudoku(puzzle)){
                        System.out.println("Sudoku Solved Successfully");
                        printGrid(puzzle);
                }
                else{
                        printGrid(puzzle);
                }
        }



}
