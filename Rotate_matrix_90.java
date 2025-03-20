import java.util.Scanner;

public class Rotate_matrix_90 {
    
    public static void rotate_Matrix(int[][] matrix, int n) {
        //transpose
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {  
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        
        //reverse
        for(int i=0;i<n;i++)
        {
          int left=0,right=n-1;
          
          while(left<right)
          {
              int temp=matrix[i][left];
              matrix[i][left]=matrix[i][right];
              matrix[i][right]=temp;
              
              left++;
              right--;
          }
          
        }
        
    }

    public static void printMatrix(int[][] matrix, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Size of matrix: ");
        int n = sc.nextInt();

        int[][] matrix = new int[n][n];

        System.out.println("Enter matrix elements:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Original Matrix:");
        printMatrix(matrix, n);

        rotate_Matrix(matrix, n);

        System.out.println("Transposed Matrix:");
        printMatrix(matrix, n);

        sc.close();
    }
}
