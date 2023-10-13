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

    public String displayMenu() {

        String message = "";
        message += "\n welcome to the user management system \n";
        message += "1. Create user \n";
        message += "2. Consult user \n";
        message += "3. Modify user \n";
        message += "4. Delete user \n";
        message += "5. Exit \n";
        message += "Choose an option: \n";

        return JOptionPane.showInputDialog(null, message);

    }

}
