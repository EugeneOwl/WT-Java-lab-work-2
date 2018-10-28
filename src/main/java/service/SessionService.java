package service;

import entity.user.User;
import entity.user.UserRole;

public interface SessionService {

    /**
     * Returns current session user.
     * If no user logged in then returns null.
     *
     * @return current session user
     */
    User getCurrentUser();

    /**
     * Sets up user of current session.
     *
     * @param user - user to set up
     */
    void setUpCurrentUser(User user);

    /**
     * Returns current session user role. If not user in session then returns {@link UserRole#ANONYMOUS}.
     *
     * @return current session user role
     */
    UserRole getCurrentUserRole();
}
