package dao.impl;

import dao.UserDao;
import entity.user.User;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import service.JsonService;
import service.ParseService;
import service.impl.JsonServiceImpl;
import service.impl.ParseServiceImpl;

import java.util.ArrayList;
import java.util.List;

import static constant.Files.USERS_FILE_PATH;

public class UserDaoImpl implements UserDao {

    private JsonService jsonService = new JsonServiceImpl();
    private ParseService parseService = new ParseServiceImpl();

    @Override
    public User getUser(String name) throws Exception {
        return getAllUsers()
                .stream()
                .filter(it -> it.getName().equals(name.trim()))
                .findFirst()
                .orElse(null);
    }

    private List<User> getAllUsers() throws Exception {
        JSONArray jsonArray = jsonService.getJsonArray(USERS_FILE_PATH);
        List<User> users = new ArrayList<>();
        jsonArray.forEach(it -> users.add(getUserFromJsonObject(it)));
        return users;
    }

    private User getUserFromJsonObject(Object object) {
        JSONObject jsonObject = (JSONObject) object;
        return new User(
                parseService.getInt((String) jsonObject.get("id")),
                parseService.getString((String) jsonObject.get("name")),
                parseService.getString((String) jsonObject.get("email")),
                parseService.getUserRole((String) jsonObject.get("role")),
                parseService.getString((String) jsonObject.get("password"))
        );
    }
}
