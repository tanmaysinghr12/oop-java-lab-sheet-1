import java.util.Scanner;
public class UserInfo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt for name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // Prompt for age
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        displayUserInfo(name, age);

        scanner.close();
    }

    public static void displayUserInfo(String name, int age) {
        System.out.println("Hello " + name + ", you are " + age + " years old.");
    }
}