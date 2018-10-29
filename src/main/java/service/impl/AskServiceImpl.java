package service.impl;

import service.AskService;
import service.InputService;

import static constant.Questions.*;

public class AskServiceImpl implements AskService {

    private InputService inputService = new InputServiceImpl();

    @Override
    public int askForMenuOption() {
        return inputService.inputNumber(ASK_FOR_MENU_OPTION);
    }

    @Override
    public String askForUsername() {
        return inputService.inputText(ASK_FOR_USERNAME);
    }

    @Override
    public String askForPassword() {
        return inputService.inputText(ASK_FOR_PASSWORD);
    }

    @Override
    public String askForBookTitle() {
        return inputService.inputText(ASK_FOR_BOOK_TITLE);
    }

    @Override
    public String askForBookDescription() {
        return inputService.inputText(ASK_FOR_BOOK_DESCRIPTION);
    }

    @Override
    public String askForBookType() {
        return inputService.inputText(ASK_FOR_BOOK_TYPE);
    }

    @Override
    public int askForBookId() {
        return inputService.inputNumber(ASK_FOR_BOOK_ID);
    }
}
