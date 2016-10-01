package in.codekamp.broadcastdemo.Events;

import in.codekamp.broadcastdemo.User;

/**
 * Created by cerebro on 29/09/16.
 */

public class LoginStatusChangedEvent {

    Boolean isLoggedIn;
    User user;

    public LoginStatusChangedEvent(Boolean isLoggedIn) {
        this(isLoggedIn, null);
    }

    public LoginStatusChangedEvent(Boolean isLoggedIn, User user) {
        this.isLoggedIn = isLoggedIn;
        this.user = user;
    }

    public Boolean isLoggedIn() {
        return isLoggedIn;
    }

    public User getUser() {
        return user;
    }
}
