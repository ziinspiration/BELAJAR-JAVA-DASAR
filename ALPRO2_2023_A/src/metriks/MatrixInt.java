package metriks;

import java.util.Scanner;

public class MatrixInt {
    
  int row = 3;
    int column = 3;
    int[][] matrix = new int [row][column]; 

    void bacamatrix() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < row; i++){
            for (int j = 0; j < column; j++){
                System.out.print("Elemen ke: "+i+","+j+": ");
                matrix[i][j]=sc.nextInt();

            }
        }
    }

    void tampilMatrix(){
        for (int i=0; i< row;i++){
            for (int j = 0; j< column; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    int Get(int i, int j){
        return matrix[i][j];
    }

    void Set(int i, int j, int x){
        matrix[i][j]=x;
    }
   static void penjumlahanMatrix(MatrixInt A, MatrixInt B, MatrixInt C){
    int x, y;
        for (int i=0; i<A.row; i++){
            for (int j=0; j<A.column; j++){
                x=A.Get(i, j);//A[i][j]
                y=B.Get(i, j); //B[i][j]
                C.Set(i, j, x+y);// C[i][j] = x+y

            }
        }
    }

    static void penguranganMatrix(MatrixInt A, MatrixInt B, MatrixInt C){
    int x, y;
        for (int i=0; i<A.row; i++){
            for (int j=0; j<A.column; j++){
                x=A.Get(i, j);//A[i][j]
                y=B.Get(i, j); //B[i][j]
                C.Set(i, j, x-y);// C[i][j] = x+y

            }
        }
    }
    static void pembagianMatrix(MatrixInt A, MatrixInt B, MatrixInt C){
    int x, y;
        for (int i=0; i<A.row; i++){
            for (int j=0; j<A.column; j++){
                x=A.Get(i, j);//A[i][j]
                y=B.Get(i, j); //B[i][j]
                C.Set(i, j, x/y);// C[i][j] = x/y

            }
        }
    }
    static void perkalianMatrix(MatrixInt A, MatrixInt B, MatrixInt C){
    int x, y;
        for (int i=0; i<A.row; i++){
            for (int j=0; j<A.column; j++){
                x=A.Get(i, j);//A[i][j]
                y=B.Get(i, j); //B[i][j]
                C.Set(i, j, x*y);// C[i][j] = x*y

            }
        }
    }

    static boolean IsSama(MatrixInt A, MatrixInt B){
        boolean sama = true;
        int x,y;
        int i = 0, j;
        while ((i<A.row) && (sama==true)) {
                j=0;
            while ((j<A.column) && (sama==true)){
                x= A.Get(i, j);
                y=B.Get(i, j);
                if(x != y)
                sama = false;
                else
                    j++;
            }
            i++;
        }
        return sama;
    }

    void tampilDiagonal(){
        for (int i=0; i< row;i++){
          
                System.out.print(matrix[i][i]+" ");
            }
            System.out.println();
        }
    
    public static void main(String[] args){
        MatrixInt matrixA = new MatrixInt();
        MatrixInt matrixB = new MatrixInt();
        MatrixInt matrixC = new MatrixInt();

        matrixB.bacamatrix();
        matrixB.tampilMatrix();
        System.out.println("tampilDiagonal");
        
        matrixB.tampilDiagonal();
        matrixA.bacamatrix();
        matrixA.tampilMatrix();
        penjumlahanMatrix(matrixA, matrixB, matrixC);
        System.out.println("Hasil penjumlahan matrix");
        matrixC.tampilMatrix();
        penguranganMatrix(matrixA, matrixB, matrixC);
        System.out.println("Hasil pengurangan matrix");
        matrixC.tampilMatrix();
        pembagianMatrix(matrixA, matrixB, matrixC);
        System.out.println("Hasil pembagian matrix");
        matrixC.tampilMatrix();
        perkalianMatrix(matrixA, matrixB, matrixC);
        System.out.println("Hasil perkalian matrix");
        matrixC.tampilMatrix();

        boolean Sama = IsSama(matrixA, matrixB);
        System.out.println("Matrix A dan Matrix B sama adalah: "+Sama);
    }
    
}


