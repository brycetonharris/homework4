import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        String userInput;
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the string to be reversed! ");
        userInput = scanner.nextLine();

        String originalStr = userInput;
        String reversedStr = "";

        for (int i = 0; i < originalStr.length(); i++) {
        reversedStr = originalStr.charAt(i) + reversedStr;
        }

    System.out.println("Reversed string: "+ reversedStr);





        scanner.close();
    }
}
