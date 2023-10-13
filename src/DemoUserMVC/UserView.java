package DemoUserMVC;

import java.util.Scanner;

public class UserView {

    public void printUserDetails(User user) {
        System.out.println("\nUser details: ");
        System.out.println("Username: " + user.getUsername());
        System.out.println("Password: " + user.getPassword());
        System.out.println("Email: " + user.getEmail());

    }

    public String getInput(String message) {
        System.out.println(message);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public void showMessages(String message) {
        System.out.println(message);
    }

    public String displayMenu() {
        System.out.println("\nMenu:");
        System.out.println("1. Create an user");
        System.out.println("2. consult an user");
        System.out.println("3. Modify an user");
        System.out.println("4. Delete an user");
        System.out.println("5. Exit");
        System.out.print("Choose an option: ");
        return new Scanner(System.in).nextLine();
    }

}
