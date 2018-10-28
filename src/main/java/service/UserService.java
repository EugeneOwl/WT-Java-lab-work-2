package service;

import entity.user.User;

public interface UserService {

    /**
     * Returns user by his name. If no user match then returns null.
     *
     * @param name - name of needed user
     * @return - user with the given name
     */
    public User getUser(String name);

    /**
     * Sets up user of current session.
     *
     * @param user - user to set up
     */
    public void setUpCurrentUser(User user);

    /**
     * Returns current session user.
     * If no user logged in then returns null.
     *
     * @return current session user
     */
    public User getCurrentUser();
}
