package matriks;

import java.util.Scanner;

public class contoh1 {
    public static void main(String[] args){
        System.out.println("Please enter the rows in the matrix");
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        System.out.println("Please enter the columns in the matrix");
        int column = sc.nextInt();

        int[][] first = new int[row][column];
        int [][] second = new int[row][column];

        for (int r = 0; r < row; r++) {
            for (int c = 0; c < column; c++) {
                System.out.println("Enter an integer for the first matrix:");
                first[r][c] = sc.nextInt();
        }
    }
         for (int r = 0; r < row; r++) {
        for (int c = 0; c < column; c++){
              System.out.println("Enter Secondinteger"); 
              second [r] [c] = sc.nextInt();
            
         }
        }
        //close scanner bang
        sc.close();

        // tampilin matrix nya
        System.out.println("First matrix:\n");
        print2dArray(first);

        System.out.println("Second matrix:\n");
        print2dArray(second);   

        //hasil matrix
        sum(first, second);
      }
      public static void sum(int[][] first, int[][]second){
        int row= first.length;
        int column=first[0].length;
        int[][] sum = new int[row][column];
        
        for (int r = 0; r < row; r++){
            for(int c = 0; c< column; c++){
                sum[r][c] = first[r][c] + second[r][c];
            }
        }
        System.out.println("\nSum of matrix:\n");
        print2dArray(sum);

      }

        public static void min(int[][] first, int[][]second){
        int row= first.length;
        int column=first[0].length;
        int[][] min = new int[row][column];
        
        for (int r = 0; r < row; r++){
            for(int c = 0; c< column; c++){
                min[r][c] = first[r][c] - second[r][c];
            }
        }
        System.out.println("\nmin of matrix:\n");
        print2dArray(min);

      }
      public static void print2dArray(int[][] matrix){
        for (int r = 0; r < matrix.length; r++){
            for (int c = 0; c < matrix[0].length; c++){
                System.out.print(matrix[r][c] + "\t");
            }
            System.out.println();
        }
      }
   
}


