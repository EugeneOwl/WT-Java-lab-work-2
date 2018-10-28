package service;

public interface RegexService {

    /**
     * Checks up does pattern matches string.
     *
     * @param pattern - pattern
     * @param string - string to matches
     * @return true if matches, otherwise false
     */
    boolean matches(String pattern, String string);
}
