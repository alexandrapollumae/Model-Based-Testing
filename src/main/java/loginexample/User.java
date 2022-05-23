package loginexample;

public class User {
    private boolean loggedIn;
    String password_;
    String username_;
    String output;

    public boolean isLoggedIn() {
        return loggedIn;
    }

    public void setLoggedIn(boolean loggedIn) {
        this.loggedIn = loggedIn;
    }

    public User() {
        loggedIn = false;
        username_ = "Kasutajanimi";
        password_ = "õigeParool123";
        output = "Välja logitud";
    }

    public void inputCredentials(String username, String password){
        if (!username.equals(username_)) {
            output = "Vale kasutajanimi!";
        }
        else if (!password.equals(password_)) {
            output = "Vale parool!";
        } else {
            output = "Sisse logitud";
            loggedIn = true;
        }
        System.out.println(output);
    }

    public void logOut() {
        loggedIn = false;
        System.out.println("Välja logitud");
    }

    public static void main(String[] args) {
        User test  = new User();
        test.inputCredentials("Kasutajanimi", "õigeParool123");
        System.out.println(test.isLoggedIn());
        test.logOut();
        System.out.println(test.isLoggedIn());

        User vale = new User();
        vale.inputCredentials("kasutaja", "parool");
        System.out.println(vale.isLoggedIn());
    }
}
