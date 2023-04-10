import java.util.Scanner;

public class ArraySearchExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input the size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        
        int[] arr = new int[size];
        
        // Input the elements of the array
        System.out.print("Enter the elements of the array: ");
        for(int i=0; i<size; i++) {
            arr[i] = scanner.nextInt();
        }
        
        // Input the element to be searched
        System.out.print("Enter the element to be searched: ");
        int searchElement = scanner.nextInt();
        
        boolean found = false;
        
        // Search for the element in the array
        for(int i=0; i<size; i++) {
            if(arr[i] == searchElement) {
                found = true;
                break;
            }
        }
        
        // Print the result
        if(found) {
            System.out.println("Element found in the array.");
        } else {
            System.out.println("Element not found in the array.");
        }
        
        scanner.close();
    }
}
