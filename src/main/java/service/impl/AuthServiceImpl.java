package service.impl;

import entity.user.User;
import org.springframework.security.crypto.password.PasswordEncoder;
import service.AskService;
import service.AuthService;
import service.SessionService;
import service.UserService;

import java.util.Objects;

import static constant.Messages.PASSWORD_DOES_NOT_MATCH;
import static constant.Messages.USERNAME_DOES_NOT_EXIST;

public class AuthServiceImpl implements AuthService {

    private AskService askService = new AskServiceImpl();
    private PasswordEncoder passwordEncoder = new PasswordEncoderImpl();
    private UserService userService = new UserServiceImpl();
    private SessionService sessionService = new SessionServiceImpl();

    @Override
    public void authenticate() throws Exception {
        String username = askService.askForUsername();
        User user = userService.getUser(username);

        if (Objects.isNull(user)) {
            System.out.println(USERNAME_DOES_NOT_EXIST);
            return;
        }

        String password = askService.askForPassword();
        if (passwordEncoder.matches(password, user.getPassword())) {
            sessionService.setUpCurrentUser(user);
            return;
        }
        System.out.println(PASSWORD_DOES_NOT_MATCH);
    }

    @Override
    public void logout() {
        sessionService.setUpCurrentUser(null);
    }
}
