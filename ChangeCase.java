import java.util.Scanner;

public class ChangeCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a paragraph:");
        String paragraph = scanner.nextLine();
        
        String changedParagraph = changeCase(paragraph);
        
        System.out.println("Paragraph with changed case:");
        System.out.println(changedParagraph);
    }
    
    public static String changeCase(String input) {
        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            
            if (Character.isUpperCase(c)) {
                result.append(Character.toLowerCase(c));
            } else if (Character.isLowerCase(c)) {
                result.append(Character.toUpperCase(c));
            } else {
                result.append(c);
            }
        }
        
        return result.toString();
    }
}
