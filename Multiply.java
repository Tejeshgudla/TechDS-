import java.util.Scanner;  
public class Multiply
{  
public static void main(String args[])  
{  
int x, y, mul;  
Scanner sc = new Scanner(System.in);  
System.out.print("Enter the first number: ");  
x = sc.nextInt();  
System.out.print("Enter the second number: ");  
y = sc.nextInt();  
mul = mul(x, y);  
System.out.println("The mul of two numbers x and y is: " + mul);  
}  
//method that calculates the mul  
public static int mul(int a, int b)  
{  
int mul = a * b;  
return mul;  
}  
}  