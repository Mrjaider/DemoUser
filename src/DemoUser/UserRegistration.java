package DemoUser;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class UserRegistration {

    private List<String> usernames = new ArrayList<>();
    private List<String> passwords = new ArrayList<>();
    private List<String> emails = new ArrayList<>();

    private Scanner scanner = new Scanner(System.in);

    public void displayMenu() {
        boolean KeepRunning = true;

        while (KeepRunning) {
            System.out.println("\nMenu:");
            System.out.println("1. Create an user");
            System.out.println("2. consult an user");
            System.out.println("3. Modify an user");
            System.out.println("4. Delete an user");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            String option = scanner.nextLine();

            switch (option) {
                case "1":
                    createUser();
                    break;
                case "2":
                    consultUser();
                    break;
                case "3":
                    modifyUser();
                    break;
                case "4":
                    deleteUser();
                    break;
                case "5":
                    KeepRunning = false;
                    break;
                default:
                    System.out.println("Invalid option");

            }

        }

    }

    public void createUser() {
        System.out.println("Introduce the username: ");
        usernames.add(scanner.nextLine());

        System.out.println("Introduce the password: ");
        passwords.add(scanner.nextLine());

        System.out.println("Introduce the email: ");
        emails.add(scanner.nextLine());

        System.out.println("User created successfully");
    }

    private int getUserIndexByUsername(String username) {
        return usernames.indexOf(username);
    }

    private void consultUser() {
        System.out.println("Introduce the usarneme to consult: ");
        int index = getUserIndexByUsername(scanner.nextLine());

        if (index != -1) {
            System.out.println("Username: " + usernames.get(index) + "Email: " + emails.get(index));

        } else {
            System.out.println("User not found");

        }

    }

    private void modifyUser() {
        System.out.println("Introduce the username to modify: ");
        int index = getUserIndexByUsername(scanner.nextLine());

        if (index != -1) {
            System.out.println("Introduce the new email (current: " + emails.get(index) + "): ");
            emails.set(index, scanner.nextLine());
            System.out.println("User modified successfully");

        } else {
            System.out.println("User not found");

        }
    }

    private void deleteUser() {
        System.out.println("Introduce the username to delete: ");
        int index = getUserIndexByUsername(scanner.nextLine());

        if (index != -1) {
            usernames.remove(index);
            passwords.remove(index);
            emails.remove(index);
            System.out.println("User deleted successfully");

        } else {
            System.out.println("User not found");

        }
    }

    public static void main(String[] args) {
        new UserRegistration().displayMenu();

    }
}
