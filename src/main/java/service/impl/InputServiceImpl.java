package service.impl;

import service.InputService;
import service.ParseService;

import java.util.Scanner;

public class InputServiceImpl implements InputService {

    private Scanner scanner = new Scanner(System.in);
    private ParseService parseService = new ParseServiceImpl();

    @Override
    public String inputText(String message) {
        System.out.println(message);
        String answer = scanner.nextLine();
        return parseService.getString(answer);
    }

    @Override
    public int inputNumber(String message) {
        System.out.println(message);
        String answer = scanner.nextLine();
        return parseService.getInt(answer);
    }
}
