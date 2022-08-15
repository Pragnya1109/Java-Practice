import java.util.*;

public class ArrayQuestions {
    public static void main(String args[]) {

        // ---------------------------------Take an array of names as input from the
        // user and print them on screen

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the size : ");
        // int size = sc.nextInt();
        // String names[] = new String[size];

        // //input
        // for (int i = 0; i < size; i++) {
        // System.out.println("Enter the values :");
        // names[i] = sc.next();
        // }
        // // output
        // for (int i = 0; i < names.length; i++) {
        // System.out.println("Name "+ (i+1) + " is : "+ names[i]);
        // }

        // -----------------------------Find maximum and minimum number in an array of
        // integers---------------------
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the size :");
        // int size = sc.nextInt();
        // int numbers[] = new int[size];
        // //input
        // for (int i = 0; i < size; i++) {
        // System.out.println("Enter the values :");
        // numbers[i] = sc.nextInt();
        // }
        // int max = Integer.MIN_VALUE;
        // int min = Integer.MAX_VALUE;
        // for (int i = 0; i < numbers.length; i++) {
        // if (numbers[i] < min) {
        // min = numbers[i];
        // }
        // if (numbers[i] > max) {
        // max = numbers[i];
        // }
        // }
        // System.out.println("Largest number :"+max);
        // System.out.println("Smallest number :" + min);

        // -------------------------Take an array of numbers as input and check if it is
        // an array sorted in ascending order
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the size :");
        // int size = sc.nextInt();
        // int numbers[] = new int[size];
        // //input
        // for (int i = 0; i < size; i++) {
        // System.out.println("Enter the values :");
        // numbers[i] = sc.nextInt();
        // }
        // boolean isAscending = true;

        // for (int i = 0; i < numbers.length - 1; i++) {
        // if (numbers[i] > numbers[i + 1]) {
        // isAscending = false;
        // }
        // if (isAscending) {
        // System.out.println("Sorted");
        // } else {
        // System.out.println("Unsorted");
        // }
        // }

        // ---------------------------------------------2D
        // ARRAYS------------------------------------------------

        // -----------------------------Taking array as input and printing its elements-----------------------
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter rows and columns : ");
        // int rows = sc.nextInt();
        // int cols = sc.nextInt();
        // int[][] numbers = new int[rows][cols];
        // //input rows
        // System.out.println("Enter the number of elements : ");
        // for (int i = 0; i <rows; i++) {
        // //input cols
        // for (int j = 0; j < cols; j++) {
        // numbers[i][j] = sc.nextInt();
        // }
        // }
        // //display
        // System.out.println("The desired array is : ");
        // for (int i = 0; i < rows; i++) {
        // for (int j = 0; j < cols; j++) {
        // System.out.print(numbers[i][j] + " ");
        // }
        // System.out.println();
        // }

        // ----------------------------------------Searching for an element x in a matrix----------------
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter rows and columns : ");
        // int rows = sc.nextInt();
        // int cols = sc.nextInt();
        // int[][] numbers = new int[rows][cols];
        // // input rows
        // System.out.println("Enter the number of elements : ");
        // for (int i = 0; i < rows; i++) {
        //     // input cols
        //     for (int j = 0; j < cols; j++) {
        //         numbers[i][j] = sc.nextInt();
        //     }
        // }
        // System.out.println("Enter the element to be found : ");
        // int x = sc.nextInt();
        // // display
        // System.out.println("The desired array is : ");
        // for (int i = 0; i < rows; i++) {
        //     for (int j = 0; j < cols; j++) {
        //         if (numbers[i][j] == x) {
        //             System.out.print("x found at location (" +i+", "+j+")");
        //         }
        //     }
        //     System.out.println();
        // }

    
        // ------------------------------------Printing the spiral order matrix--------------------------
    //   Scanner sc = new Scanner(System.in);
    //   int n = sc.nextInt();
    //   int m = sc.nextInt();
 
    //   int matrix[][] = new int[n][m];
    //   for (int i = 0; i < n; i++) {
    //       for (int j = 0; j < m; j++) {
    //           matrix[i][j] = sc.nextInt();
    //       }
    //   }
      
    //   System.out.println("The desired array is : ");
    //   for (int i = 0; i < n; i++) {
    //     for (int j = 0; j < m; j++) {
    //         System.out.print(matrix[i][j] + " ");
    //   }
    //   System.out.println();
    //   }
    //   System.out.println();
    //   System.out.println("The Spiral Order Matrix is : ");
    //   int rowStart = 0;
    //    int rowEnd = n-1;
    //   int colStart = 0;
    //   int colEnd = m-1;
 
    //   //To print spiral order matrix
    //   while(rowStart <= rowEnd && colStart <= colEnd) {
    //       //1
    //       for(int col=colStart; col<=colEnd; col++) {
    //           System.out.print(matrix[rowStart][col] + " ");
    //       }
    //       rowStart++;
 
    //       //2
    //       for(int row=rowStart; row<=rowEnd; row++) {
    //           System.out.print(matrix[row][colEnd] +" ");
    //       }
    //       colEnd--;
 
    //       //3
    //       for(int col=colEnd; col>=colStart; col--) {
    //           System.out.print(matrix[rowEnd][col] + " ");
    //       }
    //       rowEnd--;
 
    //       //4
    //       for(int row=rowEnd; row>=rowStart; row--) {
    //           System.out.print(matrix[row][colStart] + " ");
    //       }
    //       colStart++;
 
    //       System.out.println();
    //   }

    // --------------------------------------------Print transpose of a matrix-----------------------
    System.out.println("Enter the rows and columns : ");
    Scanner sc = new Scanner(System.in);
    int row = sc.nextInt();
    int col = sc.nextInt();
    int array[][] = new int[row][col];
    System.out.println("Enter the matrix : ");
    for (int i = 0; i < row; i++) {
        for (int j = 0; j < col; j++) {
            array[i][j] = sc.nextInt();
            System.out.println(" ");
        }
    }
    System.out.println("Matrix before transpose : ");
    for (int i = 0; i < row; i++) {
        for (int j = 0; j < col; j++) {
            System.out.print(array[i][j] + " ");
        }
        System.out.println();
    }
    System.out.println("After transpose : ");
    for (int i = 0; i < col; i++) {
        for (int j = 0; j < row; j++) {
            System.out.print(array[j][i] + " ");
        }
        System.out.println();
    }
   }
}
