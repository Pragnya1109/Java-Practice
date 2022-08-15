import java.util.*;

public class Arrays {
    public static void main(String args[]) {
        // int [] marks = new int[3];
        // marks[0]=97;
        // marks[1]=85;
        // marks[2]=57;

        // (OR)

        // int marks[] = { 97, 85, 57 };

        // System.out.println(marks); --------- Garbage value
        // System.out.println(marks[0]); //-------- 97
        // values of all the elements in array
        // for (int i = 0; i < 3; i++) {
        //     System.out.println(marks[i]);
        // }

        // for taking input from the users , we can have =
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int size = sc.nextInt();
        int numbers[] = new int[size];
        // -----------INPUT-----------------
        for (int i = 0; i < size; i++) {
            System.out.println("Enter the values :");
            numbers[i] = sc.nextInt();
        }
        // ------------OUTPUT--------------
        for (int i = 0; i < 3; i++) {
            System.out.println(numbers[i]);  //---presence of only this loop will automatically initialize with int =0 ,float = 0.0 like this
        }
        
    }
}