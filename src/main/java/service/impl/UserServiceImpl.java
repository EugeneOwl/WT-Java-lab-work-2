package service.impl;

import dao.UserDao;
import dao.impl.UserDaoImpl;
import entity.user.User;
import service.UserService;

public class UserServiceImpl implements UserService {

    private UserDao userDao = new UserDaoImpl();

    @Override
    public User getUser(String name) throws Exception {
        return userDao.getUser(name);
    }
}
