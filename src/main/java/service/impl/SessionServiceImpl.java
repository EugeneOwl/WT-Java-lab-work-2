package service.impl;

import entity.user.User;
import entity.user.UserRole;
import service.SessionService;

import java.util.Objects;

import static entity.user.UserRole.ANONYMOUS;

public class SessionServiceImpl implements SessionService {

    private static User currentUser;

    @Override
    public User getCurrentUser() {
        return currentUser;
    }

    @Override
    public void setUpCurrentUser(User user) {
        currentUser = user;
    }

    @Override
    public UserRole getCurrentUserRole() {
        User user = getCurrentUser();
        if (Objects.isNull(user)) {
            return ANONYMOUS;
        }
        return user.getRole();
    }
}
