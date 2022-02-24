import java.util.Scanner;

public class multidimensionalArrays {

    static int multiplyMatrices(int[][] firstMatrix, int[][] secondMatrix, int row, int col) {
        int cell = 0;
        for (int i = 0; i < secondMatrix.length; i++) {
            cell += firstMatrix[row][i] * secondMatrix[i][col];
        }
        return cell;
    }
    static int[][] createMatrices(int rows, int columns)
    {
        int[][] matrix = new int[rows][columns];
        return matrix;
    }
    public static void main(String[] args) {

        //first matrix dimension
        Scanner keyboard=new Scanner(System.in);
        System.out.println("Enter number of rows in first matrix");
        int rows=keyboard.nextInt();
        System.out.println("Enter number of columns in first matrix");
        int columns=keyboard.nextInt();
        int[][] firstMatrix=createMatrices(rows,columns);

        System.out.println("Enter the values of your first matrix in order");
         for (int i=0;i<firstMatrix.length;i++) {
             for (int j = 0; j < firstMatrix[i].length; j++) {
                 firstMatrix[i][j] = keyboard.nextInt();
             }
         }

         //second matrix dimensions and values
        System.out.println("enter the dimensions of your second matrix");
        System.out.println("Enter number of rows in second matrix");
        int secondRows=keyboard.nextInt();
        System.out.println("Enter number of columns in second matrix");
        int secondColumns=keyboard.nextInt();
        int[][] secondMatrix=createMatrices(secondRows,secondColumns);
        System.out.println("Enter the values of your second matrix in order");
        for (int i=0;i<secondMatrix.length;i++) {
            for (int j = 0; j < secondMatrix[i].length; j++) {
                secondMatrix[i][j] = keyboard.nextInt();
            }
        }

        //i create new array for multiplication result
        int[][] result = new int[firstMatrix.length][secondMatrix[0].length];

        //comparing dimensions
       if(columns!=secondRows){
           System.out.println("dimensions doesn't match!");
           System.out.println("multiplication cannot be performed");
       }
       else if(columns==secondRows) {
           for (int row = 0; row < result.length; row++) {
               for (int col = 0; col < result[row].length; col++) {
                   result[row][col] = multiplyMatrices(firstMatrix, secondMatrix, row, col);
               }
           }
       }
         System.out.println("Multiplication result is : ");
        for (int i=0;i<result.length;i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.print("\n");
        }

    }
}
