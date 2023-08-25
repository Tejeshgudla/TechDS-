import java.util.Scanner;  
public class Division 
{  
public static void main(String args[])  
{  
int x, y, div;  
Scanner sc = new Scanner(System.in);  
System.out.print("Enter the first number: ");  
x = sc.nextInt();  
System.out.print("Enter the second number: ");  
y = sc.nextInt();  
div = div(x, y);  
System.out.println("The div of two numbers x and y is: " + div);  
}  
//method that calculates the div  
public static int div(int a, int b)  
{  
int div = a / b;  
return div;  
}  
}  