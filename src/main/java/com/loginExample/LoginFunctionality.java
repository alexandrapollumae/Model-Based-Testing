package com.loginExample;

public class LoginFunctionality {
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

    public LoginFunctionality() {
        loggedIn = false;
        password_ = "õigeParool123";
        username_ = "Kasutajanimi";
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
        LoginFunctionality test  = new LoginFunctionality();
        test.inputCredentials("Kasutajanimi", "õigeParool123");
        System.out.println(test.isLoggedIn());
        test.logOut();
        System.out.println(test.isLoggedIn());

        LoginFunctionality vale = new LoginFunctionality();
        vale.inputCredentials("kasutaja", "parool");
        System.out.println(vale.isLoggedIn());
    }
}
