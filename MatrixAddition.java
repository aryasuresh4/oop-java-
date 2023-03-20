
import java.util.*;
class MatrixAddition
{
public static void main(String[]args)
{
int row,col;
Scanner sc=new Scanner(System.in);
System.out.print("Enter the number of rows for the matrices:");
row=sc.nextInt();
System.out.print("enter the number of columns for the matrices:");
col=sc.nextInt();
int[][] matrixA=new int[row][col];
int[][] matrixB=new int[row][col];
int[][] matrixSum=new int[row][col];
System.out.print("enter the elements for the matrix A:\n");
for(int i=0;i<row;i++)
{
for(int j=0;j<col;j++)
{
matrixA[i][j]=sc.nextInt();
}
}
System.out.println("\n");

System.out.print("enter the elements for the matrix B:\n");
for(int i=0;i<row;i++)
{
for(int j=0;j<col;j++)
{
matrixB[i][j]=sc.nextInt();
}
}
System.out.println("\n");
System.out.print("Matrix A is:\n");
for(int i=0;i<row;i++)
{
for(int j=0;j<col;j++)
{
System.out.print(matrixA[i][j]+" ");
}
System.out.println("\n");
}
System.out.print("Matrix B is:\n");
for(int i=0;i<row;i++)
{
for(int j=0;j<col;j++)
{
System.out.print(matrixB[i][j]+" ");
}
System.out.println("\n");
}
for(int i=0;i<row;i++)
{
for(int j=0;j<col;j++)
{
matrixSum[i][j]=matrixA[i][j]+matrixB[i][j];
}
}
System.out.print("Resultant of the matrix addition is:\n");
for(int i=0;i<row;i++)
{
for(int j=0;j<col;j++)
{
System.out.print(matrixSum[i][j]+" ");
}
System.out.println("\n");
}
}
}

//
Enter the number of rows for the matrices:3
enter the number of columns for the matrices:3
enter the elements for the matrix A:
5
2
7
3
4
7
9
1
8


enter the elements for the matrix B:
1
2
5
4
8
0
9
7
10


Matrix A is:
5 2 7 

3 4 7 

9 1 8 

Matrix B is:
1 2 5 

4 8 0 

9 7 10 

Resultant of the matrix addition is:
6 4 12 

7 12 7 

18 8 18 
