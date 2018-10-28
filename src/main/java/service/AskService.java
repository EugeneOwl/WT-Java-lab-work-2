package service;

public interface AskService {

    /**
     * Outputs message asking for input of menu option.
     * Returns input numeric or null if input does not match.
     *
     * @return input numeric
     */
     int askForMenuOption();

    /**
     * Outputs message asking for input of username.
     * Returns input text.
     *
     * @return input text
     */
     String askForUsername();

    /**
     * Outputs message asking for input of password.
     * Returns input text.
     *
     * @return input text
     */
     String askForPassword();

    /**
     * Outputs message asking for input of book title.
     * Returns input text.
     *
     * @return input text
     */
     String askForBookTitle();

    /**
     * Outputs message asking for input of book description.
     * Returns input text.
     *
     * @return input text
     */
     String askForBookDescription();

    /**
     * Outputs message asking for input of book type.
     * Returns input text.
     *
     * @return input text
     */
     String askForBookType();

    /**
     * Outputs message asking for input of book identifier.
     * Returns input text.
     *
     * @return input text
     */
     String askForBookId();

    /**
     * Outputs message asking to update book.
     */
     void askToUpdateBook();
}
