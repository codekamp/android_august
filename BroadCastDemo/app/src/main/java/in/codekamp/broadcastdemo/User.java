package in.codekamp.broadcastdemo;

/**
 * Created by cerebro on 29/09/16.
 */

public class User {
    private String name;
    private String email;


    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}
