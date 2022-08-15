// * * * * *        QUESTION -1
// * * * * *
// * * * * *
// * * * * *

// * * * *          QUESTION -2
// *     * 
// *     * 
// * * * *

// *                QUESTION -3
// * * 
// * * * 
// * * * * 

// * * * *           QUESTION -4
// * * * 
// * * 
// *

//      *            QUESTION -5
//     **
//    ***
//   ****

// 1                 QUESTION -6
// 1 2
// 1 2 3
// 1 2 3 4
// 1 2 3 4 5

// 1 2 3 4 5          QUESTION -7
// 1 2 3 4
// 1 2 3
// 1 2
// 1

import java.util.*;

public class Patterns {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // ----------------------------ANSWER -1 ------------------------
        // int row, col;
        // System.out.println("Enter the number of rows and columns : ");
        // row= sc.nextInt();
        // col = sc.nextInt();
        // for (int i = 1; i <= row; i++) {
        //     for (int j = 1; j <= col; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // ----------------------------ANSWER -2---------------------------
        // int row, col;
        // System.out.println("Enter the no. of rows and columns : ");
        // row = sc.nextInt();
        // col = sc.nextInt();
        // for (int i = 1; i <= row; i++) {
        //     for (int j = 1; j <= col; j++) {
        //         if (i == 1 || j == 1 || i == row || j == col) {
        //             System.out.print("*");
        //         } else {
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }

        // -----------------------------ANSWER -3--------------------------
        // int n;
        // System.out.println("Enter the no. :");
        // n = sc.nextInt();
        // for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // -------------------------------ANSWER -4 ------------------------
        // int n;
        // System.out.println("Enter the no. :");
        // n = sc.nextInt();
        // for (int i = n ; i >=1; i--) {
        //     for (int j = 1; j <=i; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // ---------------------------------ANSWER -5 --------------------------
        // int n;
        // System.out.println("Enter the no. :");
        // n = sc.nextInt();
        // for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <= n - i; j++) {
        //         System.out.print(" ");
        //     }
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // -----------------------------ANSWER - 6 ------------------------------
        // int n;
        // System.out.println("Enter the no. : ");
        // n = sc.nextInt();
        // for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print(i);
        //     }
        //     System.out.println();
        // }

        //-----------------------------ANSWER - 7 ---------------------------------
        int n;
        System.out.println("Enter the no. :");
        n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i+1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}