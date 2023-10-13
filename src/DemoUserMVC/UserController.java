package DemoUserMVC;

public class UserController {

    private UserModel model;
    private UserView view;

    public UserController(UserModel model, UserView view) {
        this.model = model;
        this.view = view;
    }

    public void run() {
        boolean KeepRunning = true;

        while (KeepRunning) {
            view.displayMenu();
            String option = view.displayMenu();

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
                    view.showMessages("Invalid option");

            }

        }
        view.showMessages("see you soon!");
    }

    private void createUser() {
        String username = view.getInput("Introduce the username: ");
        String password = view.getInput("Introduce the password: ");
        String email = view.getInput("Introduce the email: ");

        model.addUsers(new User(username, password, email));
        view.showMessages("User created successfully");
    }

    private void consultUser() {
        String username = view.getInput("Introduce the username to consult:");
        User user = model.getUserByUsername(username);
        if (user != null) {
            view.printUserDetails(user);
        } else {
            view.showMessages("User not found");
        }
    }

    public void modifyUser() {
        String username = view.getInput("Introduce the username to modify:");
        User user = model.getUserByUsername(username);
        if (user != null) {
            String newEmail = view.getInput("Introduce the new email(actual email: " + user.getEmail() + "): ");
            user.setEmail(newEmail);
            view.showMessages("User modified successfully");
        } else {
            view.showMessages("User not found");
        }
    }

    private void deleteUser() {
        String username = view.getInput("Introduce the username to delete:");
        User user = model.getUserByUsername(username);
        if (user != null) {
            model.deleteUser(user);
            view.showMessages("User deleted successfully");
        } else {
            view.showMessages("User not found");
        }
    }
}
