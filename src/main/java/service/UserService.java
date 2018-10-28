package service;

import entity.user.User;

public interface UserService {

    /**
     * Returns user by his name. If no user matches then returns null.
     *
     * @param name - name of needed user
     * @return - user with the given name
     */
    User getUser(String name) throws Exception;
}
