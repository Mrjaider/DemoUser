package DemoUserMVC;

import java.util.*;

import javax.swing.JOptionPane;

public class UserView {

    public void printUserDetails(User user) {

        String message = "\nUser details: \n \n";
        message += "Username: " + user.getUsername() + "\n";
        message += "Password: " + user.getPassword() + "\n";
        message += "Email: " + user.getEmail() + "\n";

        JOptionPane.showMessageDialog(null, message);

    }

    public String getInput(String message) {

        return JOptionPane.showInputDialog(null, message);
    }

    public void showMessages(String message) {
        System.out.println(message);
    }

    public void displayMenu() {
        System.out.println("\nMenu:");
        System.out.println("1. Create an user");
        System.out.println("2. Consult an user");
        System.out.println("3. Modify an user");
        System.out.println("4. Delete an user");
        System.out.println("5. Exit");
        System.out.print("Choose an option: ");
    }

}
