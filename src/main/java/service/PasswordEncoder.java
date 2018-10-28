package service;

public interface PasswordEncoder {

    /**
     * Returns hash code for given password.
     *
     * @param rawPassword - password in pure form
     * @return hash code for given password
     */
     String encodePassword(String rawPassword);

    /**
     * Checks up whether password match the hash code or no.
     *
     * @param rawPassword  - password in pure form
     * @param hashPassword - password in hash form
     * @return true if password match, otherwise false
     */
     boolean doesPasswordMatch(String rawPassword, String hashPassword);
}
