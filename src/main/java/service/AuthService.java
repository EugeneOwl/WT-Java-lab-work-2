package service;

public interface AuthService {

    /**
     * Validates user credentials and determines whether they correct or no.
     *
     * @param name - username
     * @param password - password of user in pure form
     *
     * @return true if credentials are correct and false if username does not exist or password does not match or both
     */
    boolean authenticate(String name, String password);
}
