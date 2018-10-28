package service;

public interface AuthService {

    /**
     * Asks for credentials input and sets up current session user if given credentials match.
     */
    void authenticate() throws Exception;

    /**
     * Sets up current session user to null.
     */
    void logout();
}
