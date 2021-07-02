import java.util.Scanner;

class Solution {
    public void solveSudoku(char[][] board) {
        solve(board);
    }
    
    private boolean solve(char[][] board){
        
        for(int i = 0;i<9;i++){
            for(int j = 0;j<9;j++){
                if(board[i][j] == '.'){
                    for(char k ='1';k<='9';k++){
                        if(isValid(board,i,j,k)){
                            board[i][j] = k;
                            if(solve(board) == true)
                                return true;
                            else
                                board[i][j] = '.';
                        }
                    }
                    return false; //not able to place any num from 1-9 at i,j 
                }
            }
        }
        return true;
    }
    
    private boolean isValid(char [][] board,int row,int col,char val){//o(n)
        //check entire col,row
        for(int i = 0;i<9;i++){
            if(board[i][col] == val) return false;
            if(board[row][i] == val) return false;
        }  
        
        //getting the top left corner of 3 cross 3 matrix
        //row/3 & col/3 gives u exact subarray box , we multiply these by 3
        //so that we can get the top left corner of that box(i.e box starting)
        int rowst = (row/3) * 3;
        int colst = (col/3) * 3;
        
        //checking the 3 cross 3 submatrix
        for(int i = 0;i<3;i++){
            for(int j = 0;j<3;j++){
                if(board[rowst + i][colst + j] == val) return false;
            }
        }
        return true;
    }
}

public class comp14sudoku{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char table[][] = new char[9][9];
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                table[i][j] = sc.next().charAt(0);
            }
        }

        System.out.println("\n");

        Solution obj = new Solution();
        obj.solveSudoku(table);

        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                System.out.print(table[i][j]+" ");
            }
            System.out.println();
        } 
    }
}

// 5 3 . . 7 . . . .
// 6 . . 1 9 5 . . .
// . 9 8 . . . . 6 .
// 8 . . . 6 . . . 3
// 4 . . 8 . 3 . . 1
// 7 . . . 2 . . . 6
// . 6 . . . . 2 8 .
// . . . 4 1 9 . . 5
// . . . . 8 . . 7 9