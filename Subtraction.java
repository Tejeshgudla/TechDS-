import java.util.Scanner;  
public class Subtraction 
{  
public static void main(String args[])  
{  
int x, y, sub;  
Scanner sc = new Scanner(System.in);  
System.out.print("Enter the first number: ");  
x = sc.nextInt();  
System.out.print("Enter the second number: ");  
y = sc.nextInt();  
sub = sub1(x, y);  
System.out.println("The diff of two numbers x and y is: " + sub);  
}  
//method that calculates the sub  
public static int sub1(int a, int b)  
{  
int sub = a - b;  
return sub;  
}  
}  