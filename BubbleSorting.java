import java.util.*;

class BubbleSorting {
    public static void sort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
   
    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    public static void main(String args[]) {
        //Take input
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.println("Enter values :");
            arr[i] = sc.nextInt();
        }
        
        System.out.println("Array before sorting : ");
        printArray(arr);
        //sorting
        sort(arr);
        System.out.println("Array after sorting : ");
        printArray(arr);
    }
}