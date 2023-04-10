import java.util.Scanner;
public class Employee
  {
    int eNumber;
    String eName;
    double eSalary;
    public void getdetails()
    {
        System.out.println("\nEnter the Employee details");
        Scanner sc = new Scanner(System.in);
        System.out.println("Employee number : ");
        eNumber=sc.nextInt();
        System.out.println("Name : ");
        sc.nextLine();
        eName=sc.nextLine();
        System.out.println("Salary : ");
        eSalary=sc.nextDouble(); 
    }
    void display(){
        System.out.println("Empolyee No :"+eNumber);
        System.out.println("Name :"+eName);
        System.out.println("Salary Amount : "+eSalary+"\n");
    }
    public static void main(String[] args) 
    {
        System.out.println("\nEnter the No. of Employee's");
        Scanner sc1 = new Scanner(System.in);
        int num = sc1.nextInt();
        Employee arr[]=new Employee[num];
        for(int i =0;i<num;i++){
               arr[i]=new Employee();
               arr[i].getdetails();

        }
        System.out.println("\nInformations of all the employee's");
        for(int i=0;i<num;i++){
            arr[i].display();
     }
     boolean state = false;
     System.out.println("\nEnter the Employee Number to get details of a employee");
     int num2= sc1.nextInt();
     for(int i=0;i<num;i++){
         if(arr[i].eNumber==num2){
        System.out.println("\nEmployee details");
         arr[i].display();
         }
        }    
    }
}

//
Enter the No. of Employee's
3  

Enter the Employee details
Employee number : 
101
Name : 
Arya
Salary : 
25000

Enter the Employee details
Employee number : 
102
Name : 
Anju
Salary : 
30000

Enter the Employee details
Employee number : 
103
Name : 
Megha
Salary : 
50000

Informations of all the employee's
Empolyee No :101
Name :Arya
Salary Amount : 25000.0

Empolyee No :102
Name :Anju
Salary Amount : 30000.0

Empolyee No :103
Name :Megha
Salary Amount : 50000.0


Enter the Employee Number to get details of a employee
103

Employee details
Empolyee No :103
Name :Megha
Salary Amount : 50000.0


