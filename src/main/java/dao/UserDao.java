package dao;

import entity.user.User;

public interface UserDao {

    /**
     * Returns user by his name. If no user match then returns null.
     *
     * @param name - name of needed user
     * @return - user with the given name
     */
    public User getUser(String name);
}
