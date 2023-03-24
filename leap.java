
 
import java.util.Scanner;
 
public class leap {
 
    public static void main(String[] args) {
 
        int startYear, endYear, i;
 
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Start Year:");
        startYear = in.nextInt();

        System.out.print("Enter the End Year:");
        endYear = in.nextInt();
 
       
        System.out.println("Leap years:");
 
	
        for (i = startYear; i <= endYear; i++)
	 {
            if ( (0 == i % 4) && (0 != i % 100) || (0 == i % 400) ){
               System.out.println(i);
            }
        }
    }
}
//
Enter the Start Year:2000
Enter the End Year:2040
Leap years:
2000
2004
2008
2012
2016
2020
2024
2028
2032
2036
2040

