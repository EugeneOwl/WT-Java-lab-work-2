package service.impl;

import service.RegexService;

public class RegexServiceImpl implements RegexService {

    @Override
    public boolean matches(String pattern, String string) {
        return string.matches("(.*)" + pattern + "(.*)");
    }
}
