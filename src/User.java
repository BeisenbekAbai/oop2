public class User {
    protected int userID;
    protected String name;
    protected String email;
    protected String password;
    protected boolean loggedIn;

    public User(int userID, String name, String email, String password) {
        this.userID = userID;
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public boolean isLoggedIn(String email, String password) {
        if (this.email.equals(email) && this.password.equals(password)) {
            System.out.println("User " + userID + " has been successfully logged in.");
            System.out.println(" ");
            loggedIn = true;
            return true;
        }
        return false;
    }

    public void logout() {
        loggedIn = false;
    }

    public void displayDetails(String password) {
        if (password.equals(this.password)) {
            System.out.println(" ");
            System.out.println("Account details are:");
            System.out.println("Name: " + name);
            System.out.println("Email: " + email);
            System.out.println("UserID: " + userID);
            System.out.println(" ");
        }
    }

    public void getEmail(String password) {
        if (password.equals(this.password)) {
            System.out.println("User's email: " + email);
        }
    }
}
