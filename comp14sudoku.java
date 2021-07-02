import java.util.Arrays;
import java.util.Scanner;

class Solution {
    public static void solveSudoku(char[][] board) {
        
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

        Solution.solveSudoku(table);

        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                System.out.print(table[i][j]+" ");
            }
            System.out.println();
        } 
    }
}