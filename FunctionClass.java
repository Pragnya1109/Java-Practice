import java.util.*;

public class FunctionClass {

    // ---------------------PRINT MY NAME-------------------------
    // public static void printMyName(String name) {
    //     System.out.println(name);
    //     return;
    // }

    // public static void main(String args[]) {
    //     Scanner sc = new Scanner(System.in);
    //     String name = sc.next();
    //     printMyName(name);
    // }
    // ---------------------ADD 2 NUMBERS AND RETURN SUM---------------------
    // public static int addSum(int a, int b) {
    //     return a + b;
    // }

    // public static void main(String args[]) {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("Enter the number1 and number2 :");
    //     int a = sc.nextInt();
    //     int b = sc.nextInt();
    //     int result = addSum(a, b);
    //     System.out.println(result);
    // }

    // ----------------------- MULTIPLY 2 NUMBERS ---------------------------------
    // public static int multiplyNum(int a, int b) {
    //     return a * b;
    // }

    // public static void main(String args[]) {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("Enter the number1 and number2 :");
    //     int a = sc.nextInt();
    //     int b = sc.nextInt();
    //     int result = multiplyNum(a, b);
    //     System.out.println(result);
    // }
    // ---------------------------FACTORIAL OF A NUMBER ------------------------------
    public static void printFactorial(int n) {
        int factorial = 1;
        for (int i = n; i >= 1; i--) {
            factorial = factorial * i;
        }
        System.out.println(factorial);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num :");
        int n = sc.nextInt();
        printFactorial(n);
    }

}
