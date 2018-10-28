package service.impl;

import service.AskService;
import service.InputService;

import static constant.Questions.ASK_FOR_MENU_OPTION;
import static constant.Questions.ASK_FOR_PASSWORD;
import static constant.Questions.ASK_FOR_USERNAME;

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
        return null;
    }

    @Override
    public String askForBookDescription() {
        return null;
    }

    @Override
    public String askForBookType() {
        return null;
    }

    @Override
    public String askForBookId() {
        return null;
    }

    @Override
    public void askToUpdateBook() {

    }
}
