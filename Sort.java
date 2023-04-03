import java.util.Arrays;
import java.util.Scanner;
public class Sort{
public static void main(String args[]) {
Scanner scanner = new Scanner(System.in);
System.out.println("Input String Value which should be sorted : ");
String inputString = scanner.nextLine();
char arrayOfCharacters[] = inputString.toCharArray();
Arrays.sort(arrayOfCharacters); 
String sortedString = new String(arrayOfCharacters); 

System.out.println("After Sorting :  " + sortedString);
}
}
